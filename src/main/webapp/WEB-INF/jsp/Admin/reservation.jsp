<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/18
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>预定订单</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <h3 class="text-center">
                <br>
                以下是用户的预定订单
            </h3>
        </div>
    </div>
    <br>
    <br>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table">
                <thead>
                <tr>
                    <th>订单用户id</th>
                    <th>订单时间</th>
                    <th>入住房间id</th>
                    <th>入住时间</th>
                    <th>预定天数</th>
                    <th>入住人</th>
                    <th>订单状态</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="reservation" items="${requestScope.get('reservationList')}" varStatus="status">
                    <tr>
                        <td>${reservation.user.id}</td>
                        <td><fmt:formatDate value="${reservation.orderTime}" pattern="yyyy-MM-dd HH:mm"/></td>
                        <td>${reservation.roomInfo.id}</td>
                        <td><fmt:formatDate value="${reservation.checkInTime}" pattern="yyyy-MM-dd HH:mm"/></td>
                        <td>${reservation.days}</td>
                        <td>${reservation.checkInName}</td>
                        <td>
                            <c:if test="${reservation.roomStatus==1}">
                                <a href="/admin/reservation/checkin?reservationId=${reservation.id}">办理入住</a>
                            </c:if>
                            <c:if test="${reservation.roomStatus==3}">
                                已入住
                                <a href="/admin/reservation/checkout?reservationId=${reservation.id}">办理退房</a>
                            </c:if>
                            <c:if test="${reservation.roomStatus==4}">
                                订单已完成
                            </c:if>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
    <a href="/admin/toOperate">返回上一页</a>
</div>
</body>
</html>
