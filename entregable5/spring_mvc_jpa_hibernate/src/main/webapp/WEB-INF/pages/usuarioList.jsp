<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <script src="<c:url value="/resources/js/usuario.js"/>"></script>
</head>
<body class=".container-fluid">
<div class="container myrow-container">
    <div class="panel panel-success">
        <div class="panel-heading">
            <h3 class="panel-title">
                <div align="left"><b>usuarios List</b> </div>
                <div align="right"><a href="createUsuario">Agregar un Usuario</a></div>
            </h3>
        </div>
        <div class="panel-body">
            <c:if test="${empty usuarioList}">
                No hay Usuarios  
            </c:if>
            <c:if test="${not empty usuarioList}">
                <table class="table table-hover table-bordered">
                    <thead style="background-color: #bce8f1;">
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Age</th>
                        <th>Salary</th>
                        <th>Edit</th>
                        <th>Delete</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${usuarioList}" var="usr">
                    <tr>
						<td><c:out value="${usr.id}" /></td>
						<td><c:out value="${usr.name}" /></td>
						<td><c:out value="${usr.age}" /></td>
						<td><c:out value="${usr.salary}" /></td>
						<td><a href="editUsuario?id=${usr.id}">Edit</a></td>
						<td><a href="deleteUsuario?id=${usr.id}">Delete</a></td>
					</tr>

                    </c:forEach>
                    </tbody>
                </table>
            </c:if>
        </div>
    </div>
    </div>

</body>
</html>