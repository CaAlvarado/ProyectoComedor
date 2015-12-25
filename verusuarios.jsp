<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

		<jsp:include page="recursos.jsp" flush="false" >
			<jsp:param name="recurso" value="subtitulo de pagina recurso.jsp"/>
		</jsp:include>

</head>
<body>

				


	<div class="container">
	
		<div class="row">
		
			 <div class="col-md-3"> </div>
	
	  
		  <!--ACA EMPIEZA LA SEGUNDA DIVISION -->
		  <div class="col-md-6">
		  
		  <div>
		  	 <nav style="background-color:#F5F5DC" id="mainNav" class="navbar navbar-default navbar-fixed-top">
		        <div class="container-fluid">
		            <!-- Brand and toggle get grouped for better mobile display -->
		            <div class="navbar-header">
		                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
		                    <span class="sr-only">Toggle navigation</span>
		                    <span class="icon-bar"></span>
		                    <span class="icon-bar"></span>
		                    <span class="icon-bar"></span>
		                </button>
		                <a class="navbar-brand page-scroll" href="#page-top">Quieres comer en el comedor (click aqui)!</a>
		            </div>
		
		            <!-- Collect the nav links, forms, and other content for toggling -->
		            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		                <ul class="nav navbar-nav navbar-right">
		                    <li>
		                        <a class="page-scroll" href="#login">Login</a>
		                    </li>
		                    <li>
		                        <a class="page-scroll" href="#servicios">Servicios</a>
		                    </li>
		                    <li>
		                        <a class="page-scroll" href="#el comedor">Sugerencias</a>
		                    </li>
		                    <li>
		                        <a class="page-scroll" href="#contact">Menu de esta semana</a>
		                    </li>
		                    <li>
		                        <a class="page-scroll" href="#contact">Contacto</a>
		                    </li>
		                </ul>
		            </div>
		            <!-- /.navbar-collapse -->
		        </div>
		        <!-- /.container-fluid -->
		    </nav>
    	</div>
		  
		  <br>
		  <br>
		  <br>
		  <br>
			
			<div><h1>Estos son todos los usuarios agregados</h1></div>
			<div><h4>Puede editarlos, eliminarlos o agregar un usuario nuevo</h4></div>
			
				<div>
				<button type="button" class="btn btn-primary btn-lg btn-block" action="#">Agregar Usuario</button> <!-- hay que agregar el nombre del controlador que te lleva a crear los usuarios -->
				</div>
				
				<div class="panel-body">
		            <c:if test="${empty usuarios}"> <!-- ACA LE PUSE NOMBRE usuarios pero lo podes cambiar compa -->
		                No hay Usuarios  
		            </c:if>
		            <c:if test="${not empty usuarios}">
		                <table class="table">
		                    <thead>
		                    <tr>
		                        <th>Nombre</th>
		                        <th>Apellido</th>
		                        <th>Direccion</th>
		                        <th>Dni</th>
		                        <th>Usuario</th>
		                        <th>Password</th>
		                        <th>Editar</th>
		                        <th>Eliminar</th>
		                    </tr>
		                    </thead>
		                    <tbody>
		                    <c:forEach items="${usuarios}" var="usr"> <!-- aca hay que prestar atencion al nombre de la var que uses -->
		                    <tr class="active">
								<td><c:out value="${usr.nombre}" /></td>
								<td><c:out value="${usr.apellido}" /></td>
								<td><c:out value="${usr.direccion}" /></td>
								<td><c:out value="${usr.dni}" /></td>
								<td><c:out value="${usr.usuario}" /></td>
								<td><c:out value="${usr.password}" /></td>
								<td><a href="editUsuario?id=${usr.id}">Editar</a></td> <!-- Aca hay que cambiar el href dependiendo de los nombres que uses en el controlador -->
								<td><a href="deleteUsuario?id=${usr.id}">Eliminar</a></td> <!-- Aca hay que cambiar el href dependiendo de los nombres que uses en el controlador -->
							</tr>
		
		                    </c:forEach>
		                    </tbody>
		                </table>
		            </c:if>
		        </div>
			
			<div style="height: 500px">
				<jsp:include page="footer.jsp" flush="false" >
					<jsp:param name="subtitulo" value="subtitulo de pagina auto.jsp formulario de cotizacion"/>
				</jsp:include>
			</div>
			
			

		  </div>
		  <div class="col-md-3"> </div>

		 
	</div>
</div>
	
		<jsp:include page="script.jsp" flush="false" >
			<jsp:param name="script" value="subtitulo de pagina script.jsp"/>
		</jsp:include>
</body>
</html>