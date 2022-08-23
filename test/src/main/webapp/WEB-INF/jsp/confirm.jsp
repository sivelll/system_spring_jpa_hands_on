<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="BIG5"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html xmlns:th="https://www.thymeleaf.org">
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>

 <p>ID : ${id}</p>
 <p>Name :  ${name}</p>

	確定新增嗎?
	<button type="submit" value="新增">新增</button><br>
	<a href="/example/test">Submit another message</a>
</body>
</html>