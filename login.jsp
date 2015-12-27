<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
			<!--ACA EMPIEZA LA PRIMER DIVISION -->
		  <div class="col-md-3">



		  </div>
		  
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
		                <a class="navbar-brand page-scroll" href="#page-top">PRINCIPAL</a>
		            </div>
		
		            <!-- Collect the nav links, forms, and other content for toggling -->
		            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		                <ul class="nav navbar-nav navbar-right">
		                    <li>
		                        <a class="page-scroll" href="#login">Historia</a>
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
		                        <a class="page-scroll" href="#contact">Iniciar Sesion</a>
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
    	<div style="height: 25px"></div>
    	
    <div> <h1>Complete sus datos para Ingresar</h1></div>	
    
    
    <div>
	    <form:form action="login" modelAttribute="usuarioForm" method="post">
	    
			  <div class="form-group">
			    <form:input path="dni" size="30"/>
				<form:errors path="dni" cssClass="error"/>
			  </div>
			  <div class="form-group">
			    <form:password path="pass" size="30"/>
				<form:errors path="pass" cssClass="error"/>
			  </div>
			  
		 <!-- 
			  <button type="submit" class="btn btn-default">Ingresar</button>
		 -->	  
			  
			  <input type="submit" class="btn btn-default" id="loginUsuario" value="Log-In" onclick="return submitusuarioForm();" />
		</form:form>
	
	</div>
	
		
		
	<div style="height:200px"></div>	
	<div >
		
		<jsp:include page="footer.jsp" flush="false" >
			<jsp:param name="subtitulo" value="subtitulo de pagina auto.jsp formulario de cotizacion"/>
		</jsp:include>
	
	</div>


		  </div>

		  <!--ACA EMPIEZA LA TERCERA DIVISION -->
		  <div class="col-md-3"> 


		  </div>
		</div>

	</div>


		<jsp:include page="script.jsp" flush="false" >
			<jsp:param name="script" value="subtitulo de pagina script.jsp"/>
		</jsp:include>
  
	

</body>
</html>