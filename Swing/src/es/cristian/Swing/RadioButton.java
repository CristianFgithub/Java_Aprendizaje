package es.cristian.Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marcoRadioButton miradio = new marcoRadioButton();
		
		miradio.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}

class marcoRadioButton extends JFrame{
	
	public marcoRadioButton(){
		
		setBounds(600,300,600,400);
		
		add(new LaminaRadioButton());
		
		setVisible(true);
	}
}

class LaminaRadioButton extends JPanel{
	//propiedades
	private JRadioButton boton1, boton2, boton3;
	
	
	//constructor
	public LaminaRadioButton() {
		
		ButtonGroup miGrupo = new ButtonGroup();
		
		boton1 = new JRadioButton("Masculino");
		
		boton2 = new JRadioButton("Femenino");
		
		boton3 = new JRadioButton("Neutro");
		
		boton1.addActionListener(new ManejaRadioButton());
		
		boton2.addActionListener(new ManejaRadioButton());
		
		boton3.addActionListener(new ManejaRadioButton());
		
		miGrupo.add(boton1);
		
		miGrupo.add(boton2);
		
		miGrupo.add(boton3);
		
		add(boton1);
		
		add(boton2);
		
		add(boton3);
		
	}
	
	private class ManejaRadioButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if (boton1.isSelected())System.out.println("Has seleccionado Masculino");
			if (boton2.isSelected())System.out.println("Has seleccionado Femenino");
			if(e.getSource()==boton3)System.out.println("Has seleccionado Neutro");
			
			
			
			
		}
		
		
	}
}