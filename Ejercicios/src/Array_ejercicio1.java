import java.util.Scanner;

public class Array_ejercicio1 {

	public static void main(String[] args) {
		
		Scanner escaner=new Scanner(System.in);
		int cero=0;
		int positivo=0;
		int negativo=0;
		
		for(int i=1;i<11;i++) {
			System.out.println("Introduce el n?mero " + i);
			int numero=escaner.nextInt();
			if(numero==0)cero++;
			else if( numero>0)positivo++;
			else negativo++;
		}
	System.out.println("Hay " + cero +" n?meros con un cero, " + positivo + " n?meros positivos y " + negativo + " n?meros negativos");
	}
	

}
