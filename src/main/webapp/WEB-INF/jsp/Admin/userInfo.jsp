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
    <title>用户信息</title>
    <link rel="stylesheet" href="../../../css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <h3 class="text-center">
                用户信息
            </h3>
            <br/>
            <div class="col-md-4 column">
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
                    <th>用户名</th>
                    <th>真实姓名</th>
                    <th>邮箱</th>
                    <th>电话号码</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="user" items="${requestScope.get('list')}" varStatus="status">
                <tr>
                    <td>${user.username}</td>
                    <td>${user.realName}</td>
                    <td>${user.email}</td>
                    <td>${user.phone}</td>
                </tr>
                </c:forEach>
            </table>
        </div>
    </div>

</div>


</body>
</html>
