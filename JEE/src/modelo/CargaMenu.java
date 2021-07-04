package modelo;

import java.sql.*;

public class CargaMenu {
	
	private Conexion miConexion;
	public ResultSet resSec;
	public ResultSet resPaises;
	
	public ResultSet resPor;
	private ResultSet resultadosConsultas [];
	
	
	public CargaMenu() {
		
		miConexion = new Conexion();
		
		
		
	}
	
	public ResultSet[] ejecutaConsultas() {
		
		Connection accesoBBDD = miConexion.getConexion();
		
		ResultSet resSec = null;
		
		ResultSet resPaises = null;
		
		try {
			
			Statement secciones = accesoBBDD.createStatement();
			
			resSec = secciones.executeQuery("SELECT DISTINCTROW SECCION FROM PRODUCTOS");

			Statement paises  = accesoBBDD.createStatement();
			
			resPaises = paises.executeQuery("SELECT DISTINCTROW PAISORIGEN FROM PRODUCTOS");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		resultadosConsultas = new ResultSet[2];
		
		resultadosConsultas[0] = resSec;
		
		resultadosConsultas[1] = resPaises;
		
		return resultadosConsultas;
		
	}

	

}
