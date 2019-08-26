<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/18
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>房间信息</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <h3 class="text-center">
                以下是客房类型<label style="color: red">${catalog.catalog}</label>的客房信息

            </h3>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table">
                <thead>
                <tr>
                    <th>客房主图</th>
                    <th>房间号</th>
                    <th>客房价格</th>
                    <th>客房状态</th>
                    <th>操作</th>
                </tr>
                </thead>


                <tbody>
                <c:forEach var="roomInfo" items="${requestScope.get('list')}" varStatus="status">
                    <tr>
                        <td>
                            <div class="col-md-12 column">
                                <img alt="140x140" src="../../../upload/room/primary/${roomInfo.primaryPhoto}"
                                     style="height: 140px"/>
                            </div>
                        </td>
                        <td>${roomInfo.roomNum}</td>
                        <td>${roomInfo.price}</td>
                        <td>
                            <c:if test="${roomInfo.roomStatus==1}">
                              未预定
                            </c:if>
                            <c:if test="${roomInfo.roomStatus!=1}">
                                已被预定
                            </c:if>
                        </td>

                        <td><a href="/super/room/del/${roomInfo.id}">删除</a></td>

                    </tr>
                </c:forEach>


                </tbody>
            </table>
        </div>
    </div>

    <a href="/super/room/toAddRoom">添加客房</a>&nbsp&nbsp&nbsp&nbsp<a href="/super/room/toShowRoomByCatalog">返回上一页</a>

</div>
</div>
</div>

</body>
</html>
