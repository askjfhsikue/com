<%--
  Created by IntelliJ IDEA.
  User: EDZ
  Date: 2019/7/23
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="form-group">
    <div class="input-icon">
        <i class="fa fa-picture-o"></i>
        <input class="form-control" style="width:180px;" type="text" id="verifyCode" name="verifyCode" placeholder="验证码" maxlength="4">
        <img style="position: absolute;right: 0;top: 0;"  src="${pageContext.request.contextPath }/user/getVerifyCode" width="110" height="34" id="verifyCodeImage" onclick="javascript:changeImage();">
    </div>
</div>

</body>
</html>
