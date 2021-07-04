package es.cristian.BBDD;

import java.awt.*;
import java.sql.*;

import javax.swing.*;

public class AplicacionUniversal {
	
	public static void main(String[] args) {
		
		MarcoBBDD miJframe= new MarcoBBDD();
		
		miJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		miJframe.setVisible(true);
	
	}
	
}


class MarcoBBDD extends JFrame{
	
	public MarcoBBDD(){
		
		setBounds(300,300,700,700);
		
		PanelBBDD miPanel = new PanelBBDD();
		
		add(miPanel);
		
		
	}
	
	
}

class PanelBBDD extends JPanel{
	
	private Connection miConexion;
	
	private JComboBox tablas;
	
	private JTextArea info;
	
	
	public PanelBBDD(){
		
		setLayout(new BorderLayout());
		
		tablas = new JComboBox();
		
		info = new JTextArea();
		
		add(tablas, BorderLayout.NORTH);
		
		add(info, BorderLayout.CENTER);
		
		conectaBBDD();
		
		nombreTablas();
		
	}
	
	public void conectaBBDD() {
		
		miConexion = null;
		
		try {
			
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionpedidos","root","toor");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	public void nombreTablas() {
		
		ResultSet miRs = null;
		
		try {
			
			DatabaseMetaData datosBBDD = miConexion.getMetaData();
			
			miRs = datosBBDD.getTables(null, null, null, null);
			
			while(miRs.next()) {
				
				tablas.addItem(miRs.getString("TABLE_NAME"));
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}