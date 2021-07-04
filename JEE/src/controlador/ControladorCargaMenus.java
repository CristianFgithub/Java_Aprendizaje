package controlador;

import java.awt.event.*;
import java.sql.ResultSet;

import modelo.CargaMenu;
import vista.*;

public class ControladorCargaMenus extends WindowAdapter{

	public ControladorCargaMenus(MarcoMVC miJFrame) {
		
		this.miJFrame = miJFrame; 
		
	}
	
	private MarcoMVC miJFrame;
	
	CargaMenu obj = new CargaMenu();
	
	public void windowOpened(WindowEvent e) {
		
		resultadosCombos= new ResultSet[2];
		
		resultadosCombos=obj.ejecutaConsultas();
		
		try {			
			
			while(resultadosCombos[0].next()) {
				
				miJFrame.getSecciones().addItem(resultadosCombos[0].getString(1));

			}
			while(resultadosCombos[1].next()) {
				
				miJFrame.getPaises().addItem(resultadosCombos[1].getString(1));

			}
			
		}catch(Exception ev) {
			
			ev.printStackTrace();
		}
		
		
	}
	private ResultSet [] resultadosCombos;
	
}
