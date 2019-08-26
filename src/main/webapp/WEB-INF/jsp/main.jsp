<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/17
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>酒店预订</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.1.0/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/popper.js/1.12.5/umd/popper.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/4.1.0/js/bootstrap.min.js"></script>
    <style>
        /* Make the image fully responsive */
        .carousel-inner img {
            width: 100%;
            height: 100%;
        }
    </style>
</head>
<body>


<div class="container-fluid">

    <%@include file="lay/header.jsp" %>


    <%--轮播图--%>
    <div id="demo" class="carousel slide" data-ride="carousel">

        <!-- 指示符 -->
        <ul class="carousel-indicators">
            <li data-target="#demo" data-slide-to="0" class="active"></li>
            <li data-target="#demo" data-slide-to="1"></li>
            <li data-target="#demo" data-slide-to="2"></li>
        </ul>

        <!-- 轮播图片 -->
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img src="../../img/main1.jpg">
            </div>
            <div class="carousel-item">
                <img src="../../img/main2.jpg">
            </div>
            <div class="carousel-item">
                <img src="../../img/main3.jpg">
            </div>
        </div>
        <!-- 左右切换按钮 -->
        <a class="carousel-control-prev" href="#demo" data-slide="prev">
            <span class="carousel-control-prev-icon"></span>
        </a>
        <a class="carousel-control-next" href="#demo" data-slide="next">
            <span class="carousel-control-next-icon"></span>
        </a>

    </div>


    <%--房间预览--%>
    <div class="row clearfix">

        <div class="col-md-12 column">
            <h3 class="text-center">
               <br>
                房间推荐
            </h3>
            <br/>
        </div>
    </div>
    <div class="row">
        <div class="col">
            <a href="/user/room/showRoomByCatalog?catalogId=12"><img src="../../img/豪华客房.jpg" class="img-fluid"></a>
            <h4 class="text-center">豪华客房</h4>
        </div>
        <div class="col">
            <a href="/user/room/showRoomByCatalog?catalogId=13"> <img src="../../img/奢华客房.jpg" class="img-fluid"></a>
            <h4 class="text-center">奢华客房</h4>
        </div>
        <div class="col">
            <a href="/user/room/showRoomByCatalog?catalogId=14">   <img src="../../img/行政客房.jpg" class="img-fluid"></a>
            <h4 class="text-center">行政客房</h4>
        </div>
    </div>
    <div class="row">
        <div class="col">
            <a href="/user/room/showRoomByCatalog?catalogId=15">  <img src="../../img/豪华套房.jpg" class="img-fluid"></a>
            <h4 class="text-center">豪华套房</h4>
        </div>
        <div class="col">
            <a href="/user/room/showRoomByCatalog?catalogId=16">    <img src="../../img/奢华套房.jpg" class="img-fluid"></a>
            <h4 class="text-center">奢华套房</h4>
        </div>
        <div class="col">
            <a href="/user/room/showRoomByCatalog?catalogId=17">  <img src="../../img/行政套房.jpg" class="img-fluid"></a>
            <h4 class="text-center">行政套房</h4>
        </div>
    </div>


    <%--其他城市--%>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <h3 class="text-left">
                <br>
                其他城市>>
            </h3>
            <br/>
        </div>
    </div>
    <div class="row">
        <div class="col-sm-3">
            <img src="../../img/上海.jpg" class="img-fluid">
        </div>
        <div class="col-sm-3">
            <img src="../../img/云南.jpg" class="img-fluid">
        </div>
        <div class="col-sm-3">
            <img src="../../img/北京.jpg" class="img-fluid">
        </div>
        <div class="col-sm-3">
            <img src="../../img/成都.jpg" class="img-fluid">
        </div>
    </div>
    <div class="row">
        <div class="col-sm-3">
            <img src="../../img/江苏.jpg" class="img-fluid">
        </div>
        <div class="col-sm-3">
            <img src="../../img/浙江.jpg" class="img-fluid">
        </div>
        <div class="col-sm-3">
            <img src="../../img/海南.jpg" class="img-fluid">
        </div>
        <div class="col-sm-3">
            <img src="../../img/香港.jpg" class="img-fluid">
        </div>
    </div>
</div>
<%@include file="lay/footer.jsp" %>
</body>
</html>
