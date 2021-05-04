package es.cristian.eventos;

import java.awt.event.*;

import javax.swing.JFrame;

public class EventoTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoEventoTeclado mimarco = new MarcoEventoTeclado();
		
		mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		mimarco.addKeyListener(new EventoDeTeclado());
	}

}


class MarcoEventoTeclado extends JFrame{
	
	public MarcoEventoTeclado() {
		
		setBounds(300,300,600,350);
		
		setVisible(true);
	}
	
}

class EventoDeTeclado implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	//	System.out.println("Has tecleado una tecla");
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//if(e.getKeyCode() == KeyEvent.VK_J)  System.out.println("Has pulsado la tecla J" );
	
		System.out.println("Has pulsado la tecla: " + e.getKeyText(e.getKeyCode()));
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	//	System.out.println("Has soltado una tecla");
	}
	
	
}