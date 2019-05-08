<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> ${message}</h1>
	<form:form  action="${pageContext.request.contextPath}/formData" method="POST" modelAttribute="producto">
	
		<label>Ingrese nombre del producto: </label>
		<form:input type="text" name="nombre" path="nombre"/>
		<form:errors path="nombre" cssStyle="color:#E81505;" ></form:errors><br>
		
		<label>Ingrese marca del producto: </label>
		<form:input type="text" name="marca" path="marca"/>
		<form:errors path="marca" cssStyle="color:#E81505;" ></form:errors><br>
		
		<label>Ingrese descripcion del producto: </label>
		<form:input type="text" name="descripcion" path="descripcion"/>
		<form:errors path="descripcion" cssStyle="color:#E81505;" ></form:errors><br>
		
		<label>Ingrese categoria del producto: </label>
		<form:input type="text" name="categoria" path="categoria"/>
		<form:errors path="categoria" cssStyle="color:#E81505;" ></form:errors><br>
		
		<label>Ingrese precio del producto: </label>
		<form:input type="text" name="precio" path="precio"/>
		<form:errors path="precio" cssStyle="color:#E81505;" ></form:errors><br>
		
		<label>Ingrese fecha de vencimiento del producto: </label>
		<form:input type="text" name="fVencimiento" path="fVencimiento"/>
		<form:errors path="fVencimiento" cssStyle="color:#E81505;" ></form:errors><br>
		
		<input type="submit" value="Agregar usuario">
	</form:form>
</body>
</html>