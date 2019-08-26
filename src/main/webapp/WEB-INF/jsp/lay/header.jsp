<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/18
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>header</title>
    <link rel="stylesheet" href="../../../css/bootstrap.min.css">
</head>
<body>

<ul class="nav-pills" style="background: #0f88eb ">

    <a href="/toIndex">
        <button type="button" class="btn btn-default navbar-btn" style="margin-left: 20px">首页</button>
    </a>
    <%
        if (session.getAttribute("user") != null) {
    %>
    欢迎你 <c:out value="${sessionScope.user.realName}"/>
    <a href="/user/reservation/showByUser">
        <button type="button" class="btn btn-default navbar-btn " style="margin-left: 30px">订单</button>
    </a>
    <a href="/user/doLogout">
        <button type="button" class="btn btn-default navbar-btn " style="margin-left: 30px">注销</button>
    </a>
    <%
    } else {
    %>
    <a href="/user/toLogin">
        <button type="button" class="btn btn-default navbar-btn " style="margin-left: 30px">登录</button>
    </a>
    <a href="/user/toRegister">
        <button type="button" class="btn btn-default navbar-btn " style="margin-left: 30px">注册</button>
    </a>

    <%
        }
    %>

</ul>


</body>
</html>
