<%--
  Created by IntelliJ IDEA.
  User: danchun
  Date: 2018/12/1
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html class="no-js">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>兰陵学馆-用户登录</title>
    <meta name="description" content="">
    <meta name="keywords" content="">
    <meta name="viewport"
          content="width=device-width, initial-scale=1">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>

<%--    <%--%>
<%--        String path = request.getContextPath();--%>
<%--        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";--%>
<%--    %>--%>

    <link rel="icon" type="image/png" href="assets/i/book.png">
    <link rel="stylesheet" href="assets/css/amazeui.min.css">
    <link rel="stylesheet" href="assets/css/admin.css">

    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/js/amazeui.js"></script>
    <!--<script src="assets/js/handlebars.min.js"></script>-->
    <!--<script src="assets/js/amazeui.widgets.helper.js"></script>-->

    <style>
        body {
            background:url(assets/i/timg.jpg) top center no-repeat;
            background-size:cover;
        }
        .header {
            text-align: center;
        }
        .header h1 {
            font-size: 200%;
            color: #333;
            margin-top: 30px;
        }
        .header p {
            font-size: 14px;
        }
    </style>
</head>
<body background="assets/i/timg.jpg">
<div class="header">
    <div class="am-g">
        <br>
        <br>

        <img src="assets/i/tittle-1.png" style="align-content: center;"><br> <br>
        <img src="assets/i/tittle-2.PNG" style="align-content: center;">
    </div>

</div>
<br>


<div class="content1" style="margin:5% 0 13% 50px">
    <div class="am-u-lg-4 am-u-md-6 am-u-sm-centered">

        <form class="am-form">
            <label for="username">用户名:</label>
            <input required type="text" name="username" id="username" value="">
            <br>
            <label for="password">密码:</label>
            <input required type="password" name="password" id="password" value="">
            <br>
            <br>
            <div class="am-cf">
                <input type="button" id="login" value="登 录" class="am-btn am-btn-primary am-btn-sm am-fl">
                <input type="button" id="sign" value="注 册" class="am-btn am-btn-default am-btn-sm am-fr">
            </div>
        </form>
    </div>
</div>


<footer class="am-with-topbar-fixed-bottom">


</footer>

<%--<script>--%>
<%--    $("#login").click(function () {--%>
<%--        var username = $("#username")[0].value;--%>
<%--        var password = $("#password")[0].value;--%>

<%--        if (username != "" && password != "") {--%>

<%--            console.log(username + " : " + password);--%>

<%--            var json_data = {--%>
<%--                "username": username,--%>
<%--                "password": password--%>
<%--            };--%>

<%--            //js对象转换成JSON字符串--%>
<%--            var jason_str = JSON.stringify(json_data);--%>

<%--            console.log(jason_str);--%>

<%--            $.ajax({--%>
<%--                url: "Admin/checkLogin",--%>
<%--                cache: true,--%>
<%--                type: "post",--%>
<%--                datatype: "json",--%>
<%--                contentType: "application/json; charset=utf-8",--%>
<%--                data: jason_str,--%>

<%--                success: function (data) {--%>
<%--                    console.log(data.state);--%>

<%--                    if (data.state == true) {--%>
<%--                        if (data.isManager == true)--%>
<%--                            window.location.href = "adminPage/";--%>
<%--                        else--%>
<%--                            window.location.href = "userPage/";--%>
<%--                    } else {--%>
<%--                        alert(data.message);--%>
<%--                    }--%>
<%--                },--%>
<%--                error: function (data) {--%>
<%--                    console.log(data);--%>
<%--                    alert("请求出错，请检查网络或服务器是否开启");--%>
<%--                }--%>
<%--            });--%>
<%--        }else {--%>
<%--            alert("请填写正确的用户名和密码");--%>
<%--        }--%>
<%--    });--%>

<%--    $("#sign").click(function () {--%>
<%--        var username = $("#username")[0].value;--%>
<%--        var password = $("#password")[0].value;--%>


<%--        if (username != "" && password != "") {--%>
<%--            console.log(username + " : " + password);--%>

<%--            var json_data = {--%>
<%--                "username": username,--%>
<%--                "password": password--%>
<%--            };--%>

<%--            //js对象转换成JSON字符串--%>
<%--            var jason_str = JSON.stringify(json_data);--%>

<%--            console.log(jason_str);--%>

<%--            $.ajax({--%>
<%--                url: "Admin/register",--%>
<%--                cache: true,--%>
<%--                type: "post",--%>
<%--                datatype: "json",--%>
<%--                contentType: "application/json; charset=utf-8",--%>
<%--                data: jason_str,--%>

<%--                success: function (data) {--%>
<%--                    console.log(data.state);--%>
<%--                    alert(data.message);--%>
<%--                },--%>
<%--                error: function (data) {--%>
<%--                    console.log(data);--%>
<%--                    alert("请求出错，请检查网络或服务器是否开启");--%>
<%--                }--%>
<%--            });--%>
<%--        }else {--%>
<%--            alert("请填写正确的用户名和密码");--%>
<%--        }--%>
<%--    });--%>
<%--    $("body").keydown(function() {--%>
<%--        if (event.keyCode == "13") {//keyCode=13是回车键--%>
<%--            $('#login').click();--%>
<%--        }--%>
<%--    });--%>
<%--</script>--%>
</body>
</html>

