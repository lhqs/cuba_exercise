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
    $.get({
    url: 'http://localhost:8080/app/rest/v2/services/tuzhuang_UserService/getUserList?list=random',
    headers: {
        'Authorization': 'Bearer ' + oauthToken,
        'Content-Type': 'application/x-www-form-urlencoded'
    },
    success: function (data) {
            $('#login').hide();
            $('#main').show();
            console.log('data', data);
            
        }
    });
}

function scanAction() {
    
    $('#login').hide();
    $('#scan').hide();
    $('#content').show();

    $.get({
        url: 'http://localhost:8080/app/rest/v2/services/tuzhuang_WorkOrderService/GetWorkOrderBySerial?serial=000001',
        // url: 'http://localhost:8080/app/rest/v2/queries/tuzhuang_WorkOrder/workOrder?serial=000001',
        headers: {
            'Authorization': 'Bearer ' + oauthToken,
            'Content-Type': 'application/x-www-form-urlencoded'
        },
        success: function (data) {
                console.log('data', data);
                let startDate = data.startTime.date; 
                let startTime = data.startTime.time; 
                let endDate = data.endTime.date;
                let endTime = data.endTime.time;
                $('#item1').append(data.serial);
                $('#item2').append(data.definition);
                $('#item3').append(data.productName);
                $('#item4').append(data.planNum);
                $('#item5').append(data.definition);
                $('#item6').append(startDate.year+'-'+startDate.month+"-"+startDate.day+" " + startTime.hour + ":"+startTime.minute);
                $('#item7').append(endDate.year + "-" + endDate.month+"-"+endDate.day+" " + endTime.hour+ ":"+endTime.minute);

                
            }
        })

}