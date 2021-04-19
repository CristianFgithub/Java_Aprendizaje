package es.cristian.flujo;

import javax.swing.JOptionPane;

public class Condicional_If_Ejemplo {

	public static void main(String[] args) {
		
		int edad;
		
		edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
		
		if(edad >= 18) {
			System.out.println("Eres mayor de edad");
		}else {
			System.out.println("Eres menor de edad");
		}
		
	}

}
