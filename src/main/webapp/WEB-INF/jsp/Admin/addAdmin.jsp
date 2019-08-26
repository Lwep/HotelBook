<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/18
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>新增论文</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    管理员添加页面
                </h1>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增管理员</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="/super/doAddAdmin" method="post" id="registerForm" accept-charset="UTF-8">
        用户名：<input type="text" name="username"><br><br><br>
        密码：<input type="text" name="password"><br><br><br>
        重复密码：<input type="text" name="rePassword"><br><br><br>
        真实姓名：<input type="text" name="realName"><br><br><br>
        员工编号：<input type="text" name="empNum"><br><br><br>
        <input type="submit" value="添加" >
    </form>

</div>

