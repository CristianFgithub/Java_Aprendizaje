package es.cristian.eventos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class EventoRaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoEventoRaton mimarco = new MarcoEventoRaton();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		mimarco.addMouseMotionListener(new EventosDeRaton());
	}

}

class MarcoEventoRaton extends JFrame{
	
	public MarcoEventoRaton() {
		
		setBounds (300,300,600,350);
		
		setVisible (true);
	}
}

/*class EventosDeRaton extends MouseAdapter{
	
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("X= " + e.getX() + "\nY= " + e.getY());
		
		if (e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) System.out.println("Has pulsado el botón izquierdo");
	
	}

}*/

class EventosDeRaton implements MouseMotionListener {

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Estás arrastrando el ratón");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Estas moviendo el ratón");
	}
	
}






