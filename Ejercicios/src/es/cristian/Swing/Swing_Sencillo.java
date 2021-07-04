package es.cristian.Swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.*;

public class Swing_Sencillo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCuadroTexto mimarco = new MarcoCuadroTexto();
		
		mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
	
	}

}


class MarcoCuadroTexto extends JFrame{
	
	public MarcoCuadroTexto() {
		
		setBounds(600,300,600,400);
		
		add(new LaminaCuadroTexto());
		
		setVisible(true);
	}
	
	
}

class LaminaCuadroTexto extends JPanel{
	// propiedades
	
	JTextField cuadroTexto;
	
	JLabel cuadroTexto2;
	
	//constructor
	public LaminaCuadroTexto() {
		
		
		
		setLayout(new GridLayout(3,0));
		
		cuadroTexto = new JTextField(20);
		
		add(cuadroTexto);
		
		JButton boton = new JButton("Comprobar email");
		
		boton.addActionListener(new ObtenerTexto());
		
		add(boton);
		
		cuadroTexto2 = new JLabel("");
		
		add(cuadroTexto2);
		
	}
	
	private class ObtenerTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			String texto = cuadroTexto.getText();
			
			int arroba=0;
			
			for (int i=0; i<texto.length();i++) {
				
				if(texto.charAt(i) == '@') arroba++;
				
			}
			
			if(arroba!=1) cuadroTexto2.setText("Email Incorrecto");
			else cuadroTexto2.setText("Email Correcto");
			
			
			
			
		}
		
	}
	
}