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
	
	String nombre = request.getParameter("nombre");
	
	String apellido = request.getParameter("apellido");
	
	String usuario = request.getParameter("usuario");
	
	String contra = request.getParameter("contra");
	
	String pais = request.getParameter("pais");
	
	String tecno = request.getParameter("tecnologias");
	
	Class.forName("com.mysql.jdbc.Driver");
	
	try{
		
		Connection miConexion =DriverManager.getConnection("jdbc:mysql://localhost:3306/registro", "root", "toor");
		
		Statement miST= miConexion.createStatement();
		//comprobar si existe
		
		PreparedStatement miPr= miConexion.prepareStatement("SELECT * FROM USUARIOS WHERE USUARIO=?");
		
		miPr.setString(1, usuario);
		
		ResultSet miRs = miPr.executeQuery();
		
		if(miRs.next())out.println("Usuario Repetido");
		else{
		//-----------------------------
			
			String inSql = "INSERT INTO USUARIOS (Nombre,Apellido,Usuario,Contrasena,Pais,Tecnologia) VALUES('"+ nombre +"','"+apellido+"','"+ usuario+"','"+contra+"','"+pais+"','"+tecno+"')";
			
			miST.executeUpdate(inSql);
			
			out.println("Usuario Registrado con exito");
		}	
	
	}catch(Exception e){
		e.printStackTrace();
	}
	
	%>

</body>
</html>