<%@page import="es.cristian.calculosmatematicos.CalculosM"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> Ejemplos de expresiones </h1>

Convirtiendo a mayúsculas: <%= new String("Juan").toUpperCase() %>

<br>

La suma de 6 y 2 es: <%= 6+2 %>

<br>

30 es mayor que 300: <%= 30>300 %>

<h1> Ejemplos de scriptles</h1>

<%

for (int i=0;i<10;i++){
	
	out.println("Vuelta de bucle nº: " + i + "<br>");
	
}

%>

<h1> Declaraciones </h1>

La suma es: <%= CalculosM.suma(9, 8)%>
<br>
La resta es: <%= CalculosM.resta(9, 8) %>
<br>
La multiplicación es: <%=CalculosM.multiplica(9, 8) %>
</body>
</html>