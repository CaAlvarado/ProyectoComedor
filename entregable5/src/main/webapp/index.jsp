<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>comedor UNLP</title>

    <!-- Bootstrap Core CSS -->
    <link rel="stylesheet" href="bootstrapIndex/css/bootstrap.min.css" type="text/css">

    <!-- Custom Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="bootstrapIndex/font-awesome/css/font-awesome.min.css" type="text/css">

    <!-- Plugin CSS -->
    <link rel="stylesheet" href="bootstrapIndex/css/animate.min.css" type="text/css">

    <!-- Custom CSS -->
    <link rel="stylesheet" href="bootstrapIndex/css/creative.css" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body id="page-top">

    <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
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

    <header>
        <div class="header-content">
            <div class="header-content-inner">
                <h1>Bienvenido a la pagina oficial del comedor uniersitario de la UNLP</h1>
                <hr>
                <a href="#about" class="btn btn-primary btn-xl page-scroll">Empezar a comer en el comedor</a>
            </div>
        </div>
    </header>

    <section class="bg-primary" id="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <h2 class="section-heading">El comedor esta dise�ado para todos los estudiantes que estudian en la UNLP</h2>
                    <hr class="light">
                    <p class="text-faded">Funcionaba desde la década del ’30 y se había transformado en el epicentro de las discusiones políticas y estudiantiles de la época. Sin embargo, el 17 de septiembre de 1974 un ataque terrorista destruyó las instalaciones del edifico de 1 y 50, lo que desencadenó el posterior cierre del servicio. En 2004, tras el reclamo de los estudiantes y el planteo de su necesidad, se hizo efectiva la reapertura del comedor de la UNLP. Actualmente abastece a 5 mil estudiantes por día.</p>
                    <a href="#" class="btn btn-default btn-xl">Conoce los dias que funciona y sus horarios</a>
                </div>
            </div>
        </div>
    </section>

    <section id="services">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="section-heading">A tu servicios estimado estudiante: Mira como se compone el menu</h2>
                    <hr class="primary">
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-lg-3 col-md-6 text-center">
                    <div class="service-box">
                        <i class="fa fa-4x fa-diamond wow bounceIn text-primary"></i>
                        <h3>Entrada</h3>
                        <p class="text-muted">La entrada te permite complementar el menu</p>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 text-center">
                    <div class="service-box">
                        <i class="fa fa-4x fa-paper-plane wow bounceIn text-primary" data-wow-delay=".1s"></i>
                        <h3>Plato Principal</h3>
                        <p class="text-muted">Come algo sano y nutritivo disfrutandolo con tus compañeros</p>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 text-center">
                    <div class="service-box">
                        <i class="fa fa-4x fa-newspaper-o wow bounceIn text-primary" data-wow-delay=".2s"></i>
                        <h3>Bebida</h3>
                        <p class="text-muted">El comedor tambien acompaña tu comida con una fresca bebida</p>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 text-center">
                    <div class="service-box">
                        <i class="fa fa-4x fa-heart wow bounceIn text-primary" data-wow-delay=".3s"></i>
                        <h3>Postre</h3>
                        <p class="text-muted">Frescas y ricas frutas para el postre</p>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <section class="no-padding" id="portfolio">
        <div class="container-fluid">
            <div class="row no-gutter">
                <div class="col-lg-4 col-sm-6">
                    <a href="#" class="portfolio-box">
                        <img src="bootstrapIndex/img/portfolio/1.jpg" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    Instrucciones
                                </div>
                                <div class="project-name">
                                    Como acceder al comedor
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="#" class="portfolio-box">
                        <img src="bootstrapIndex/img/portfolio/2.jpg" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    Servicios
                                </div>
                                <div class="project-name">
                                    Servicios que te brinda el comedor
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="#" class="portfolio-box">
                        <img src="bootstrapIndex/img/portfolio/3.jpg" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    Dias y horarios
                                </div>
                                <div class="project-name">
                                    Los dias y horarios que funciona el comedor
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="#" class="portfolio-box">
                        <img src="bootstrapIndex/img/portfolio/4.jpg" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    Historia
                                </div>
                                <div class="project-name">
                                    Conoce un poco la historia del comedor
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="#" class="portfolio-box">
                        <img src="bootstrapIndex/img/portfolio/5.jpg" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    Sugerencias
                                </div>
                                <div class="project-name">
                                    Dejanos tu sugerencia
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="#" class="portfolio-box">
                        <img src="bootstrapIndex/img/portfolio/6.jpg" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    Como llegar
                                </div>
                                <div class="project-name">
                                    Instrucciones de como llegar a cada sede
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
            </div>
        </div>
    </section>

    <aside class="bg-dark">
        <div class="container text-center">
            <div class="call-to-action">
                <h2>Mira todos los tweets del comedor</h2>
                <a href="#" class="btn btn-default btn-xl wow tada">tweet al comedor</a>
            </div>
        </div>
    </aside>

    <section id="contact">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <h2 class="section-heading">Contacto</h2>
                    <hr class="primary">
                    <p>Equipo de programadores Informatica - UNLP , junto a Vanesa y Laura Fava</p>
                </div>
                <div class="col-lg-4 col-lg-offset-2 text-center">
                    <i class="fa fa-phone fa-3x wow bounceIn"></i>
                    <p>0221 -4123123</p>
                </div>
                <div class="col-lg-4 text-center">
                    <i class="fa fa-envelope-o fa-3x wow bounceIn" data-wow-delay=".1s"></i>
                    <p><a href="mailto:your-email@your-domain.com">comedor.universitario@gmail.com</a></p>
                </div>
            </div>
        </div>
    </section>

    <!-- jQuery -->
    <script src="bootstrapIndex/js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="bootstrapIndex/js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="bootstrapIndex/js/jquery.easing.min.js"></script>
    <script src="bootstrapIndex/js/jquery.fittext.js"></script>
    <script src="bootstrapIndex/js/wow.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="bootstrapIndex/js/creative.js"></script>

</body>

</html>
