import java.util.Scanner;

public class RaizScanner {

	public static void main(String[] args) {
		
		Scanner escaner=new Scanner(System.in);
		
		System.out.println("Introduce un n?mero");
		
		int numero = escaner.nextInt();
		
		System.out.println("La raiz cuadrada de " + numero + " es: " + Math.sqrt(numero));

		escaner.close();
	}

}
