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
		                <a class="navbar-brand page-scroll" href="/">PRINCIPAL</a>
		            </div>
		
		            <!-- Collect the nav links, forms, and other content for toggling -->
		            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		                <ul class="nav navbar-nav navbar-right">
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
			
			
				<div><h2>Para agregar un nuevo Menu: </h2></div>
			<div><h4>Complete los siguientes datos</h4></div>
			
			<div >
				
				
					<form:form id="usuarioRegisterForm" modelAttribute="administrador" method="post" action="guardarAdministrador">	<!-- en todos hay que cambiar los path dependiendo del controlador, no encontre un tipo fecha asi que quedo como texto, y hay que poner el nombre del controlador en el action -->
					<form:hidden path="id"  value="${usuarioObject.id}" />
				  <div class="form-group">
				    <label>Nombre del Menu</label>
				    <form:input path="nombre" value="${usuarioObject.nombre}" cssClass="form-control" required="required"/>
				    <form:errors path="nombre" cssClass="error"/>
				  </div>
				  
				 <%--  <div class="form-group">
				    <label>Indique si es apto vegetariano</label>
				    <form:checkbox value="aptolactosa" path="dni" cssClass="form-control"/> <!-- aca pasa lo mismo, dependiendo del controlador me parece que hay que cambiar el value y el path -->
				    <form:errors path="aptoLactosa" cssClass="error"/>	<!-- hay que cambiar el path -->
				  </div> --%>
				  
				  <div class="form-group">
				    <label>Indique si es apto para diabeticos (escriba "si" o "no")</label>
				    <form:input  value="no" path="dni" cssClass="form-control" required="required"/> <!-- aca pasa lo mismo, dependiendo del controlador me parece que hay que cambiar el value y el path -->
				    <form:errors path="dni" cssClass="error"/>
				  </div>
				  
				  <div class="form-group">
				    <label>Seleccione la entrada</label>
				    <form:select path="dni" cssClass="form-control" required="required"/>	<!-- ACA HAY QUE CAMBIAR EL PATH -->
				    <form:errors path="dni" cssClass="error"/>
				    	
				    	<c:forEach items="${componente}" var="usr"> <!-- aca hay que prestar atencion al nombre de la var que uses, esta como componente -->
								<form:option path="" value="${usr.nombre}" />			<!--aca sale con la variable usr pero hay que cambiarla segun la que uses en el controlador,  en este caso falta especificar el "path" aca le puse los nombres de las variables que tiene en la tabla componente, creo que hay que adaptar el controlador -->
								<form:errors path="" cssClass="error"/>	
	                    </c:forEach>      
				  </div>
				  <div class="form-group">
				    <label>Selecciones la bebida</label>
				    <form:select path="dni" cssClass="form-control" required="required"/>
				    <form:errors path="dni" cssClass="error"/>
				    	
				    	<c:forEach items="${componente}" var="usr"> <!-- aca hay que prestar atencion al nombre de la var que uses -->
								<form:option path="" value="${usr.nombre}" />			<!--aca sale con la variable usr pero hay que cambiarla segun la que uses en el controlador,  en este caso falta especificar el "path" aca le puse los nombres de las variables que tiene en la tabla componente, creo que hay que adaptar el controlador -->
								<form:errors path="" cssClass="error"/>	
	                    </c:forEach>      
				  </div>
				  <div class="form-group">
				    <label>Seleccione el plato principal</label>
				    <form:select path="dni" cssClass="form-control" required="required"/>
				    <form:errors path="dni" cssClass="error"/>
				    	
				    	<c:forEach items="${componente}" var="usr"> <!-- aca hay que prestar atencion al nombre de la var que uses -->
								<form:option path="" value="${usr.nombre}" />			<!--aca sale con la variable usr pero hay que cambiarla segun la que uses en el controlador,  en este caso falta especificar el "path" aca le puse los nombres de las variables que tiene en la tabla componente, creo que hay que adaptar el controlador -->
								<form:errors path="" cssClass="error"/>	
	                    </c:forEach>      
				  </div>
				  <div class="form-group">
				    <label>Seleccione el postre</label>
				    <form:select path="dni" cssClass="form-control" required="required"/>
				    <form:errors path="dni" cssClass="error"/>
				    	
				    	<c:forEach items="${componente}" var="usr"> <!-- aca hay que prestar atencion al nombre de la var que uses -->
								<form:option path="" value="${usr.nombre}" />			<!--aca sale con la variable usr pero hay que cambiarla segun la que uses en el controlador,  en este caso falta especificar el "path" aca le puse los nombres de las variables que tiene en la tabla componente, creo que hay que adaptar el controlador -->
								<form:errors path="" cssClass="error"/>	
	                    </c:forEach>      
				  </div>
				  
				  
				  
				 
				  
				  
				  
				 
				  <button onclick="return submitusuarioForm();" type="submit" class="btn btn-default">Crear Nuevo Menu</button>	<!-- aca me parece que segun el controlar hay que cambiar la parte de ONCLICK  -->
				</form:form>
						
			
			</div >
			
			
			
			
		
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