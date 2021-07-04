package es.cristian.jdbc;


import java.sql.*;
public class ActualizaTabla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		
		try {
			
			// 1. Crear Conexión
			
			
			Connection conx = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionpedidos", "root", "toor");
		
			//2. crear statement
			
			Statement miSt = conx.createStatement();
			
			//3. ejecutar instruccion SQL
			//insertar
			//String inSQL = "INSERT INTO PRODUCTOS (CODIGOARTICULO,NOMBREARTICULO,PRECIO) VALUES ('AR42','CAMISA FLORES',25)";
			//modificar
			//String inSQL = "UPDATE PRODUCTOS SET PRECIO=45 WHERE CODIGOARTICULO='AR42'";
			//DELETE
			String inSQL = "DELETE FROM PRODUCTOS WHERE CODIGOARTICULO='AR42'";
			
			// 4. Ejecutar SQL
			
			miSt.executeUpdate(inSQL);
			
			System.out.println("Has insertado un registro correctamente");
			
			conx.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
