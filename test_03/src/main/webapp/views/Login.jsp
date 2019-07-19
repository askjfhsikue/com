<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/12/21
  Time: 22:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>商城登录</title>
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="">
    <meta name="keywords" content="">
    <meta name="viewport"
          content="width=device-width, initial-scale=1">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <meta name="mobile-web-app-capable" content="yes">
    <link rel="stylesheet" href="../assets/css/amazeui.min.css">
    <link rel="stylesheet" href="../assets/css/petshow.css">
    <link rel="stylesheet" href="../assets/css/animate.min.css">
    <script src="../assets/js/jquery.min.js"></script>
    <script src="../assets/js/amazeui.min.js"></script>
    <script src="../assets/js/countUp.min.js"></script>
    <script src="../assets/js/amazeui.lazyload.min.js"></script>
    <style>
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
<body>
<div class="header">
    <div class="am-g">
        <h1>商&nbsp;&nbsp;城</h1>
    </div>
    <hr />
</div>
<div class="am-g">
    <div class="am-u-lg-6 am-u-md-8 am-u-sm-centered">
        <h3>登录</h3>
        <hr>
        <br>
        <br>

        <form class="am-form">
            <label for="username">用户名:</label>
            <input type="text" name="username" id="username" value="">
            <br>
            <label for="password">密码:</label>
            <input type="password" name="" id="password" value="">
            <br>
            <br />
            <div class="am-cf">
                <input type="button" id="login" value="登 录" class="am-btn am-btn-danger am-round am-btn-sm am-fl">
                <input type="button" id="sign" value="注 册" class="am-btn am-btn-default am-round am-btn-sm am-fr">
            </div>
        </form>
        <br/><br/><br/>
        <br/><br/><br/>
        <br/><br/><br/>
        <br/><br/><br/>

        <hr>
    </div>
</div>

</body>
</html>


