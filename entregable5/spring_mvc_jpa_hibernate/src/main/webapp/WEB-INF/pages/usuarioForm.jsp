<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<h2>Información del Empleado</h2>
<script src="<c:url value="/resources/js/usuario.js"/>"></script>
</head>
<body>
	<form:form id="usuarioRegisterForm" modelAttribute="usuario" method="post" action="saveUsuario">
		<form:hidden path="id"  value="${usuarioObject.id}" /><br>
		Nombre:<form:input  path="name" value="${usuarioObject.name}" /><br>
		Edad: <form:input  path="age" value="${usuarioObject.age}" /><br>
		Salario: <form:input cssClass="form-control" path="salary" value="${usuarioObject.salary}"/><br>
		
		<input type="submit" id="saveUsuario" value="Save" onclick="return submitusuarioForm();" />
	</form:form>
</body>
</html>
 
   <head>
   <title>Hello Spring MVC</title>
   </head>
   <body>
   <h2>${message}</h2>
   </body>
</html>
