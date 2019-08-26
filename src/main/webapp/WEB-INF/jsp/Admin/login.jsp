<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/17
  Time: 9:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员登录</title>
    <link rel="stylesheet" href="../../../css/common.css">
</head>

<body>
<form class="form-horizontal" role="form" action="/admin/login" method="post" id="loginForm">
<div id="box"></div>

<!--主栏-->
<div class="cent-box">
    <!--标题-->
    <div class="cent-box-header">
        <h1 class="main-title">HotelBook</h1>
        <h2 class="sub-title">酒店管理系统</h2>
    </div>

    <div class="cont-main clearfix">

        <!--登录区域开始-->

        <div class="login form">
            <!--文本输入框-->
            <div class="group">
                <!--用户名输入框-->
                <div class="group-ipt loginName">
                    <input type="text" name="username" id="loginName" class="ipt" placeholder="输入您的用户名" required>
                </div>
                <!--密码输入框-->
                <div class="group-ipt loginPwd">
                    <input type="password" name="password" id="loginPwd" class="ipt" placeholder="输入您的登录密码" required>
                </div>
            </div>
            <!--登录按钮-->
            <div class="button" id="btnLogin">
                <button type="submit" class="login-btn register-btn button" id="embed-submit">管理员登录</button>
            </div>
        </div>

    </div>
</div>
</form>

<%@include file="../lay/footer.jsp"%>


</body>
</html>
