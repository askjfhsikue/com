<%--
  Created by IntelliJ IDEA.
  User: EDZ
  Date: 2019/7/16
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>测试JSON格式数据</title>
    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8">
    <script type="text/javascript" src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <script type="text/javascript">
        $("#login").submit(function (){
            e.preventDefault();
            sendxml();
        });
        function sendxml() {
            let username=$("#username")[0].value;
            let password=$("#password")[0].value;
            console.log(username + " : " + password);
            if(username!=""||password!="") {
                let json_data = {
                    "username": username,
                    "password": password
                };
            }
                        //js对象转换成JSON字符串
                        let jason_str = JSON.stringify(json_data);
                        $.ajax("<%=basePath%>user/checkLogin",
                            {
                                <%--url:"<%=basePath%>suer/checkLogin",--%>
                                type: "post",
                                datatype: "json",
                                contentType: "application/json; charset=utf-8",
                                async: true,
                                data: jason_str,
                                success:function (data) {
                                    if(data.status==1){

                                    }
                                }
                            });

        }
    </script>
</head>
<body>
<form id="demo">
 用户名：   <input type="usernaame" name="username"><br>
 密  码：   <input type="password" name="password"><br>
<%--    <button id="login" value="登陆"></button>--%>
    <input id="login" type="text" value="登陆">
<%--    <input id="sign" type="submit" value="注册">--%>
</form>

<%--<script>--%>
<%--    $("#login").click(function () {--%>
<%--        let username = $("#username")[0].value;--%>
<%--        let password = $("#password")[0].value;--%>

<%--        if (username != "" && password != "") {--%>

<%--            console.log(username + " : " + password);--%>

<%--            let json_data = {--%>
<%--                "username": username,--%>
<%--                "password": password--%>
<%--            };--%>

<%--            //js对象转换成JSON字符串--%>
<%--            let jason_str = JSON.stringify(json_data);--%>

<%--            console.log(jason_str);--%>

<%--            $.ajax({--%>
<%--                url: "<%=basePath%>user/checkLogin",--%>
<%--                cache: true,--%>
<%--                type: "post",--%>
<%--                datatype: "json",--%>
<%--                contentType: "application/json; charset=utf-8",--%>
<%--                data: jason_str,--%>

<%--                success: function (data) {--%>
<%--                    console.log(data.status);--%>
<%--                    if (data.status == true) {--%>
<%--                        console.log(data.message);--%>
<%--                        &lt;%&ndash;if (data.identity==1) {&ndash;%&gt;--%>
<%--                        &lt;%&ndash;    &lt;%&ndash;window.location.href = "<%=basePath%>product/products";&ndash;%&gt;&ndash;%&gt;--%>
<%--                        &lt;%&ndash;}else if (data.identity==2) {&ndash;%&gt;--%>
<%--                        &lt;%&ndash;    &lt;%&ndash;window.location.href = "<%=basePath%>BusinessPage/PersonalCenter";&ndash;%&gt;&ndash;%&gt;--%>
<%--                        &lt;%&ndash;}else if(data.identity==3){&ndash;%&gt;--%>
<%--                        &lt;%&ndash;    &lt;%&ndash;window.location.href = "<%=basePath%>adminPage/categoryCharge";&ndash;%&gt;&ndash;%&gt;--%>
<%--                        &lt;%&ndash;}&ndash;%&gt;--%>

<%--                    } else {--%>
<%--                        alert(data.message);--%>
<%--                        location.reload();--%>
<%--                    }--%>
<%--                },--%>
<%--                error: function (data) {--%>
<%--                    console.log(data);--%>
<%--                    alert("请求出错，请检查网络或服务器是否开启");--%>
<%--                },--%>
<%--            });--%>
<%--        }else {--%>
<%--            alert("请填写正确的用户名和密码");--%>
<%--        }--%>
<%--    });--%>

<%--    $("#sign").click(function () {--%>
<%--        window.location.href = "<%=basePath%>adminPage/register";--%>
<%--    });--%>
<%--    $("body").keydown(function() {--%>
<%--        if (event.keyCode == "13") {//keyCode=13是回车键--%>
<%--            $('#login').click();--%>
<%--        }--%>
<%--    });--%>
<%--</script>--%>
</body>
</html>
