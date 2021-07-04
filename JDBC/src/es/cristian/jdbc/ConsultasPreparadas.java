package es.cristian.jdbc;


import java.sql.*;
public class ConsultasPreparadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		
		try {
			
			// 1. Crear Conexión
			
			
			Connection conx = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionpedidos", "root", "toor");
		
			//2. crear statement
			String sentencia = "SELECT NOMBREARTICULO,SECCION,PRECIO,PAISORIGEN FROM PRODUCTOS WHERE SECCION=? AND PAISORIGEN=?";
			
			PreparedStatement miPst = conx.prepareStatement(sentencia);
			
			miPst.setString(1, "confección");
			
			miPst.setString(2, "España");
			
			//3. ejecutar instruccion SQL
			
			ResultSet miRs = miPst.executeQuery();
			
			// 4. Ejecutar SQL
			
			while(miRs.next()) {
				
				System.out.println(miRs.getString(1)+ " " + miRs.getString(2) + " " + miRs.getString(3) + " " + miRs.getString(4));
			}
			
			miRs.close();
			
			conx.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}