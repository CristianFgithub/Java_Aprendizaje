
public class Raiz_cuadrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crea una clase nueva con el nombre de �Raiz_cuadrada�. Declara dos variables de 
		 * tipo entero con los nombres de �numero� y �resultado�.

			Inicia la variable �numero� con el valor 9.

			Almacena en la variable �resultado� la ra�z cuadrada de �numero�.

			Al ejecutar el programa, deber� salir en consola el mensaje �La ra�z cuadrada 
			de 9 es 3� concatenando la cadena de texto con las variables �numero� y �resultado�.*/
		
		
		int numero, resultado;
		
		numero=9;
		
		resultado=(int)Math.sqrt(numero);
		
		System.out.println("La ra�z cuadrada de " + numero + " es " + resultado);
		
		
	}

}
