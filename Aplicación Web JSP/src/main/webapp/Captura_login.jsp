<%@page import="java.sql.*"%>
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
	
	
	String usuario = request.getParameter("usuario");
	
	String contra = request.getParameter("contra");
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	try{
		
		Connection miConexion =DriverManager.getConnection("jdbc:mysql://localhost:3306/registro", "root", "toor");
		
		PreparedStatement miPr= miConexion.prepareStatement("SELECT * FROM USUARIOS WHERE USUARIO=? AND CONTRASENA=?");
		
		miPr.setString(1, usuario);
		
		miPr.setString(2,contra);
		
		ResultSet miRs = miPr.executeQuery();
		
		if(miRs.next()) out.println("usuario autorizado");
		
		else out.println("No existen usuarios con esa información");
			
	}catch(Exception e){
		e.printStackTrace();
	}
	
	%>

</body>
</html>