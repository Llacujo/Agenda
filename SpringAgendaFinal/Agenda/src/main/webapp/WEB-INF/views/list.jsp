<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="/resources/css/listfinal.css">
<link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">	
			<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
<title>Agenda Lucatic</title>
</head>

<body>
	<div class="container">

<div id="contact">
		<h3>CONTACTOS</h3>
		
		<div id="anadir" >
		<a id="icono" href="anadir"><i class="fas fa-user-plus fa-3x mb-3"></i></a>
		</div>
		<c:forEach var="contacto" items="${listaContacto}">
			
			<fieldset>
		<a href="detalle?id=${contacto.idContacto}" class="contacto">${contacto.nombre} ${contacto.apellido1} ${contacto.apellido2}</a>
				
			</fieldset>
		</c:forEach>

</div>
	</div>
</body>

</html>
