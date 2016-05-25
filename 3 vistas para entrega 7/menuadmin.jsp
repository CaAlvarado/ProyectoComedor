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
		  	 <jsp:include page="header.jsp" flush="false" />
    	</div>
		  
		  <br>
		  <br>
	
			
			<div><h1>BIENVENIDO ADMINISTRADOR</h1></div>
			<div style="height:100px"><h4>USTED DISPONE DE LAS SIGUIENTES OPCIONES </h4></div>
			
			<div style="height:300px">
				
				<div>
				<a href="listarSedes" class="btn btn-primary btn-lg btn-block">Gestionar sedes</a>
				<a href="listarMenus" class="btn btn-default btn-lg btn-block">Administrar menus</a>
				</div>
				
				<div>
				<a href="listarComponentes" class="btn btn-primary btn-lg btn-block">Administrar componentes de menu</a>
				<a href="listarUsuarios" class="btn btn-default btn-lg btn-block">Administrar usuarios</a>
				</div>
				
				<div>
				<button type="button" class="btn btn-primary btn-lg btn-block">Consultar Estadisticas</button>
				<button type="button" class="btn btn-default btn-lg btn-block">Buzon de sugerencias</button>
				</div>
				
				<div>
				<button type="button" class="btn btn-primary btn-lg btn-block">Administrar Cartillas</button>
				</div>
				
				
			
			
			</div >
			
			<br>
			<br>
			<br>
			<br>
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