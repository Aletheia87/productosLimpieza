<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<meta charset="UTF-8">
<title>Nuevo</title>
</head>
<body>
	<header>
		<nav class="navbar navbar-dark bg-dark">
			<div class="container-fluid">
				<a class="navbar-brand" href="/productosLimpieza/Inicio">Home</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarNav"
					aria-controls="navbarNav" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarNav">
					<ul class="navbar-nav">
						<li class="nav-item"><a class="nav-link" href="/productosLimpieza/insertarProductos">Nuevo</a>
						</li>
						<li class="nav-item"><a class="nav-link" href="/productosLimpieza/Categorias">Categorías</a>
						</li>
					</ul>
				</div>
			</div>
		</nav>
	</header>

	<section>
		<div class="container mt-5">
			<form action="/productosLimpieza/insertarProductos" method="post"
				class="row g-3">

				<div class="col-md-6">
					<label class="form-label">Nombre del Producto</label> 
					<input type="text" class="form-control" id="nombreProducto"
						name="nombreProducto">
				</div>
				<div class="col-md-6">
					<label class="form-label">Precio</label>
					<input	type="text" class="form-control" id="precioProducto"
						 name="precioProducto">
				</div>
				<div class="col-6">
					<label class="form-label">Descripción</label> 
					<input type="text" class="form-control" id="descripcionProducto"
						name="descripcionProducto">
				</div>
				<div class="col-md-6">
					<label class="form-label">Categoría</label>
					<select  class="form-select" id="categoriaProducto"
						name="categoriaProducto">
						<option selected value="1">Detergente Líquido</option>
						<option value="2">Detergente en polvo</option>
					</select>
				</div>
				<div class="col-12"></div>
				<div class="col-12">
					<button type="submit" class="btn btn-secondary">Enviar</button>
				</div>
			</form>
		</div>
	</section>
</body>
</html>