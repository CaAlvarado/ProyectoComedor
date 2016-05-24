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
			
			<div><h1>Para agregar un nuevo menu</h1></div>
			<div><h4>Complete los siguientes datos (la casilla tildad significa que "si" es apto)</h4></div>
			
			<div >
				
				
				
				<form:form id="menuRegisterForm" modelAttribute="menu" method="post" action="guardarMenu">
					<form:hidden path="idMenu"  value="${usuarioObject.id}" />
				  <div class="form-group">
				    <label>Nombre del menu</label>
				    <form:input path="nombre" value="${usuarioObject.nombre}" cssClass="form-control" required="required"/> <!-- Aca no le cambie los nombre de los path o del value porque si no, no me andaban para probarlo, hay que cambiarlo dependiendo de lo que pongamos en el controlador -->
				    <form:errors path="nombre" cssClass="error"/>
				  </div>
				  <div class="form-group">
				    <label>Indique si es apto para vegetariano</label>
				    <form:checkbox value="vegetariano" path="vegetariano" cssClass="form-control" required="required"/> <!-- aca pasa lo mismo, dependiendo del controlador me parece que hay que cambiar el value y el path, o usar ese value ¿? =) -->
				    <form:errors path="vegetariano" cssClass="error"/>
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
				  <div class="form-group">
				    <label>Cantidad de semanas: indique un numero del 1 al 9</label>
				    <form:input path="nombre" value="${usuarioObject.nombre}" cssClass="form-control" required="required"/> <!-- Aca no le cambie los nombre de los path o del value porque si no, no me andaban para probarlo, hay que cambiarlo dependiendo de lo que pongamos en el controlador -->
				    <form:errors path="nombre" cssClass="error"/>
				  </div>
				  <div class="form-group">
				  	<label>Precio del menu</label>
				  	<form:input path="precioMenu" value="${menu.precioMenu}" cssClass="form-control" required="required"/>
				  	<form:errors path="precioMenu" cssClass="error"/>
				  </div>
				  
							
							<!-- aca muestra todos los componentes y los puede ir eligiendo con un checkbox, asi puede agregar al menu la bebida o postre o principal o entrada que previamente haya cargado como componente de plato -->
							<!-- hay que prestar atencion a lo que termina con s o no, no te vaya a pasar como a mi que me hice un lio por eso jaja -->
				<div class="panel-body">
		            <c:if test="${empty componentes}"> <!-- aca iria la tabla "componente" me parece, pero no estoy seguro porque ese es el nombre que le pusimos a la tabla,-->
		                No hay componentes de plato aun   
		            </c:if>
		            <c:if test="${not empty componentes}">	<!--  aca hay que cambiar el nombre de la tabla o de la variable que accede a la tabla, hay que cambiar la que dice "usuarios", depende como la hiciste en el controlador -->
		                <table class="table">
		                    <thead>
		                    <tr>
		                        <th>Nombre</th>
		                        <th>Elegir</th>
		                    </tr>
		                    </thead>
		                    <tbody>
		                    <c:forEach items="${componentes}" var="compo"> <!-- aca hay que prestar atencion al nombre de la var que uses -->
		                    <tr class="active">
								<td>${compo.nombre}</td>
								<td><form:checkbox path="nombre" value="${compo.nombre}" /></td>			<!--en este caso falta especificar el "path" aca le puse los nombres de las variables que tiene en la tabla componente, creo que hay que adaptar el controlador -->
								<td><form:errors path="" cssClass="error"/></td>
								
								
							</tr>
		
		                    </c:forEach>
		                    </tbody>
		                </table>
		            </c:if>
		        </div>	
				
				
				
				
				
				
				
				
				  <br>
				 
				 
				  <button onclick="return submitusuarioForm();" type="submit" class="btn btn-default">Crear Nuevo plato para el menu</button>
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