package es.cristian.entradaSalida;

import java.util.Scanner;

public class EntradaScanner {

	public static void main(String[] args) {
		
		/*Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor");
		
		String nombre=entrada.nextLine();
		
		System.out.println("Hola " + nombre);
		
		System.out.println("Introduce tu primer n?, por favor");
		
		int numero1=entrada.nextInt();
		
		System.out.println("Introduce tu segundo n?, por favor");
		
		int numero2=entrada.nextInt();
		
		System.out.println("El resultado es: "+ (numero1+numero2));
		*/
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor");
	
		String nombre=entrada.nextLine();
		
		System.out.println("Introduce tu edad, por favor");
	
		int edad=entrada.nextInt();
		
		System.out.println("Te llamas " + nombre + " y tienes " + edad + "a?os");
		
		entrada.close();
	}

}
