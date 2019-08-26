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
                <form class="form-horizontal" role="form" action="register" id="registerForm" method="post"
                      accept-charset="UTF-8">
                    <!--用户名输入框-->
                    <div class="group-ipt signName">
                        <label id="isUsernameValid"></label>
                        <input type="text" name="username" id="username" class="ipt" placeholder="输入您的登录名(字母开头，8-12位)"
                               required>
                    </div>
                    <%--电话输入框--%>
                    <div class="group-ipt signPhone">
                        <label id="isTelValid"></label>
                        <input type="text" name="phone" id="phone" class="ipt" placeholder="输入您的电话号码" required>
                    </div>
                    <%--电子邮件输入框--%>
                    <div class="group-ipt signEmail">
                        <label id="isEmailValid"></label>
                        <input type="text" name="email" id="email" class="ipt" placeholder="输入您的电子邮件" required>
                    </div>
                    <%--真实姓名输入框--%>
                    <div class="group-ipt signRealname">
                        <input type="text" name="realName" id="realName" class="ipt" placeholder="输入您的真实姓名"
                               required>
                    </div>
                    <!--密码输入框-->
                    <div class="group-ipt signPwd">
                        <label id="isPasswordValid"></label>
                        <input type="password" name="password" id="password" class="ipt"
                               placeholder="输入您的登录密码(字母数字混合8-32位)" required>
                    </div>
                    <%--重复输入密码--%>
                    <div class="group-ipt signRpwd">
                        <label id="isRePasswordValid"></label>
                        <input type="password" name="rePassword" id="rePassword" class="ipt" placeholder="再次输入您的登录密码"
                               required>
                    </div>

                    <!--注册按钮-->
                    <div class="button" id="btnLogin">
                        <button type="submit" class="login-btn register-btn button" id="embed-submit">立即注册</button>
                    </div>
                </form>
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
<%@include file="../lay/footer.jsp" %>
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>

<script type="text/javascript">
    $(function () {

        $("#username").on('blur', function () {
            checkUsername($(this).val());
        });
        //验证密码
        $("#password").on('blur', function () {
            checkPassword($(this).val());
        });
        //验证重复密码
        $("#rePassword").on('blur', function () {
            checkRePassword($(this).val(), $('#password').val());
        });
        //验证电话
        $("#phone").on('blur', function () {
            checkTel($(this).val());
        });
        //验证邮箱
        $("#email").on('blur', function () {
            checkEmail($(this).val());
        });

        function checkUsername(username) {
            var flag = /^[a-zA-z]\w{6,18}$/.test(username);
            if (!flag) {
                $('#isUsernameValid').text('用户名不规范').css('color', 'red');
                $('#username').focus();
            } else {
                $('#isUsernameValid').text('用户名符合规范').css('color', 'green');
            }
            return flag;
        }

        function checkPassword(password) {
            var flag = /^(?![a-zA-z]+$)(?!\d+$)(?![!@#$%^&*]+$)[a-zA-Z\d!@#$%^&*]{8,18}$/.test(password);
            if (flag) {
                $('#isPasswordValid').text('密码格式正确').css('color', 'green');
            } else {
                $('#isPasswordValid').text('密码格式错误').css('color', 'red');
            }
            return flag;
        }

        function checkRePassword(rePassword, password) {
            var flag = rePassword == password;
            if (flag) {
                $('#isRePasswordValid').text('密码一致').css('color', 'green');
            } else {
                $('#isRePasswordValid').text('密码不一致').css('color', 'red');
            }
            return flag;
        }

        function checkEmail(email) {
            var flag = /^(\w)+(\.\w+)*@(\w)+((\.\w{2,3}){1,3})$/.test(email);
            if (flag) {
                $('#isEmailValid').text('邮箱格式正确').css('color', 'green');
            } else {
                $('#isEmailValid').text('邮箱格式正确错误').css('color', 'red');
            }
            return flag;
        }

        function checkTel(tel) {
            var flag = /^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,3,5-9]))\d{8}$/.test(tel);
            if (flag) {
                $('#isTelValid').text('电话号码格式正确').css('color', 'green');
            } else {
                $('#isTelValid').text('电话号码格式错误').css('color', 'red');
            }
            return flag;
        }
    });
</script>
</body>
</html>
