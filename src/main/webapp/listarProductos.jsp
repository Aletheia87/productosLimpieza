<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<link rel="stylesheet"
	href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
	integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous" />
<title>Productos</title>
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
			<table class="table">
				<thead class="table table-hover">
					<tr>
						<th>Id</th>
						<th>Nombre</th>
						<th>Precio</th>
						<th>Descripción</th>
						<th>Categoría</th>
						<th></th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="producto" items="${productos}">
						<tr>
							<td><c:out value="${producto.getIdProducto()}"></c:out></td>
							<td><c:out value="${producto.getNombreProducto()}"></c:out></td>
							<td><c:out value="${producto.getPrecioProducto()}"></c:out></td>
							<td><c:out value="${producto.getDescripcionProducto()}"></c:out></td>
							<td><c:out value="${producto.getNombreCategoria()}"></c:out></td>
							<td><a
								href="/productosLimpieza/EditarProducto?idProducto=${producto.getIdProducto()}"><i
									class="fas fa-pencil-alt"></i></a></td>
							<td><a
								href="/productosLimpieza/EliminarProducto?idProducto=${producto.getIdProducto()}"><i
									class="fas fa-trash"></i></a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</section>
	
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-kQtW33rZJAHjgefvhyyzcGF3C5TFyBQBA13V1RKPf4uH+bwyzQxZ6CmMZHmNBEfJ" crossorigin="anonymous"></script>
</body>
</html>