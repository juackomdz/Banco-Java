<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="ServletDest" method="post">
	Nombre: <input type="text" name="nombre"><br>
	Rut: <input type="text" name="rut"><br>
	Banco: <input type="text" name="banco"><br>
	Tipo Cuenta: <input type="text" name="tpo_cuenta"><br>
	Nro. Cuenta: <input type="text" name="nro_cuenta"><br>
	Email: <input type="text" name="email"><br>
	<input type="submit" name="btn_accion" value="Agregar">
	<input type='submit' name='btn_accion' value='Modificar'>
</form>
</body>
</html>