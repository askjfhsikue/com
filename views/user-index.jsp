<%--
  Created by IntelliJ IDEA.
  User: danchun
  Date: 2018/12/1
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--<%--%>
<%--  String path = request.getContextPath();--%>
<%--  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";--%>
<%--%>--%>
<!doctype html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="description" content="">
  <meta name="keywords" content="">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
  <title>兰陵学馆</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="Cache-Control" content="no-siteapp"/>
  <link rel="icon" type="image/png" href="assets/i/favicon.png">
  <meta name="mobile-web-app-capable" content="yes">

  <meta name="apple-mobile-web-app-capable" content="yes">
  <meta name="apple-mobile-web-app-status-bar-style" content="black">
  <meta name="apple-mobile-web-app-title" content="Amaze UI"/>
  <link rel="apple-touch-icon-precomposed" href="assets/i/app-icon72x72@2x.png">
  <meta name="msapplication-TileImage" content="views/assets/i/app-icon72x72@2x.png">
  <meta name="msapplication-TileColor" content="#0e90d2">

  <link rel="icon" type="image/png" href="views/assets/i/book.png">
  <link rel="stylesheet" href="views/assets/css/amazeui.min.css">
  <%--<link rel="stylesheet" href="views/assets/css/admin.css">--%>
  <link rel="stylesheet" href="views/assets/css/app.css">

  <script src="views/assets/js/jquery.min.js"></script>
  <script src="views/assets/js/amazeui.min.js"></script>
</head>

<body id="blog">

<header class="am-g am-g-fixed blog-fixed blog-text-center blog-header">
    <div class="am-u-sm-8 am-u-sm-centered">
        <!-- <img width="200" src="http://s.amazeui.org/media/i/brand/amazeui-b.png" alt="Amaze UI Logo"/> -->
        <img width="50" src="views/assets/i/favicon.png" alt="UI Logo"/>
        <img width="200" src="views/assets/i/wordLogo.png" alt="UI Logo"/>

        <h2 class="am-hide-sm-only">君子曰：学不可以已。 --《劝学》 荀子</h2>
    </div>
</header>
<hr>
<!-- nav start -->
<nav class="am-g am-g-fixed blog-fixed blog-nav">

  <div class="am-collapse am-topbar-collapse" id="blog-collapse">
    <ul class="am-nav am-nav-pills am-topbar-nav">
      <li class="am-active"><a href="userPage/">首页</a></li>
      <li class="am-dropdown" data-am-dropdown>
        <a class="am-dropdown-toggle" data-am-dropdown-toggle href="javascript:;">
          图书种类 <span class="am-icon-caret-down"></span>
        </a>
        <ul class="am-dropdown-content">
          <c:if test="${types != null}">
            <c:forEach var="type" items="${types}">
              <li><a href="userPage/bookPage?bookType=${type}">${type}</a></li>
            </c:forEach>
          </c:if>
        </ul>
      </li>
    </ul>
	<ul class="am-nav  am-topbar-right am-nav am-nav-pills">
	<li><a class="am-btn am-btn-warning" href="userPage/shoppingCart">
      <i class="am-icon-shopping-cart"></i>&nbsp;购物车</a>
	</li>

      <li class="am-dropdown" data-am-dropdown>
        <a class="am-dropdown-toggle" data-am-dropdown-toggle href="javascript:;">
          <i class="am-icon-user"></i>&nbsp;${username}<span class="am-icon-caret-down"></span>
        </a>
        <ul class="am-dropdown-content">
          <li><a href="userPage/getOrder">查看订单</a></li>
          <li><a href="Admin/outLogin">退出登录</a></li>
        </ul>
      </li>
	</ul>
  </div>
</nav>
<hr>
<!-- nav end -->

<style>
   .gallery-list li {
  padding: 10px;
}

.gallery-list a {
  color: #666;
}

.gallery-list a:hover {
  color: #3bb4f2;
}
.book-btn button{
    width: 49%;
}
</style>

<!-- content srart -->
<div class="am-g am-g-fixed blog-fixed">
    <ul class="am-avg-sm-2 am-avg-md-4 am-avg-lg-4 am-margin gallery-list">

      <c:if test="${books != null}">
      <c:forEach var="book" items="${books}">
        <li>
          <a href="#">
            <img class="am-img-thumbnail am-img-bdrs" src="${book.image}" alt=""/>
          </a>
            <div class="gallery-title">${book.bookName}</div>
            <div class="gallery-list">${book.introduction}</div>
            <div class="gallery-desc">${book.author}</div>
          <button type="button" class="am-btn am-btn-default am-btn-sm"><i class="am-icon-buysellads"></i>&nbsp;直接下单</button>
          <button type="button" class="am-btn am-btn-warning am-btn-sm"><i class="am-icon-shopping-cart"></i>&nbsp;加入购物车</button>
        </li>
      </c:forEach>
    </c:if>
    </ul>
</div>





</body>
</html>