<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
	<form id='testform' action="/example/confirm" method="POST">
		For Run in JSP: ${message}<br> <input type='hidden' name='num'>
		<input type='hidden' id='act' name='act' value='add'> ID:<input
			type='text' id='id' name='id'><br> NAME:<input
			type='text' name='name'><br>
		<button type="submit" value="提交">送出</button>
	</form>
</body>
</html>