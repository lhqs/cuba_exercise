// index.js
function login() {
    var userLogin = $('#loginField').val();
    var userPassword = $('#passwordField').val();
    $.post({
        url: 'http://localhost:8080/app/rest/v2/oauth/token',
        headers: {
            'Authorization': 'Basic Y2xpZW50OnNlY3JldA==',
            'Content-Type': 'application/x-www-form-urlencoded'
        },
        dataType: 'json',
        data: {grant_type: 'password', username: userLogin, password: userPassword},
        success: function (data) {
            let oauthToken = data.access_token;
            document.cookie = oauthToken;
            $('#beforePage').hide();
            location.href='main.html';
        }
    })
}

loadDashData();
loadTableData();

function loadDashData() {
    $.get({
        url: 'http://localhost:8080/app/rest/v2/services/tuzhuang_DashboardService/numList',
        headers: {
            'Authorization': 'Bearer ' + document.cookie,
            'Content-Type': 'application/x-www-form-urlencoded'
        },
        success: function (data) {
            let result = data[1]/data[0] * 100;
            $('#rate').append(result + '%');
            drawPieChart(data);
        }
    });
}

function loadTableData() {
    $.get({
        url: 'http://localhost:8080/app/rest/v2/queries/tuzhuang_WorkOrder/workOrderStatus',
        headers: {
            'Authorization': 'Bearer ' + document.cookie,
            'Content-Type': 'application/x-www-form-urlencoded'
        },
        success: function (data) {
            for (let i = 0; i < data.length; i++) {
                $('#tbody1').append('<tr><td>' + data[i].serial+'</td>' + '<td>' + data[i].planNum +'</td>' + '<td>' + data[i].finishNum+'</td></tr>');
            }
        }
    });

    $.get({
        url: 'http://localhost:8080/app/rest/v2/queries/tuzhuang_Device/deviceStatus',
        headers: {
            'Authorization': 'Bearer ' + document.cookie,
            'Content-Type': 'application/x-www-form-urlencoded'
        },
        success: function (data) {
            let status = {'BROKEN': '故障', 'LEISURE': '空闲', 'REPAIR': '维修', 'WORK': '工作'};
            for (let i = 0; i < data.length; i++) {
                $('#tbody2').append('<tr><td>' + data[i].deviceName+'</td>' + '<td>' + status[data[i].deviceStatus] +'</td>' + '<td>' + data[i].workTime+'</td></tr>');
            }
        }
    });
}

let pieChart = echarts.init(document.getElementById('pieChart'));

function drawPieChart( dataArray ){
    var pieOption = {
        title : {
            text: '统计数据',
            subtext: '项目总生产进度',
            x:'center'
        },
        tooltip : {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        color: ['#2ca4cb', '#8da298'],
        legend: {
            orient: 'vertical',
            left: 'left',
            data: ['计划生产数据','当前完成数据']
        },
        series : [
            {
                name: '统计数据',
                type: 'pie',
                radius : '55%',
                center: ['50%', '60%'],
                data:[
                    {value:dataArray[0], name:'计划生产数据'},
                    {value:dataArray[1], name:'当前完成数据'},
                ],
                itemStyle: {
                    emphasis: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            }
        ]
    };
    pieChart.setOption(pieOption);
}



