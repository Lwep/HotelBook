<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/18
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加房型</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <h3 class="text-center">
                添加客房类型
            </h3>

            <br/>
            <label style="color: red"></label>
            <br/>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <form action="/super/room/doAddCatalog" method="post" accept-charset="UTF-8">
                <div class="form-group">
                    <label>客房类型名称</label>
                    <input type="text" class="form-control" name="catalog" required/>
                </div>
                <button type="submit" class="btn btn-default">添加</button>
            </form>
            <a href="/super/toSuper">返回上一页</a>
        </div>
    </div>
</div>
</body>
</html>
