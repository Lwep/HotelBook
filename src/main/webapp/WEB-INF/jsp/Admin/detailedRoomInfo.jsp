<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/18
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>详细的房间信息</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<div class="container-fluid">
    <%@include file="../lay/header.jsp" %>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <h3 class="text-center">
                客房编号<label style="color: red">${room.roomNum}</label>的详细信息
            </h3>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table">
                <thead>
                <tr>
                    <th>客房编号</th>
                    <th>面积</th>
                    <th>价格</th>
                    <th>简介</th>
                    <th>客房类型</th>
                    <th>客房状态</th>
                </tr>
                </thead>
                <tbody>
                <tr class="success">
                    <td>${room.roomNum}</td>
                    <td>${room.area}</td>
                    <td>${room.price}</td>
                    <td>${room.intro}</td>
                    <td>${room.roomCatalog.catalog}</td>
                    <td>${room.roomStatus.status}</td>
                </tr>
                </tbody>
            </table>
            <br/>

            <button><a href="/user/reservation/order?roomNum=${room.roomNum}">预订</a> </button>

        <ul>
            <li>
                客房主图
            </li>
            <li>
                <div class="col-md-12 column">
                    <img alt="140x140" src="/upload/room/primary/${room.primaryPhoto}" style="height: 140px"/>
                </div>
            </li>
            <br/>
        </ul>
    </div>
</div>
</div>
<body>

</body>
</html>
