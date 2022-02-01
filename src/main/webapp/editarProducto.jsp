<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
rel="stylesheet" id="bootstrap-css">
<link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>

<meta charset="UTF-8">
<title>Editar</title>
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
			<form action="/productosLimpieza/ActualizarProducto" method="post"
				class="row g-3">
				<div class="col-md-3">
					<label class="form-label">ID</label>
					<input readonly type="text" class="form-control" id="idProducto"
					name="idProducto" value="${producto.getIdProducto()}">
				</div>
				<div class="col-md-6">
					<label class="form-label">Nombre del Producto</label> 
					<input type="text" class="form-control" id="nombreProducto"
						name="nombreProducto" value="${producto.getNombreProducto()}">
				</div>
				<div class="col-md-3">
					<label class="form-label">Precio</label>
					<input type="text" class="form-control" id="precioProducto"
						name="precioProducto" value="${producto.getPrecioProducto()}">
				</div>
				<div class="col-12">
					<label class="form-label">Descripción</label>
					<input type="text" class="form-control" id="descripcionProducto"
						name="descripcionProducto" value="${producto.getDescripcionProducto()}">
				</div>
				<div class="col-md-4">
					<label class="form-label">Categoría</label>
					<select class="form-select"	id="categoriaProducto" 
						name="categoriaProducto">
						<option selected value="1">Detergente Líquido</option>
						<option value="2">Detergente en polvo</option>
					</select>
				</div>
				<div class="col-12"></div>
				<div class="col-12">
					<button type="submit" class="btn btn-secondary">Guardar</button>
				</div>
			</form>
		</div>
	</section>

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"	integrity="sha384-kQtW33rZJAHjgefvhyyzcGF3C5TFyBQBA13V1RKPf4uH+bwyzQxZ6CmMZHmNBEfJ"	crossorigin="anonymous"></script>
</body>
</html>