<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/27
  Time: 9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>管理员查看房间类型</title>
    <link rel="stylesheet" href="../../../css/bootstrap.min.css">
</head>
<body>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <h3 class="text-center">
                房型管理
            </h3>
            <br/>
            <div class="col-md-4 column">
                <a class="btn btn-primary" href="/super/room/toAddCatalog">添加房型</a>
                <a class="btn btn-primary" href="/super/toSuper">返回上一页</a>
            </div>
            <br/>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table">
                <thead>
                <tr>
                    <th>房型</th>
                    <th>操作</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="room" items="${requestScope.get('list')}" varStatus="status">
                    <tr>
                        <td>
                            <a href="/super/room/doShowRoomById/${room.id}">${room.catalog}</a>
                        </td>
                        <td>
                            <a href="/super/room/doDeleteCatalog/${room.id}">删除该房型</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>


            </table>
        </div>
    </div>

</div>


</body>
</body>
</html>
