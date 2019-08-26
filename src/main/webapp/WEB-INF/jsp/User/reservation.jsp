<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/18
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
    <title>历史订单</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container-fluid">

    <%@include file="../lay/header.jsp" %>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <h3 class="text-center">
                欢迎<label style="color: red">${user.realName}</label>，以下是您的订单
            </h3>
            <br/>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table">
                <thead>
                <tr>
                    <th>下单时间</th>
                    <th>入住时间</th>
                    <th>预定天数</th>
                    <th>入住人</th>
                    <th>入住的房间号</th>
                    <th>订单状态</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="reservation" items="${requestScope.get('reservationList')}" varStatus="status">
                    <tr>
                        <td><fmt:formatDate value="${reservation.orderTime}" pattern="yyyy-MM-dd HH:mm"/></td>
                        <td><fmt:formatDate value="${reservation.checkInTime}" pattern="yyyy-MM-dd HH:mm"/></td>
                        <td>${reservation.days}</td>
                        <td>${reservation.checkInName}</td>
                        <td>${reservation.roomInfo.roomNum}</td>
                        <td>
                            <c:if test="${reservation.roomStatus==1}">
                                预定成功
                                &nbsp&nbsp&nbsp
                                <a href="/user/reservation/cancel?reservationId=${reservation.id}">取消订单</a>
                            </c:if>
                            <c:if test="${reservation.roomStatus==2}">
                                订单已撤销
                            </c:if>
                            <c:if test="${reservation.roomStatus==3}">
                                已入住
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
</div>
</body>
</html>
