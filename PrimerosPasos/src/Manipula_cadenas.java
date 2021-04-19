
public class Manipula_cadenas {

	public static void main(String[] args) {
		
		
		String nombre="Cristian";
		
		System.out.println("Mi nombre es " + nombre);
		
		System.out.println("La longitud de mi nombre es " + nombre.length());
		
		System.out.println("La posicion 2 de mi nombre es " + nombre.charAt(1));
		
		int ultima_letra=nombre.length();
		
		System.out.println("La última letra de mi nombre es: " +nombre.charAt(ultima_letra-1));
		
		String frase="No hay nada mejor que levantarse un domingo para estudiar";
		
		System.out.println(frase.substring(22,43));
		
		String palabra1="Casa";
		
		String palabra2="Casa";
		
		System.out.println(palabra1.equals(palabra2));
			
		palabra2="casa";
		
		System.out.println(palabra1.equals(palabra2));
		
		System.out.println(palabra1.equalsIgnoreCase(palabra2));
		
		palabra2="micasa";
		
		System.out.println(palabra1.equalsIgnoreCase(palabra2));
		
		
	}

}
