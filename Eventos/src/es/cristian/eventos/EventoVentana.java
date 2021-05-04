package es.cristian.eventos;

import java.awt.Frame;
import java.awt.event.*;

import javax.swing.JFrame;

public class EventoVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoEventoVentana mimarco = new MarcoEventoVentana();
		
		mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		mimarco.addWindowStateListener(new EventosDeVentana());
	}
	
}

class MarcoEventoVentana extends JFrame{
	
	public MarcoEventoVentana() {
		
		setBounds(300,300,600,350);
		
		setVisible(true);
	}
	
	
}

class EventosDeVentana implements WindowStateListener      /*extends WindowAdapter*/{

	@Override
	public void windowStateChanged(WindowEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("La ventana ha cambiado de estado");
	
		//System.out.println(e.getNewState());
		
		if(e.getNewState() == Frame.MAXIMIZED_BOTH)System.out.println("Esta maximizada");
		
	}

	/*public void windowClosed(WindowEvent e) {
		
		System.out.println("Gracias por trabajar en la app. Hasta pronto");
		
	}
	
	public void windowOpened(WindowEvent e ) {
		System.out.println("Bienvenido a la App");
	}*/
	
}