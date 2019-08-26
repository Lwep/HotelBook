<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body>

	<%--<h1>用户登录</h1>--%>
	<%--<hr/>--%>
	<%--<form action="${pageContext.request.contextPath}/user/login" method="POST">--%>
		<%--用户名:<input type="text" id = "name" name="username"><br>--%>
		<%--密&emsp;码: <input type="password" id = "password" name="password"><br>--%>
		<%--<input type="submit" value="登录">--%>
	<%--</form>--%>
	<jsp:forward page="WEB-INF/jsp/main.jsp"></jsp:forward>
</body>
</html>