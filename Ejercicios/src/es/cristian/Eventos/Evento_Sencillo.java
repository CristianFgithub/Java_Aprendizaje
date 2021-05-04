package es.cristian.Eventos;



import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class Evento_Sencillo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoBotonesColores mimarco = new MarcoBotonesColores();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.addMouseListener(new EventosDeRaton());
		
		
	}

	
}


class MarcoBotonesColores extends JFrame{
	
	public MarcoBotonesColores() {
		
		setTitle("Botones y Eventos");
		
		setBounds ( 700, 300, 500, 300);
				
	}
}



class EventosDeRaton extends MouseAdapter{

public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
	
	if (e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) System.out.println("Has pulsado el botón izquierdo");
	
	else System.out.println("Has pulsado cualquier tecla del raton que no sea el botón izquierdo");
}	

}
		
		

		
	

	
	