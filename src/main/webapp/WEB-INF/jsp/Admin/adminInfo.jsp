<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/18
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>管理员信息</title>
    <link rel="stylesheet" href="../../../css/bootstrap.min.css">
</head>
<body>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <h3 class="text-center">
                管理员信息
            </h3>
            <br/>
            <div class="col-md-4 column">
                <a class="btn btn-primary" href="/super/toAddAdmin">添加管理员</a>
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
                    <th>登录名</th>
                    <th>真实姓名</th>
                    <th>员工编号</th>
                    <th>员工权限</th>
                    <th>操作</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="admin" items="${requestScope.get('list')}" varStatus="status">
                    <tr>
                        <td>${admin.username}</td>
                        <td> ${admin.realName}</td>
                        <td> ${admin.empNum}</td>
                        <td>
                            <c:if test="${admin.superAdmin==true}">
                                超级管理员
                            </c:if>
                            <c:if test="${admin.superAdmin==false}">
                               普通管理员
                            </c:if>
                        </td>
                        <td>
                            <a href="/super/del/${admin.id}">删除该管理员</a>
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
