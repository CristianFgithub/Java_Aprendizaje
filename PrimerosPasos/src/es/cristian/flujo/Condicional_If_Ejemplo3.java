package es.cristian.flujo;

import javax.swing.JOptionPane;

public class Condicional_If_Ejemplo3 {

	public static void main(String[] args) {
		
		int distancia_colegio;
		
		double renta_familiar;
		
		byte hermanos_colegio;
		
		distancia_colegio=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu distancia desde tu casa al colegio"));

		renta_familiar=Double.parseDouble(JOptionPane.showInputDialog("Introduce renta familiar"));
		
		hermanos_colegio=Byte.parseByte(JOptionPane.showInputDialog("Cuantos hermanos tienes en el centro"));
			
		if (distancia_colegio >10 && renta_familiar<20000 || hermanos_colegio >=2) {
			System.out.println("Tienes derecho a beca");
		}else {
			System.out.println("No tienes derecho a beca");
		}
	}

}
