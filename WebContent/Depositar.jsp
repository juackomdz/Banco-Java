<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form method="post" action="ServletDeposito">
	<h1>Depositos</h1>
	<br>
	Cantidad:
	<input type="text" name="cant_dep">
	<input type="submit" name="btn_dep" value="Depositar">
	
	</form>
	<input type="hidden" name="valor" value="${rut}"/>
</body>
</html>