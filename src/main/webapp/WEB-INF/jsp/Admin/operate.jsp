<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/18
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>管理员操作</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <h3 class="text-center">
                管理员操作界面
                <br>
                <br>
                员工姓名:${admin.realName}

            </h3>
        </div>
    </div>

<br>
    <br>

    <div class="row clearfix">
        <div class="col-md-12 column" style="text-align: center;">
            <a href="/admin/reservation/doShowAllReservation"> <button type="button" class="btn btn-primary btn-lg">处理订单</button></a>
        </div>
        <br>

        <br>
        <div class="col-md-12 column" style="text-align: center;">
            <a href="/super/toSuper"> <button type="button" class="btn btn-primary btn-lg">超级管理员</button></a>
        </div>

    </div>
</div>
<%@include file="../lay/footer.jsp" %>
</body>
</html>
