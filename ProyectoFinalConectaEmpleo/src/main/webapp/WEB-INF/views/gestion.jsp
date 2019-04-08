<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Design Responsive -->
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- Estilos propios y de bootstrap 4.x	 -->
<link rel="stylesheet"
	href="<c:url value='/resources/project/css/gestion.css'/>" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<!-- Scripts propios y de Frameworks -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="<c:url value='/resources/project/js/comunes.js' />"></script>
<script src="<c:url value='/resources/project/js/reservarVuelo.js' />"></script>
<script src="<c:url value='/resources/project/js/index.js' />"></script>
<title>Gestión de clientes</title>
</head>
<body>
	<div class="container">
		<div class="row" id="cabecera"></div>
		<div class="row" id="contenido">
			<div class="col-sm-3" id="menu">
				<nav class="navbar bg-light">

					<!-- Links -->
					<ul class="navbar-nav">
						<li class="nav-item"><a class="nav-link" href="#">Clientes</a>
						</li>
						<li class="nav-item"><a class="nav-link" href="#">Crear
								Cliente</a></li>
						<li class="nav-item"><a class="nav-link" href="#">Visitas</a>
						</li>
						<li class="nav-item"><a class="nav-link" href="#">Añadir
								visita</a></li>
					</ul>

				</nav>
			</div>
			<div class="col-sm-9" id="vistaGeneral">
				<iframe class="embed-responsive-item" id="cliente" name="clientes"
					width="100%" height="100%"></iframe>
			</div>


		</div>

	</div>



</body>
</html>