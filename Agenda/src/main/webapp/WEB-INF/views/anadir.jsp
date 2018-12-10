<%@ page language="java" contentType="text/html"  pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="/resources/css/anadir.css">

<title>Editar</title>
</head>
<body>
	<div class="container">

        <mvc:form modelAttribute="contacto" id="edit" action="/edit" method="post">
            <h3>EDITAR</h3>
            <p><br></p>
            <fieldset>
                <p class="titulo nombre"><mvc:label path="nombre">Nombre:</mvc:label></p>
            </fieldset>
            <fieldset>
                <p id="nombre" class="campo">
                <mvc:input path="nombre"  type="text"  
                value="${contacto.nombre}" /></p>
            </fieldset>
            <fieldset>
                <p class="titulo nombre"><mvc:label path="apellido1">Apellido1:</mvc:label></p>
            </fieldset>
            <fieldset>
                <p id="nombre" class="campo">
                <mvc:input path="apellido1"  type="text"  
                value="${contacto.apellido1}" /></p>
            </fieldset>
            <fieldset>
                <p class="titulo nombre"><mvc:label path="apellido2">Apellido2:</mvc:label></p>
            </fieldset>
            <fieldset>
                <p id="nombre" class="campo">
                <mvc:input path="apellido2"  type="text"  
                value="${contacto.apellido2}" /></p>
            </fieldset>
            
            <fieldset>
                <p class="titulo dni"><mvc:label path="dni">DNI:</mvc:label></p>
            </fieldset>
            <fieldset>
                <p id="dni" class="campo">
                <mvc:input path="dni" type="number" 
                value="${contacto.dni}"/></p>
            </fieldset>
            
            <fieldset>
                <p class="titulo fecha"><mvc:label path="fechaNacimiento">Fecha de nacimiento:</mvc:label></p>
            </fieldset>
            <fieldset>
                <p id="fecha" class="campo">
                <mvc:input path="fechaNacimiento" type="date" value="${contacto.fechaNacimiento}" /></p>
            </fieldset>
            
            <fieldset>
                <p class="titulo telefonos"><mvc:label path="telefonos">Telefonos:</mvc:label></p>
            </fieldset>
            <fieldset>
                <c:forEach var="telefono" items="${contacto.telefonos}" varStatus="status">
                    <p class="campo telefono">
                    <mvc:input path="telefonos" type="tel" value="${telefono.numero}" /></p>
                </c:forEach>
            </fieldset>
            <fieldset>
                <p class="titulo direccioncompleta"><mvc:label path="direccion">Direccion:</mvc:label></p>
            </fieldset>
            <fieldset>
                <p class="campo direccion">
                <mvc:input path="direccion" type="text"  value="${contacto.direccion.direccion}" /></p>
               
            </fieldset>
             <fieldset>
                <p class="titulo direccioncompleta"><mvc:label path="direccion.localidad">Localidad:</mvc:label></p>
            </fieldset>
            <fieldset>
            <p class="campo direccion">
                <mvc:input path="direccion.localidad" type="text"  value="${contacto.direccion.localidad}" /></p>
            </fieldset>
            <fieldset>
                <p class="titulo direccioncompleta"><mvc:label path="direccion.provincia.provincia">Provincia:</mvc:label></p>
            </fieldset>
            <fieldset>
            <p class="campo direccion">
                <mvc:input path="direccion.provincia.provincia" type="text"  value="${contacto.direccion.provincia.provincia}" /></p>
            </fieldset>
            <fieldset>
                <p class="titulo direccioncompleta"><mvc:label path="direccion.codpostal">Codigo Postal:</mvc:label></p>
            </fieldset>
            <fieldset>
            <p class="campo direccion">
                <mvc:input path="direccion.codpostal" type="text"  value="${contacto.direccion.codpostal}" /></p>
            </fieldset>
            <fieldset>
                <button name="add" type="submit" id="contact-add" data-submit="...Adding">AÑADIR</button>
            </fieldset>
        </mvc:form>


    </div>
</body>
</html>