/*package es.cristian.get_cast_const;

import java.util.Random;

import javax.swing.JOptionPane;



public class Genera_Contrase�a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tama�oArray=Integer.parseInt(JOptionPane.showInputDialog("De cuanto tama�o ser� el Array"));
		int tama�oContrase�a=Integer.parseInt(JOptionPane.showInputDialog("De cuanto tama�o ser� la contrase�a"));
		Construye_Contrase�a contrase�a1= new Construye_Contrase�a(tama�oContrase�a);
		
		Construye_Contrase�a[] arrayContrase�a= new Construye_Contrase�a[tama�oArray];
		
		arrayContrase�a[0]= new Construye_Contrase�a(tama�oContrase�a);
		
		System.out.println(arrayContrase�a[0].GetDatoContrase�a());
		for (int i=0;i<arrayContrase�a.length;i++) {
			
			arrayContrase�a[i]= new Construye_Contrase�a(tama�oContrase�a);
			
			System.out.println("La contrase�a es: " + arrayContrase�a[i].GetDatoContrase�a());
		}

		System.out.println(arrayContrase�a[0].GetDatoContrase�a());
		
	}

}

class Construye_Contrase�a{
	
	//propiedades
	private int longitudContrase�a;
	private String Contrase�a;

	//constructor
	public Construye_Contrase�a(int tama�oContrase�a) {
		
		this.Contrase�a=getContrase�a();
			
		this.longitudContrase�a = tama�oContrase�a;
	}
	*/
	//metodos
	
	/*public void setArrayContrase�a() {
		String[]ArrayContrase�a = new String[this.longitudArray];
		
		for (int z=0;z<this.longitudArray;z++) {
			
		int longitud=this.longitudContrase�a;
		String[] alfabeto ={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8","9"};
		//String alfabeto ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder token = new StringBuilder();
		Random rnd = new Random();
		for (int i = 0;i<longitud;i++) {
			int indice = rnd.nextInt(alfabeto.length);
			token.append(alfabeto[indice]);
			
		}
		String Contrase�aGenerada = token.substring(0, longitud);
		ArrayContrase�a[z]=Contrase�aGenerada;
		}
		for (int k=0; k<ArrayContrase�a.length;k++) {
			this.Array[k]=ArrayContrase�a[k];
		}
		
	}*/
	
	/*
	public String getContrase�a(){
		int longitud=this.longitudContrase�a;
		String[] alfabeto ={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8","9"};
		//String alfabeto ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder token = new StringBuilder();
		Random rnd = new Random();
		for (int i = 0;i<longitud;i++) {
			int indice = rnd.nextInt(alfabeto.length);
			token.append(alfabeto[indice]);
		}
		String Contrase�aGenerada = token.substring(0,longitud);
		
		return Contrase�aGenerada;
		
	}
		
		
	
	public String GetDatoContrase�a() {
		return this.Contrase�a;
	}
	
	public int getLongitudContrase�a() {
		
		return this.longitudContrase�a;
	
	}
	
	
	
	
}*/
