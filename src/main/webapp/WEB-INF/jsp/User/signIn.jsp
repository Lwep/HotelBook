<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/17
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>用户注册</title>
    <link rel="stylesheet" href="../../../css/common.css">
</head>
<body>
<!--主栏-->
<div class="cent-box">
    <!--标题-->
    <div class="cent-box-header">
        <h1 class="main-title">立即加入我们</h1>
        <h2 class="sub-title">即刻享受</h2>
        <el class="litle-title">免费WIFI上网</el>
        <el class="litle-title">手机APP入住</el>
        <el class="litle-title">积分累积兑换</el>
    </div>


    <div class="cont-main clearfix">

        <!--登录区域开始-->
        <div class="login form">
            <!--文本输入框-->
            <div class="group">
                <!--用户名输入框-->
                <div class="group-ipt signName">
                    <input type="text" name="signName" id="signName" class="ipt" placeholder="输入您的登录名" required>
                </div>
                <%--电话输入框--%>
                <div class="group-ipt signPhone">
                    <input type="text" name="signPhone" id="signPhone" class="ipt" placeholder="输入您的电话号码" required>
                </div>
                <%--电子邮件输入框--%>
                <div class="group-ipt signEmail">
                    <input type="text" name="signEmail" id="signEmail" class="ipt" placeholder="输入您的电子邮件" required>
                </div>
                <%--真实姓名输入框--%>
                <div class="group-ipt signRealname">
                    <input type="text" name="signRealname" id="signRealname" class="ipt" placeholder="输入您的真实姓名" required>
                </div>
                <!--密码输入框-->
                <div class="group-ipt signPwd">
                    <input type="password" name="signPwd" id="signPwd" class="ipt" placeholder="输入您的登录密码" required>
                </div>
                <%--重复输入密码--%>
                <div class="group-ipt signRpwd">
                    <input type="password" name="signRpwd" id="signRpwd" class="ipt" placeholder="再次输入您的登录密码" required>
                </div>
            </div>
            <!--登录按钮-->
            <div class="button" id="btnLogin">
                <button type="submit" class="login-btn register-btn button" id="embed-submit">登录</button>
            </div>
        </div>
        <div class="remember clearfix">
            <label class="remember-me">
                <a>获取帮助</a>
            </label>
            <label class="forgot-password">
                <a>忘记密码？</a>
            </label>
        </div>
    </div>
</div>

<%@include file="../lay/footer.jsp"%>
</body>
</html>
