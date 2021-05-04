package es.cristian.eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;



public class VariasFuentes {

	public static void main(String[] args) {
		
		MarcoFuentes mimarco = new MarcoFuentes();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoFuentes extends JFrame{
	 
	public MarcoFuentes() {
		
		setBounds(600,300,500,350);
		
		add(new LaminaFuentes());
		
		setVisible(true);
		
	}
	
	
}

class LaminaFuentes extends JPanel{
	//propiedades

	
	public LaminaFuentes() {
		/*JButton botonAzul = new JButton("Azul");
		
		JButton botonRojo = new JButton("Rojo");
		
		JButton botonVerde = new JButton("Verde");
		
		add(botonAzul);
		
		add(botonRojo);
		
		add(botonVerde);
		
		botonAzul.addActionListener(new ColorDeFondo(Color.blue));
		
		botonRojo.addActionListener(new ColorDeFondo(Color.RED));
		
		botonVerde.addActionListener(new ColorDeFondo(Color.GREEN));*/
		
		EventoColorFondo colorAzul = new EventoColorFondo("Azul", Color.BLUE);
		
		EventoColorFondo colorRojo = new EventoColorFondo("Rojo", Color.RED);
		
		EventoColorFondo colorVerde = new EventoColorFondo("Verde", Color.GREEN);
		
		add(new JButton(colorAzul));
		
		add(new JButton(colorRojo));
		
		add(new JButton(colorVerde));
		
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		//KeyStroke teclaAzul = KeyStroke.getKeyStroke("ctrl A");
		
		KeyStroke teclaRojo = KeyStroke.getKeyStroke("ctrl R");
		
		KeyStroke teclaVerde = KeyStroke.getKeyStroke("ctrl E");
		
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A")  , "Fondo azul");
		
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B")  , "Fondo azul");
		
		mapaEntrada.put(teclaRojo, "Fondo rojo");
		
		mapaEntrada.put(teclaVerde, "Fondo verde");
		
		ActionMap mapaAccion = getActionMap();
	
		mapaAccion.put("Fondo azul", colorAzul);
		
		mapaAccion.put("Fondo rojo", colorRojo);
		
		mapaAccion.put("Fondo verde", colorVerde);
	}
	private class ColorDeFondo implements ActionListener{
		//propiedades
		
		private Color colorDeFondo;
		
		//constructor
		
		public ColorDeFondo(Color c) {
			
			this.colorDeFondo = c;
			
		}
	

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			setBackground(colorDeFondo);
		}
	
	}
	private class EventoColorFondo extends AbstractAction{

		//constructor
		
		public EventoColorFondo(String nombre, Color color_fondo) {
			
			putValue(Action.NAME, nombre);
			
			putValue(Action.SHORT_DESCRIPTION, "Pone la lámina de color: " + nombre);
						
			putValue("Color_Fondo_JPanel", color_fondo);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Color c = (Color) getValue("Color_Fondo_JPanel");
			
			setBackground(c);
			
			System.out.println("Nombre " + getValue(Action.NAME) + " Descripción: " + getValue(Action.SHORT_DESCRIPTION));
			
		}
		
	}
}

