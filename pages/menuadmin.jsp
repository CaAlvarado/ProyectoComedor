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
		                <a class="navbar-brand page-scroll" href="index.jsp">PRICIPAL</a>
		            </div>
		
		            <!-- Collect the nav links, forms, and other content for toggling -->
		            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		                <ul class="nav navbar-nav navbar-right">
		                    <li>
		                        <a class="page-scroll" href="#historia">Historia</a>
		                    </li>
		                    <li>
		                        <a class="page-scroll" href="#servicios">Servicios</a>
		                    </li>
		                    <li>
		                        <a class="page-scroll" href="#el comedor">Sugerencias</a>
		                    </li>
		                    <li>
		                        <a class="page-scroll" href="#contact">Salir</a>
		                    </li>
		                    <li>
		                        <a class="page-scroll" href="#contact">Nombre del usuario</a>
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
			
			<div><h1>BIENVENIDO ADMINISTRADOR</h1></div>
			<div style="height:100px"><h4>USTED DISPONE DE LAS SIGUIENTES OPCIONES </h4></div>
			
			<div style="height:300px">
				
				<div>
				<button type="button" class="btn btn-primary btn-lg btn-block">Gestionar sedes</button>
				<button type="button" class="btn btn-default btn-lg btn-block">Administrar Platos</button>
				</div>
				
				<div>
				<button type="button" class="btn btn-primary btn-lg btn-block">Administrar Componenete de plato</button>
				<button type="button" class="btn btn-default btn-lg btn-block">Administrar Usuarios</button>
				</div>
				
				<div>
				<button type="button" class="btn btn-primary btn-lg btn-block">Consultar Estadisticas</button>
				<button type="button" class="btn btn-default btn-lg btn-block">Buzon de sugerencias</button>
				</div>
				
				
			
			
			</div >
			
			<div style="height:400px">
			
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