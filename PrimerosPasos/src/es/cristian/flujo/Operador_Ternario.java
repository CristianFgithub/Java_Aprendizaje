package es.cristian.flujo;

import javax.swing.JOptionPane;

public class Operador_Ternario {

	public static void main(String[] args) {
		/*
		double salariot1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer salario"));
		
		double salariot2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo salario"));
	
		double salario_mayor;
		
		if(salariot1>salariot2) salario_mayor=salariot1;
		
		else salario_mayor=salariot2;
		
		salario_mayor=(salariot1>salariot2)?salariot1:salariot2;
		
		System.out.println("El salario mayor es: " + salario_mayor);
		
		*/
		
		int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad, por favor"));
		
		String mayor=(edad>18)?"Eres mayor de edad":"Eres menor de edad";
		
		System.out.println(mayor);
		
		
		
	}

}
