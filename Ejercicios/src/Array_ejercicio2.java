import java.util.Scanner;

public class Array_ejercicio2 {

	public static void main(String[] args) {
		
		Scanner escaner=new Scanner(System.in);
		
		int suma=0;
		
		int media=0;

		int [] numeros=new int[10];
		
		for(int i=0;i<numeros.length;i++) {
			System.out.println("Introduce el número " + (i+1));
			numeros[i]=escaner.nextInt();
		}
		
		for(int z=0; z<numeros.length;z++) {
			if(z%2==1 && z!=0) {
				media++;
				suma=suma+numeros[z];
			}
		}
		
	System.out.println(suma/media);
		
	}

}
