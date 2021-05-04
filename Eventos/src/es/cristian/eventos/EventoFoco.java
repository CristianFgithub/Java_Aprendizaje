package es.cristian.eventos;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

public class EventoFoco {

	public static void main(String[] args) {
			
		MarcoFoco mimarco = new MarcoFoco();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		

	}

}

class MarcoFoco extends JFrame {
	
	public MarcoFoco() {
		
		setBounds(500,300,400,250);
		
		add(new Lamina_Marco_Foco());
		
		setVisible(true);
	}	
		
}

class Lamina_Marco_Foco extends JPanel{
	//propiedades
	
	private JTextField campoTexto1, campoTexto2, campoTexto3;
	
	private JLabel etiq1, etiq2, etiq3;
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		campoTexto1 = new JTextField();
	
		campoTexto2 = new JTextField();
		
		campoTexto3 = new JTextField();
		
		etiq1 = new JLabel("Usuario");
		
		etiq2 = new JLabel("Contraseña");
		
		etiq3 = new JLabel ("Email");
		
		campoTexto1.setBounds(120,10,150,20);
		
		campoTexto2.setBounds(120,50,150,20);
		
		campoTexto3.setBounds(120,90,150,20);
		
		etiq1.setBounds(70,10,150,20);
		
		etiq2.setBounds(50,50,150,20);
		
		etiq3.setBounds(70,90,150,20);
		
		add(campoTexto1);
		
		add(campoTexto2);
		
		add(campoTexto3);
		
		add(etiq1);
		
		add(etiq2);
		
		add(etiq3);
		
		EventosDeFoco foco = new EventosDeFoco();
		
		campoTexto2.addFocusListener(foco);
		
		campoTexto1.addFocusListener(foco);
		
	}
	
	private class EventosDeFoco implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			

			
		}

		@Override
		public void focusLost(FocusEvent e) {
			if (e.getSource() == campoTexto1) {
				
				if(campoTexto1.getText().equals("")) {
					JOptionPane.showMessageDialog(getParent(), "El usuario no puede quedar vacio");
					campoTexto1.requestFocus();
				}
			}
			if (e.getSource()==campoTexto2) {
				
				if(campoTexto2.getText().equals("")) {
					JOptionPane.showMessageDialog(getParent(),"La contaseña no puede estar vacia");
					campoTexto2.requestFocus();
				}
			}
			
			
		}
		
	}
	
}


