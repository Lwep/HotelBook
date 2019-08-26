<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/18
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>客房信息</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container-fluid">
    <%@include file="../lay/header.jsp" %>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <ul class="breadcrumb">
                <tbody>

                <c:forEach var="cataloglist" items="${requestScope.get('catalogList')}" varStatus="status">

                    <li>
                        <a href="/user/room/showRoomByCatalog?catalogId=${cataloglist.id}">${cataloglist.catalog}</a>
                    </li>
                </c:forEach>
                </tbody>

            </ul>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table">
                <thead>
                <tr>
                    <th>主图展示</th>
                    <th>门牌号</th>
                    <th>简介</th>
                    <th>价格</th>
                    <th>状态</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="room" items="${requestScope.get('roominfo')}" varStatus="status">
                    <tr>
                        <td>
                            <div class="col-md-12 column">
                                <img alt="140x140" src="../../../upload/room/primary/${room.primaryPhoto}"
                                     style="height: 140px"/>
                            </div>
                        </td>
                        <td> ${room.roomNum}</td>
                        <td>${room.intro}</td>
                        <td>${room.price}</td>
                        <td>
                            <c:if test="${room.roomStatus==1}">
                                <a href="/user/room/detailed?roomNum=${room.roomNum}">未预定</a>
                            </c:if>
                            <c:if test="${room.roomStatus!=1}">
                                已被预定
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