package es.cristian.flujo;

import javax.swing.JOptionPane;

public class EjemploWhile_1 {

	public static void main(String[] args) {
		
		String clave="Cristian";
		
		String acceso="";
		
		while(!clave.equals(acceso)) {
			
			acceso=JOptionPane.showInputDialog("Introduce la clave de acceso por favor");
			
			if(!clave.equals(acceso)) {
				System.out.println("La clave es incorreta");
			}
		}
		System.out.println("Bienvenido a la zona de usuarios");
	}

}
