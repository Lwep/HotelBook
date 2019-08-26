<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/18
  Time: 11:26
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
                    <td>
                        <c:if test="${room.roomStatus==1}">
                            未预定
                        </c:if>
                        <c:if test="${room.roomStatus!=1}">
                            已被预定
                        </c:if>
                    </td>
                </tr>
                </tbody>
            </table>

                    <p>房间预览图</p>
                    <div class="col-md-12 column">
                        <img alt="房间预览图" src="/upload/room/primary/${room.primaryPhoto}" style="height: 500px"/>
                        &nbsp&nbsp&nbsp&nbsp
                        <div class="btn-group" role="group" aria-label="...">
                            <c:if test="${room.roomStatus==1}">
                                <a href="/user/reservation/order?roomNum=${room.roomNum}">  <button type="button" class="btn btn-default">预定</button></a>
                            </c:if>
                            <c:if test="${room.roomStatus!=1}">
                            </c:if>
                        </div>
                    </div>



        </div>
    </div>
</div>
<body>

</body>
</html>
