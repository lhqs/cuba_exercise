var oauthToken = null;

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
            oauthToken = data.access_token;
            $('#beforePage').hide();
            loadRecent();
        }
    })
}

function loadRecent() {
    console.info("now------");
    $.get({
    url: 'http://localhost:8080/app/rest/v2/services/tuzhuang_UserService/getUserList?list=random',
    headers: {
        'Authorization': 'Bearer ' + oauthToken,
        'Content-Type': 'application/x-www-form-urlencoded'
    },
    success: function (data) {
            $('#mainContent').show();
            console.log('data', data);
            $('#contentZone').append( data[0].username + "--- " + data[0].createTime  );
            location.href='main.html'
        }
    });
}

var pieChartMiddle = echarts.init(document.getElementById('pieChartMiddle'));
var pieChart = echarts.init(document.getElementById('pieChart'));

let pieData = null
drawPieChart(pieData);
draw_bar_chart(pieData);


function drawPieChart( dataArray ){
    var pieOption = {
        title : {
            text: '标题',
            subtext: '纯属虚构',
            x:'center'
        },
        tooltip : {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            left: 'left',
            data: ['项目1','项目2','项目3','项目4','项目5']
        },
        series : [
            {
                name: '访问来源',
                type: 'pie',
                radius : '55%',
                center: ['50%', '60%'],
                data:[
                    {value:335, name:'项目1'},
                    {value:310, name:'项目2'},
                    {value:234, name:'项目3'},
                    {value:135, name:'项目4'},
                    {value:1548, name:'项目5'}
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
    pieChartMiddle.setOption(pieOption);
}

function draw_bar_chart(dataArray) {
    var option_bar_chart = {
        textStyle: {
            color: '#f2b04a'
        },
        grid: {
            left: '10%',
            right: '4%',
            bottom: '10%',
            containLabel: true
        },
        tooltip: {
            trigger: 'axis',
            axisPointer: {
                type: 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
            },
            formatter: function (par) {
                return "得分:" + par[0].data;
            }
        },
        dataZoom: [
            {
                type: 'inside'
            }
        ],
        xAxis: {
            type: 'category',
            data: ['条目1', '条目2', '条目3', '条目4', '条目5', '条目6', '条目7'],
            axisLabel: {
                show: true,
                textStyle: {
                    color: '#fff'
                },
                interval: 0
            }
        },
        yAxis: {
            type: 'value',
            name: '得分',
            axisLabel: {
                show: false,
                textStyle: {
                    color: '#fff'
                }
            },
            splitLine: {
                show: false
            },
            axisLine: {
                show: false
            },
            axisTick: {
                show: false
            }
        },
        series: [{
            type: 'bar',
            barWidth: 20,//柱图宽度
            itemStyle: {
                normal: {
                    barBorderRadius: 6,
                    color: {
                        type: 'linear',
                        x: 0,
                        y: 0,
                        x2: 0,
                        y2: 1,
                        colorStops: [{
                            offset: 0, color: '#fbf100' // 0% 处的颜色
                        }, {
                            offset: 1, color: '#ffc45c' // 100% 处的颜色
                        }],
                        globalCoord: true
                    },
                    label: {
                        show: true,
                        position: 'top',
                        textStyle: {
                            color: '#cdcdcd'
                        },
                        formatter: function (params) {
                            if (params.value === 0) {
                                return '';
                            } else {
                                return params.value;
                            }
                        }
                    }
                }
            },
            data: [31,34,71,12,46,34,62]

        }]
    };
    pieChart.setOption(option_bar_chart);
}
