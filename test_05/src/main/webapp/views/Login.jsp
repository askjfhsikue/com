<%--
  Created by IntelliJ IDEA.
  User: EDZ
  Date: 2019/7/9
  Time: 16:13
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
<form action="<%=basePath%>user/checkLogin" method="post">
    <input type="usernaame" name="username"><br>
    <input type="password" name="password"><br>
    <input type="submit">
</form>

</body>
</html>
