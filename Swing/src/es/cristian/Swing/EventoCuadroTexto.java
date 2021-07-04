package es.cristian.Swing;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import javax.swing.*;

public class EventoCuadroTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCuadroEvento mimarco = new MarcoCuadroEvento();
		
		mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}


class MarcoCuadroEvento extends JFrame{
	
	public MarcoCuadroEvento() {
		
		setBounds(600,300,600,400);
		
		add(new LaminaCuadroEvento());
		
		setVisible(true);
	}
	
	
}

class LaminaCuadroEvento extends JPanel{
	
	public LaminaCuadroEvento() {
		
		JTextField cuadroTexto = new JTextField(20);
		
		Document midocumento = cuadroTexto.getDocument();
		
		midocumento.addDocumentListener(new EscuchaTexto());
		
		add(cuadroTexto);
		
	}
	
	private class EscuchaTexto implements DocumentListener{

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Has introducido texto");
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("has borrado texto");
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
	}
	
}