<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
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

        <mvc:form modelAttribute="contacto" id="edit" action="/edition" method="post">
            <h3>EDITAR</h3>
            <p><br></p>
             <mvc:hidden path="idContacto" />
            <!-- Nombre -->
            
            <fieldset>
                <p class="titulo nombre"><mvc:label path="nombre">Nombre:</mvc:label></p>
            </fieldset>
            <fieldset>
                <p id="nombre" class="campo">
                <mvc:input path="nombre"  type="text"  
                value="${contacto.nombre}" /></p>
            </fieldset>
            
            <!-- Apellido1 -->
            
            <fieldset>
                <p class="titulo nombre"><mvc:label path="apellido1">Apellido1:</mvc:label></p>
            </fieldset>
            <fieldset>
                <p id="nombre" class="campo">
                <mvc:input path="apellido1"  type="text"  
                value="${contacto.apellido1}" /></p>
            </fieldset>
            
      		<!-- Apellido 2 -->
      		
            <fieldset>
                <p class="titulo nombre"><mvc:label path="apellido2">Apellido2:</mvc:label></p>
            </fieldset>
            <fieldset>
                <p id="nombre" class="campo">
                <mvc:input path="apellido2"  type="text"  
                value="${contacto.apellido2}" /></p>
            </fieldset>
            
            <!-- DNI -->
            
            <fieldset>
                <p class="titulo dni"><mvc:label path="dni">DNI:</mvc:label></p>
            </fieldset>
            <fieldset>
                <p id="dni" class="campo">
                <mvc:input path="dni" type="number" 
                value="${contacto.dni}"/></p>
            </fieldset>
            
            <!-- Fecha de Nacimineto -->
            
            <fieldset>
                <p class="titulo fecha"><mvc:label path="fechaNacimiento">Fecha de nacimiento:</mvc:label></p>
            </fieldset>
            <fieldset>
                <p id="fecha" class="campo">
                <mvc:input path="fechaNacimiento" type="date" value="${contacto.fechaNacimiento}" /></p>
            </fieldset>
            
            <!-- Telefonos -->
            
            <fieldset>
                <p class="titulo telefonos"><mvc:label path="telefonos">Telefonos:</mvc:label></p>
            </fieldset>
            
                <c:forEach var="telefono" items="${contacto.telefonos}" varStatus="status">
                   <fieldset>
                    <p class="campo telefono">
                    <mvc:input path="telefonos[${status.index}].numero" type="tel" value="${telefono.numero}" /></p>
                    <mvc:hidden path="telefonos[${status.index}].idTelefono" value="${telefono.idTelefono}" />
                    <mvc:hidden path="telefonos[${status.index}].contacto.idContacto" value="${telefono.contacto.idContacto}" />
                    </fieldset>
                    
                </c:forEach>
          
            <!-- Direccion -->
            
            <fieldset>
                <p class="titulo direccioncompleta"><mvc:label path="direccion">Direccion:</mvc:label></p>
            </fieldset>
            <fieldset>
                <p class="campo direccion">
                <mvc:input path="direccion" type="text"  value="${contacto.direccion.direccion}" /></p>
               
            </fieldset>
            
            <!--  Localidad -->
            
             <fieldset>
                <p class="titulo direccioncompleta"><mvc:label path="direccion.localidad">Localidad:</mvc:label></p>
            </fieldset>
            <fieldset>
            <p class="campo direccion">
                <mvc:input path="direccion.localidad" type="text"  value="${contacto.direccion.localidad}" /></p>
            </fieldset>
            
            <!-- Provicncia -->
            
            <fieldset>
                <p class="titulo direccioncompleta"><mvc:label path="direccion.provincia.provincia">Provincia:</mvc:label></p>
            </fieldset>
            <fieldset>
            <p class="campo direccion">
                <mvc:input path="direccion.provincia.provincia" type="text"  value="${contacto.direccion.provincia.provincia}" /></p>
            </fieldset>
            
       		<!-- Codigo Postal -->
       		
            <fieldset>
                <p class="titulo direccioncompleta"><mvc:label path="direccion.codpostal">Codigo Postal:</mvc:label></p>
            </fieldset>
            <fieldset>
            <p class="campo direccion">
                <mvc:input path="direccion.codpostal" type="text"  value="${contacto.direccion.codpostal}" /></p>
            </fieldset>
            
            <!-- Boton Submit -->
            <fieldset>
                <button name="add" type="submit" id="contact-add" data-submit="...Adding">AÑADIR</button>
            </fieldset>
        </mvc:form>


    </div>
</body>
</html>