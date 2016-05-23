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
		                
		            </div>
		
		            <!-- Collect the nav links, forms, and other content for toggling -->
		            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		                <ul class="nav navbar-nav navbar-right">
		                	 <li>
		                        <a class="page-scroll" href="/">PRINCIPAL</a>
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
		                    <li>
		                        <p class="navbar-text">Bienvenido, <a class="page-scroll" href="perfil">${sesion.getAttribute('user')}</a>! (<a class="page-scroll" href="salir">Salir</a>)</p>
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
			
			
			
			
			<div><h1>Estos son todos los componentes de plato existentes</h1></div>
			<div><h4>Puede editarlos, eliminarlos o agregar un nuevo componente de plato</h4></div>
			
				<div>
				<a href="crearAdmin" class="btn btn-primary btn-lg btn-block">Agregar Componente de plato</a> <!-- hay que cambiar el nombre del controlador que te lleva a crear componente de plato que es formcomponenteplato.jsp -->
				 
				</div>
				
				<div class="panel-body">
		            <c:if test="${empty componente}"> <!-- aca iria la tabla "componente" me parece, pero no estoy seguro porque ese es el nombre que le pusimos a la tabla, lo dejo con usuarios para probarlo -->
		                No hay componentes de plato aun   
		            </c:if>
		            <c:if test="${not empty usuarios}">
		                <table class="table">
		                    <thead>
		                    <tr>
		                        <th>Nombre</th>
		                        <th>Apto Celiaco</th>
		                        <th>Apto Hipertenso</th>
		                        <th>Apto Lactosa</th>
		                        <th>Apto Diabetico</th>
		                  
		                        <th>Editar</th>
		                        <th>Eliminar</th>
		                    </tr>
		                    </thead>
		                    <tbody>
		                    <c:forEach items="${componente}" var="usr"> <!-- aca hay que prestar atencion al nombre de la var que uses -->
		                    <tr class="active">
								<td><c:out value="${usr.nombre}" /></td>			<!-- aca le puse los nombres de las variables que tiene en la tabla componente, creo que hay que adaptar el controlador -->
								<td><c:out value="${usr.aptoCeliaco}" /></td>		<!-- aca le puse los nombres de las variables que tiene en la tabla componente, creo que hay que adaptar el controlador -->
								<td><c:out value="${usr.aptoHipertenso}" /></td>	<!-- aca le puse los nombres de las variables que tiene en la tabla componente, creo que hay que adaptar el controlador -->
								<td><c:out value="${usr.aptoDiabetico}" /></td>		<!-- aca le puse los nombres de las variables que tiene en la tabla componente, creo que hay que adaptar el controlador -->
								<td><c:out value="${usr.aptoLactosa}" /></td>
								
								<td><a href="editUsuario?id=${usr.id}">Editar</a></td> <!-- Aca hay que cambiar el href dependiendo de los nombres que uses en el controlador para los componentes el plato -->
								<td><a href="deleteUsuario?id=${usr.id}">Eliminar</a></td> <!-- Aca hay que cambiar el href dependiendo de los nombres que uses en el controlador para los componentes el plato -->
								<td><a href="deleteUsuario?id=${usr.id}">VerMas</a></td> <!-- Aca hay que cambiar el href dependiendo de los nombres que uses en el controlador para los componentes el plato -->
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