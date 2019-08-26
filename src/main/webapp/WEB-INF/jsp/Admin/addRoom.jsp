<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/18
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>添加房间</title>
    <link href="https://cdn.bootcss.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <h3 class="text-center">
                添加<label style="color: red"></label>客房

            </h3>
            <h3 class="text-center">
                以下是客房类型<label style="color: red">${catalog.catalog}</label>的客房信息
            </h3>
            <br/>
            <label style="color: red"></label>
            <br/>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <form class="form-horizontal" action="/super/room/doAddRoom" enctype="multipart/form-data" method="post" accept-charset="UTF-8"  >
                <div class="form-group">
                    <label class="col-sm-2 control-label">房间号</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="roomNum" id="roomNum"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">面积</label>
                    <div class="col-sm-10">
                        <input  type="number" class="form-control" name="area" id="area"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">价格</label>
                    <div class="col-sm-10">
                        <input  type="number" class="form-control" name="price" id="price"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">简介</label>
                    <div class="col-sm-10">
                        <input required type="text" class="form-control" name="intro" id="intro"/>
                    </div>
                </div>


                <div class="form-group">
                    <label class="col-sm-2 control-label">上传图片</label>
                    <input type="file" name="primaryPhoto" id="primaryPhoto" multiple/>
                </div>

                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <input type="submit" class="btn btn-default" value="添加"/>
                    </div>
                </div>
            </form>

        </div>
    </div>
</div>
</body>
</html>
