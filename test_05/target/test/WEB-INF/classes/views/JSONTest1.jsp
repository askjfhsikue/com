<%--
  Created by IntelliJ IDEA.
  User: EDZ
  Date: 2019/7/17
  Time: 10:10
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
    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8">
    <script type="text/javascript" src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>statics/js/json2.js"/>
    <script type="text/javascript">
        $(document).ready(function () {
            test();
        });
        function test() {
            $.ajax("<%=basePath%>json/test",
            {
                datatype:"json",
                    type:"post",
                contentType:"application/json",
                data:JSON.stringify({id:1,name:"ajax test"}),
                async:true,
                success:function (data) {
                    console.log(data);
                    $("#id").html(data.id);
                    $("#name").html(data.name);
                    $("#author").html(data.author);
                },
                error:function () {
                    alert("数据发送失败");
                }
            });
        }
    </script>
</head>
<body>
编号：<span id="id"/>
书名：<span id="name"/>
作者：<span id="author"/>
</body>
</html>
