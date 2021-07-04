package es.cristian.Swing;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoMenu mimarco = new MarcoMenu();
		
		mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}


class MarcoMenu extends JFrame{
	
	public MarcoMenu() {
		
		setBounds(600,300,600,400);
		
		add(new LaminaMenu());
		
		setVisible(true);
	}
	
	
}

class LaminaMenu extends JPanel{
	
	public LaminaMenu() {
		
		JMenuBar miBarra = new JMenuBar();
		
		//Aquí van los elementos del menú
		
		JMenu archivo = new JMenu("Archivo");
		
		JMenu edicion = new JMenu("Edición");
		
		JMenu herramientas = new JMenu("Herramientas");
		
		miBarra.add(archivo);
		miBarra.add(edicion);
		miBarra.add(herramientas);
		
		//Aquí van los elemenots de archivo
		
		JMenuItem guardar = new JMenuItem("Guardar");
		
		JMenuItem guardarComo = new JMenuItem("Guardar Como");
		
		guardarComo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Has pulsado en Guardar Como");
			}
		});
		
		archivo.add(guardar);
		
		archivo.add(guardarComo);
		
		//Aquí van los elementos de edicion
		JMenuItem cortar = new JMenuItem("Cortar");
		
		JMenuItem copiar = new JMenuItem("Copiar");
		
		JMenuItem pegar = new JMenuItem("Pegar");
		
		edicion.add(cortar);
		edicion.add(copiar);
		edicion.add(pegar);
		
		//Aquí van los elementos de Herramientas
		
		JMenuItem opciones = new JMenuItem("Opciones");
		
		JMenu preferencias = new JMenu("Preferencias");
		
		herramientas.add(opciones);
		
		herramientas.addSeparator();
		
		herramientas.add(preferencias);
		
		//Aquí van las opciones de preferencias
		
		JMenuItem ayuda = new JMenuItem("Ayuda");
		
		JMenuItem generales = new JMenuItem("Generales");
		
		preferencias.add(ayuda);
		
		preferencias.add(generales);
		
		add(miBarra);
		
		
		
	
	}

	
}