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
			
			<div><h1>Para agregar un nuevo COMPONENTE DE PLATO</h1></div>
			<div><h4>Complete los siguientes datos (la casilla tildad significa que "si" es apto)</h4></div>
			
			<div >
				
				
				
				<form:form id="componenteRegisterForm" modelAttribute="componente" method="post" action="guardarComponente">
					<form:hidden path="idComponente"  value="${usuarioObject.idComponente}" />
				  <div class="form-group">
				    <label>Nombre del componente del plato</label>
				    <form:input path="nombre" value="${usuarioObject.nombre}" cssClass="form-control" required="required"/> <!-- Aca no les cambie los nombre de los path o del value porque si no, no me andaban para probarlo, hay que cambiarlo dependiendo de lo que pongamos en el controlador -->
				    <form:errors path="nombre" cssClass="error"/>
				  </div>
				  <div class="form-group">
				    <label>Indique si es apto para celiacos</label>
				    <form:checkbox value="aptoceliaco" path="aptoCeliaco" cssClass="form-control"/> <!-- aca pasa lo mismo, dependiendo del controlador me parece que hay que cambiar el value y el path -->
				    <form:errors path="aptoCeliaco" cssClass="error"/>
				  </div>
				   <div class="form-group">
				    <label>Indique si es apto para diabeticos</label>
				    <form:checkbox value="aptodiabetico" path="aptoDiabetico" cssClass="form-control"/> <!-- aca pasa lo mismo, dependiendo del controlador me parece que hay que cambiar el value y el path -->
				    <form:errors path="aptoDiabetico" cssClass="error"/>
				  </div>
		
				  <div class="form-group">
				  	<label>Indique si es apto para hipertenso</label>
				  	<form:checkbox value="aptohipertenso" path="aptoHipertenso" cssClass="form-control"/> <!-- aca pasa lo mismo, dependiendo del controlador me parece que hay que cambiar el value y el path -->
				  	<form:errors path="aptoHipertenso" cssClass="error"/>
				  </div>
				   <div class="form-group">
				    <label>Indique si es apto lactosa</label>
				    <form:checkbox value="aptolactosa" path="aptoLactosa" cssClass="form-control"/> <!-- aca pasa lo mismo, dependiendo del controlador me parece que hay que cambiar el value y el path -->
				    <form:errors path="aptoLactosa" cssClass="error"/>
				  </div>
				  
				  <br>
				 
				  
				  
				  
				 
				  <button onclick="return submitusuarioForm();" type="submit" class="btn btn-default">Crear Nuevo componente de plato</button>
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