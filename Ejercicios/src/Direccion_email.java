import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Direccion_email {

	public static void main(String[] args) {
		/*En este ejercicio se pide al usuario que introduzca su 
		 * direcci?n de email con ayuda de la clase JOptionPane.

		Una vez introducido el email, el programa debe decir si la direcci?n 
		de email es correcta o no teniendo en cuenta los siguientes requisitos:

	    Debe tener una @
	    No debe tener m?s de una @
	    Debe tener un punto
	    La direcci?n de email debe tener al menos 4 caracteres.
	
		El programa pedir? introducir indefinidamente la direcci?n de email 
		si no es correcta o si tienes menos de 4 caracteres.*/
		boolean valido=false;
			
		do {
			 String email = JOptionPane.showInputDialog("Introduce tu email");
			 
			 int arroba= 0;
			 
			 boolean punto=false;	
			
			
			for(int i=0;i<email.length();i++) {
				/*char letra=email.charAt(i);
				caracteres++;
				String letra_string=Character.toString(letra);
				
				if(letra_string.contains("@")) arroba++;
				if(letra_string.contains(".")) punto++;
				*/
				if(email.charAt(i)=='@') arroba++;
				if(email.charAt(i)=='.') punto=true;
				
			}
		if(arroba==1 && punto==true && email.length()>4) valido=true;
		else JOptionPane.showMessageDialog(null, "Email no v?lido");
		}
		while(valido==false);
		
		System.out.println("Email correcto");
	}

}
