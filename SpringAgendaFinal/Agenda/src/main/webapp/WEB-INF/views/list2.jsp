<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		
			<title>CONTACTOS</title>
			
			<!-- CSS de estilos -->
   			<link rel="stylesheet" type="text/css" href="/resources/css/list.css">
   	      	 
   	        
			<!-- Fuentes -->
			<link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">	
			<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
	</head>
	
	<body>
	
	<!-- Sección: Cabecera de la página -->
	<div class="container">
	    <div class="cabeCera">	
				<h3>CONTACTOS</h3>
				<a href="anadir"><i class="fas fa-user-plus fa-3x mb-3"></i></a>
		</div>
	<!-- Sección: Tabla de contactos -->
	  <section id="tabla" class="tabla-seccion text-center">	
		<table border="1">
				
				<tr>
					<th>Lista de contactos</th>
				</tr> 
				
				<c:forEach var="contacto" items="${listaContacto}" varStatus="status">
					<tr>
					<td>${contacto.nombre}</td>
					<td>${contacto.apellido1}</td>
					<td>${contacto.apellido2}</td>
					<td><a href="detalle?id=${contacto.idContacto}">Detallar</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a href="borrar?id=${contacto.idContacto}">Eliminar</a>
					</td>
				</tr>
				</c:forEach> 
			
		</table>			
	 </section>
	</div>
	</body>
</html>			
			
			
			


<!-- ---------- 

---------------------------------- - TABLA DE EJERCICIO 11 - -------------------
		<table border="1">
		<tr>
			<th>Nº</th>
			<th>Usuario</th>
			<th>Email</th>
			<th>Acciones</th>
			</tr>

			<c:forEach var="user" items="${userList}" varStatus="status">
				<tr>
					<td>${status.index + 1}</td>
					<td>${user.username}</td>
					<td>${user.email}</td>
					<td><a href="edit?id=${user.id}">Modificar</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a href="delete?id=${user.id}">Eliminar</a>
					</td>
				</tr>
			</c:forEach>
		</table>

<!-- -------------- CODIGO ORIGINAL MIGUEL EN LIST -->

<!-- 


<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">


<title>CONTACTOS</title>
</head>
			<body>
 					<c:forEach var="contacto" items="${listaContacto}" > 
 						<form action="detalle"  method="get"> 
    						<input type="submit" value="${contacto.idContacto}" />		
						</form>
					</c:forEach>
			</body>
</html>








 -->



