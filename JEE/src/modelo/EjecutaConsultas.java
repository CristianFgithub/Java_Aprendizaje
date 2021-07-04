package modelo;

import java.sql.*;

public class EjecutaConsultas {
	
	private Conexion miConexion;
	
	private ResultSet rs;
	
	private PreparedStatement enviaConsSeccion;
	
	private final String CONSULTASECCION="SELECT NOMBREARTICULO, SECCION, PRECIO, PAISORIGEN FROM PRODUCTOS WHERE SECCION=?";
	
	private final String CONSULTAPAIS="SELECT NOMBREARTICULO, SECCION, PRECIO, PAISORIGEN FROM PRODUCTOS WHERE PAISORIGEN=?";
	
	private final String CONSULTAAMBAS="SELECT NOMBREARTICULO, SECCION, PRECIO, PAISORIGEN FROM PRODUCTOS WHERE PAISORIGEN=? AND SECCION=?";
	
	private final String CONSULTASOLA="SELECT NOMBREARTICULO, SECCION, PRECIO, PAISORIGEN FROM PRODUCTOS";

	public EjecutaConsultas() {
		
		miConexion=new Conexion();
	}
	
	public ResultSet consultaBBDD(String seccion, String pais) {
		
		Connection conecta = miConexion.getConexion();
		
		rs=null;
		try {
				if(!seccion.equals("Todas") && pais.equals("Todos")) {
					
						enviaConsSeccion= conecta.prepareStatement(CONSULTASECCION);
						
						enviaConsSeccion.setString(1, seccion);
						
						rs= enviaConsSeccion.executeQuery();
					

				}else if(seccion.equals("Todas") && !pais.equals("Todos")){
					
					enviaConsSeccion= conecta.prepareStatement(CONSULTAPAIS);
					
					enviaConsSeccion.setString(1, pais);
					
					rs= enviaConsSeccion.executeQuery();
					
				}else if(seccion.equals("Todas") && pais.equals("Todos")){
					
					enviaConsSeccion= conecta.prepareStatement(CONSULTASOLA);
				
					rs = enviaConsSeccion.executeQuery();
				}
				
				else {
					enviaConsSeccion= conecta.prepareStatement(CONSULTAAMBAS);
					
					enviaConsSeccion.setString(1, pais);
					
					enviaConsSeccion.setString(2, seccion);
					
					rs= enviaConsSeccion.executeQuery();
				}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
		
	}
	
	
	
	
	
	
}
