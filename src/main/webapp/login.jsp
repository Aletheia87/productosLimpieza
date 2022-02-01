<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<title>Login</title>
</head>
<body>
	<section class="container mt-5">
		<div class="row">
			<div class="col-sm-4"></div>
			<div class="col-sm-4 ">
				<form action="/productosLimpieza/Login" method="post">
					<input type="text" class="form-control mt-3" id="user"
						name="user" placeholder="Nombre de usuario">
					<input type="password" class="form-control mt-3" id="password"
						name="password" placeholder="Password">
					<button class="btn btn-lg btn-secondary btn-block mt-3" 
						value="Login" type="submit">Enviar</button>
				</form>
			</div>
			<div class="col-sm-4"></div>
		</div>
	</section>	
</body>
</html>