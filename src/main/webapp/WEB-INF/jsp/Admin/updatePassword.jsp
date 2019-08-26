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
    <title>管理员修改密码</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <h3 class="text-center">
                修改密码
            </h3>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <form class="form-horizontal" role="form" method="post" action="/admin/updatePassword">
                <div class="form-group">
                    <label  class="col-sm-2 control-label">密码</label>
                    <label id="isPasswordValid"></label>
                    <div class="col-sm-10">
                        <input required type="password" class="form-control" name="password" id="password" />
                    </div>
                </div>
                <div class="form-group">
                    <label  class="col-sm-2 control-label">重复密码</label>
                    <label id="isRePasswordValid"></label>
                    <div class="col-sm-10">
                        <input required type="password" class="form-control" name="rePassword" id="rePassword" />
                    </div>
                </div>
                 <button type="submit" class="btn btn-default">修改</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
