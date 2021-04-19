package es.cristian.flujo;

import javax.swing.JOptionPane;

public class Do_While {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Este programa cuenta los caracteres de la palabra o frase introducida \n "
				+ "Para terminar escribe salir");
		
		String texto;
		
		do{
			
			texto = JOptionPane.showInputDialog("Introduce el texto");
			
			JOptionPane.showMessageDialog(null, "El texto introducio tiene " +texto.length() + 
					" caracteres");
			
		} while(!texto.equals("Salir"));
		System.out.println("Has salido del programa");
	}

}
