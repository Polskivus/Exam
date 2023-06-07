<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Parcelas</title>
</head>
<body>

	<h1>Parcelas disponibles</h1>
	
	<table class="table table-striped">
		
		<thead>
			<tr>
				<th scope="col">Id parcela</th>
				<th scope="col">Numero parcela</th>
				<th scope="col">m<sub>2</sub></th>
				<th scope="col">Precio por dia</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach items="${parcelas }" var="parcela">
				<tr>
					<td>${parcela.id}</td>
					<td>${parcela.numero }</td>
					<td>${parcela.mCuadrados }</td>
					<td>${parcela.precio_dia }</td>
					<td>
						<button>
							<a href="ReservaParcela?id=${parcela.id}">Reservar</a>
						</button>
					</td>
					<td>
						<button>
							<a href="EliminarParcela?id=${parcela.id }">Eliminar</a>
						</button>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<form method="post" action="Inicio">
		
		<label for="numero_parcela">Numero parcela</label>
		<input type="text" id="nparcela" name="nparcela">
		
		<label for="metros_parcela">M<sub>2</sub> parcela</label>
		<input type="text" id="mparcela" name="mparcela">
		
		<label for="precio_parcela">Precio Parcela</label>
		<input type="text" id="pparcela" name="pparcela">
		
		<input type="submit" value="Insertar parcela">
	</form>

</body>
</html>