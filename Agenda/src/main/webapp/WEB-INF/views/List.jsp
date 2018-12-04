<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		
			</br>
</form>
		</c:forEach>

</body>
</html>