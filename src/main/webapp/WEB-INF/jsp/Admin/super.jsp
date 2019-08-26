<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/18
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>超级管理员界面</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <h3 class="text-center">
                超级管理员界面
                <%--员工编号：${admin.empNum}--%>
            </h3>
        </div>
    </div>

    <br>
    <br>

    <div class="row clearfix">
        <div class="col-md-12 column" style="text-align: center;">
            <a href="/super/doShowAllAdmin">   <button type="button" class="btn btn-primary btn-lg">管理员详情</button></a>
        </div>
        <br>
        <br>
        <div class="col-md-12 column" style="text-align: center;">
            <a href="/super/user/all"> <button type="button" class="btn btn-primary btn-lg">用户详情</button></a>
        </div>
        <br>
        <br>
        <div class="col-md-12 column" style="text-align: center;">
            <a href="/super/room/doShowRoomByCatalog"> <button type="button" class="btn btn-primary btn-lg">客房管理</button></a>
        </div>
        <br>
        <br>

        <div class="col-md-12 column" style="text-align: center;">
            <a href="/admin/toOperate"> <button type="button" class="btn btn-primary btn-lg">返回首页</button></a>
        </div>
    </div>
</div>
<%@include file="../lay/footer.jsp" %>
</body>
</html>
