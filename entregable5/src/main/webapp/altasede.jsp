<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
	<!-- Bootstrap CSS -->
	<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<!-- Bootstrap JS -->
	<script src="bootstrap/js/bootstrap.min.js"></script>
	
	 <link href="jqueryBootgrid/jquery.bootgrid.css" rel="stylesheet" />
	<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
	<!-- Bootstrap CSS -->
	<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<!-- Bootstrap JS -->
	<script src="bootstrap/js/bootstrap.min.js"></script>
	
	 <link href="jqueryBootgrid/jquery.bootgrid.css" rel="stylesheet" />
	 
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
			
			<div><h1>Agregar un nueva sede</h1></div>
			<div><h2>Complete los siguientes datos</h2></div>
			
			<div>
				
				<form>
				  <div class="form-group">
				    <label for="nombresede">Nombre de la sede</label>
				    <input type="text" class="form-control" id="nombresede" name="nombresede" placeholder="Nombre de la sede" required>
				  </div>
				  <div class="form-group">
				    <label for="direccionsede">Direccion de la sede</label>
				    <input type="text" class="form-control" id="direccionsede" name="direccionsede" placeholder="Direccion de la sede">
				  </div>
				  <div class="form-group">
				    <label for="numerosede">Numero de sede</label>
				    <input type="text" class="form-control" id="numeronsede" name="numerosede" placeholder="Numero de sede">
				  </div>
				  <button type="submit" class="btn btn-default">Crear sede</button>
				</form>
			
			
			
			</div>
			
			
				<jsp:include page="footer.jsp" flush="false" >
					<jsp:param name="subtitulo" value="subtitulo de pagina auto.jsp formulario de cotizacion"/>
				</jsp:include>
			
			
			

		  </div>
		  <div class="col-md-3"> </div>

		 
	</div>
</div>
	


<script src="jqueryBootgrid/jquery.bootgrid.js"></script>
</body>
</html>