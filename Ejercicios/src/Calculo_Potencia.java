
public class Calculo_Potencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crea una clase nueva con el nombre de ?Calculo_Potencia?. 
		 * Declara dos variables en la misma l?nea con los nombres de 
		 * ?base? y ?exponente?.

		En la siguiente l?nea de c?digo inicia la variable ?base? 
		en 5. A continuaci?n inicia la variable ?exponente? en 12.

		Crea una variable con el nombre de ?resultado? donde se
		almacenar? el c?lculo de ?base? elevado a ?exponente?.

		Al ejecutar el programa, deber? salir en consola el 
		mensaje ?5 elevado a 12 es igual a 244140625? concatenando
		la cadena de texto con las variables ?base?, ?exponente?
		y ?resultado?.*/
		
		int base, exponente;
		
		base=5;
		exponente=12;
		
		int resultado=(int)Math.pow(base, exponente);
		
		System.out.println(base + " elevado a " + exponente + " es igual a: " + resultado);
		
		
	}

}
