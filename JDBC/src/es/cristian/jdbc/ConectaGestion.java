package es.cristian.jdbc;

import java.sql.*;
public class ConectaGestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		
		try {
			
			// 1. Crear Conexión
			
			
			Connection conx = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionpedidos", "root", "toor");
		
			//2. crear statement
			
			Statement miSt = conx.createStatement();
			
			//3. ejecutar instruccion SQL
			
			ResultSet miRs = miSt.executeQuery("SELECT * FROM PRODUCTOS");

			//4. Leer el resultset
			
			while(miRs.next()) {
				
				System.out.println(miRs.getString(1)+ " " + miRs.getString(3));
			}
			
			miRs.close();
			
			conx.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
