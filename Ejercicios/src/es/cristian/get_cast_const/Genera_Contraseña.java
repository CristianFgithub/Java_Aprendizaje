/*package es.cristian.get_cast_const;

import java.util.Random;

import javax.swing.JOptionPane;



public class Genera_Contraseña {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tamañoArray=Integer.parseInt(JOptionPane.showInputDialog("De cuanto tamaño será el Array"));
		int tamañoContraseña=Integer.parseInt(JOptionPane.showInputDialog("De cuanto tamaño será la contraseña"));
		Construye_Contraseña contraseña1= new Construye_Contraseña(tamañoContraseña);
		
		Construye_Contraseña[] arrayContraseña= new Construye_Contraseña[tamañoArray];
		
		arrayContraseña[0]= new Construye_Contraseña(tamañoContraseña);
		
		System.out.println(arrayContraseña[0].GetDatoContraseña());
		for (int i=0;i<arrayContraseña.length;i++) {
			
			arrayContraseña[i]= new Construye_Contraseña(tamañoContraseña);
			
			System.out.println("La contraseña es: " + arrayContraseña[i].GetDatoContraseña());
		}

		System.out.println(arrayContraseña[0].GetDatoContraseña());
		
	}

}

class Construye_Contraseña{
	
	//propiedades
	private int longitudContraseña;
	private String Contraseña;

	//constructor
	public Construye_Contraseña(int tamañoContraseña) {
		
		this.Contraseña=getContraseña();
			
		this.longitudContraseña = tamañoContraseña;
	}
	*/
	//metodos
	
	/*public void setArrayContraseña() {
		String[]ArrayContraseña = new String[this.longitudArray];
		
		for (int z=0;z<this.longitudArray;z++) {
			
		int longitud=this.longitudContraseña;
		String[] alfabeto ={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8","9"};
		//String alfabeto ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder token = new StringBuilder();
		Random rnd = new Random();
		for (int i = 0;i<longitud;i++) {
			int indice = rnd.nextInt(alfabeto.length);
			token.append(alfabeto[indice]);
			
		}
		String ContraseñaGenerada = token.substring(0, longitud);
		ArrayContraseña[z]=ContraseñaGenerada;
		}
		for (int k=0; k<ArrayContraseña.length;k++) {
			this.Array[k]=ArrayContraseña[k];
		}
		
	}*/
	
	/*
	public String getContraseña(){
		int longitud=this.longitudContraseña;
		String[] alfabeto ={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8","9"};
		//String alfabeto ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder token = new StringBuilder();
		Random rnd = new Random();
		for (int i = 0;i<longitud;i++) {
			int indice = rnd.nextInt(alfabeto.length);
			token.append(alfabeto[indice]);
		}
		String ContraseñaGenerada = token.substring(0,longitud);
		
		return ContraseñaGenerada;
		
	}
		
		
	
	public String GetDatoContraseña() {
		return this.Contraseña;
	}
	
	public int getLongitudContraseña() {
		
		return this.longitudContraseña;
	
	}
	
	
	
	
}*/
