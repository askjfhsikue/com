<%--
  Created by IntelliJ IDEA.
  User: EDZ
  Date: 2019/7/22
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=basePath%>user/register" method="post">
    <input type="usernaame" name="username"><br>
    <input type="password" name="password"><br>
    <input type="submit">
</form>
<div class="form-group">
    <div class="input-icon">
        <i class="fa fa-picture-o"></i>
        <input class="form-control" id="verifyCode" name="verifyCode" placeholder="验证码" maxlength="4">
        <img src="${pageContext.request.contextPath }/user/getVerifyCode" width="110" height="34" id="verifyCodeImage" onclick="javascript:changeImage();">
    </div>
</div>
</body>
</html>