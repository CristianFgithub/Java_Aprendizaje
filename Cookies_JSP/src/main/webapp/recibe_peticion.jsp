<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

	//Leer la información que viene del formulario
	String ciudad_favorita = request.getParameter("ciudad_favorita");
	
	
	//Crear la cookie y guardan la información del formulario
	
	Cookie miCookie = new Cookie("selecionVuelos.ciudad_favorita",ciudad_favorita);
	
	
	//Establecer la vida de la cookie
	
	miCookie.setMaxAge(365*24*60*60);
	
	
	//Guardar/enviar la cookie al ordenador del usuario
	
	response.addCookie(miCookie);



%>

Ver vuelos: <a href="Aerolinea_vuelos.jsp">Clic aquí</a>

</body>
</html>