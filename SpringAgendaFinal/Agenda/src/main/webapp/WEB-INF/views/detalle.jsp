<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="/resources/css/detalle.css">
    <title>Agenda Lucatic</title>
</head>

<body>
    <div class="container">

        <mvc:form id="contact" action="editar?id=${contacto.idContacto}" method="post">
            <h3>DETALLE</h3>
            <p><br></p>
            <fieldset>
                <p class="titulo nombre">Nombre:</p>
            </fieldset>
            <fieldset>
                <p id="nombre" class="campo">${contacto.nombre} ${contacto.apellido1} ${contacto.apellido2}</p>
            </fieldset>
            <fieldset>
                <p class="titulo dni">DNI:</p>
            </fieldset>
            <fieldset>
                <p id="dni" class="campo">${contacto.dni}</p>
            </fieldset>
            <fieldset>
                <p class="titulo fecha">Fecha de nacimiento:</p>
            </fieldset>
            <fieldset>
                <p id="fecha" class="campo">${contacto.fechaNacimiento}</p>
            </fieldset>
            <fieldset>
                <p class="titulo telefonos">Telefonos:</p>
            </fieldset>
            <fieldset>
                <c:forEach var="telefono" items="${contacto.telefonos}" varStatus="status">
                    <p class="campo telefono">${telefono.numero}</p>
                </c:forEach>
            </fieldset>
            <fieldset>
                <p class="titulo direccioncompleta">Direccion:</p>
            </fieldset>
            <fieldset>

                <p class="campo direccion">${contacto.direccion.direccion}</p>
                <p class="campo direccion">${contacto.direccion.localidad} ${contacto.direccion.provincia.provincia} ${contacto.direccion.codpostal}</p>
            </fieldset>
            <fieldset>
                <button name="editar" type="submit" id="contact-edit" data-submit="...Loading">EDITAR</button>
                <a href="borrar?id=${contacto.idContacto}" id="contact-delete">ELIMINAR</a>
            </fieldset>
        </mvc:form>


    </div>
</body>

</html>
