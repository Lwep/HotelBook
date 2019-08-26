<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/18
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>填写订单信息</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container-fluid">
    <%@include file="../lay/header.jsp" %>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <h3 class="text-center">
                填写您的预订信息
            </h3>
            <br/>

        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <form role="form" action="/user/reservation/addByUser" method="post">
                <div class="form-group">
                    <input type="hidden" name="roomNum" value="${roomNum}"/>
                </div>
                <div class="form-group">
                    <label >预订天数</label>
                    <input type="number" class="form-control" name="days" required />
                </div>
                <div class="form-group">
                    <label >入住时间</label>
                    <input type="datetime-local" class="form-control" name="checkInTime" required />
                </div>
                <div class="form-group">
                    <label >入住人姓名</label>
                    <input type="text" class="form-control" required name="checkInName" />
                </div>
                <div class="form-group">
                    <label >联系电话</label>
                    <input type="number" class="form-control" name="checkInPhone" required />
                </div>
                <button type="submit" class="btn btn-default">预订</button>
                &nbsp;&nbsp;
                <a href="/user/room/detailed?roomNum=${roomNum}">返回上一页</a>
            </form>
        </div>
    </div>
</div>
</body>
</html>
