
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    <%@ page import="java.util.*, java.sql.*,es.cristian.BasesDeDatos.*" %>

<%

	ArrayList<Pedidos> datosPedidos = new ArrayList<>();

	Class.forName("com.mysql.cj.jdbc.Driver");
	
	try{
		
		Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionpedidos","root","toor");
	
		Statement miSt = miConexion.createStatement();
		
		String miSql="SELECT * FROM PRODUCTOS";
		
		ResultSet miRs = miSt.executeQuery(miSql);
		
		while(miRs.next()){
			
			datosPedidos.add(new Pedidos(miRs.getString(2), miRs.getString(3)));
			
			
		}
		miRs.close();
		
		miConexion.close();
		
	}catch(Exception e){
		
		out.println("Ha ocurrido un error con la BBDD");
	}
	
	pageContext.setAttribute("LosPedidos", datosPedidos);
		
%>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<table>
		<tr style="font-weight:bold"><td>Sección</td><td>NombreArticulo</td></tr>
			<%	for(Pedidos e:datosPedidos){
				
					out.println("<td>"+ e.getSeccion()+"</td>"+"<td>"+e.getNombreArticulo()+"</td>");	
					
				}
				%>
			
			<c:forEach var="DatTemp" items="${datosPedidos}">
				
				<td>${e.seccion}</td><td> ${e.nombreArticulo}</td>
			
			</c:forEach>
	</table>
	
</body>
</html>