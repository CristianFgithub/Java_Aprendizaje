package es.cristian.get_cast_const;

 

 

import java.util.Random;

 

import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet.CharacterAttribute;

 

 

 

public class Genera_Contrase�a2 {

 

      public static void main(String[] args) {

             // TODO Auto-generated method stub

            

             int tama�oArray=Integer.parseInt(JOptionPane.showInputDialog("De cuanto tama�o ser� el Array"));

             int tama�oContrase�a=Integer.parseInt(JOptionPane.showInputDialog("De cuanto tama�o ser� la contrase�a"));

            

             Construye_Contrase�a contrase�a1= new Construye_Contrase�a(tama�oArray,tama�oContrase�a);

            

             contrase�a1.setArrayContrase�a();

            
             // Si quisieramos ver todas las contrase�as quitamos los comentarios
            /* for (int i=0;i<tama�oArray;i++) {

                   System.out.println(contrase�a1.getContrase�a()[i]);

             }    */    
             for (int z=0;z<tama�oArray;z++) {
             System.out.println(contrase�a1.esSegura(z));
      
             }
      }

 

}

 

class Construye_Contrase�a{

     

      //propiedades

      private int longitudArray;

      private int longitudContrase�a;

      private String[] Contrase�a;
      
      private String Contrase�aGenerada;

     

      //constructor

      public Construye_Contrase�a(int longitudArray,int longitudContrase�a) {

 

             this.longitudArray=longitudArray;

            

             this.longitudContrase�a=longitudContrase�a;

            

             Contrase�a = new String[this.longitudContrase�a];

            

            

      }

     

      //metodos

     

      public void setArrayContrase�a() {

            

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

             Contrase�aGenerada = token.substring(0, longitud);

             this.Contrase�a[z]=Contrase�aGenerada;

            

             }

            

            

      }

     

     

      public String[] getContrase�a(){

            

            

             return Contrase�a;

            

      }

            

     

      public int getLongitudContrase�a() {

            

             return this.longitudContrase�a;

     

      }

     
      public String esSegura(int arrayLocalizacion){
    	  
    	  int numeros=0;
    	  int minuscula=0;
    	  int mayuscula=0;
    	  
    	  
	    	  for (int z=0; z<this.longitudContrase�a;z++) {
	    		  if (Character.isLowerCase(this.Contrase�a[arrayLocalizacion].charAt(z))) minuscula++;
	    			  
	    		  else if(Character.isUpperCase(this.Contrase�a[arrayLocalizacion].charAt(z))) mayuscula++;
	    			  
	    		  else numeros++;
	    	  }
	    		  
	    	 
    	  
    	  if (numeros>5 && minuscula>1 && mayuscula>2) return "La contrase�a: " + this.Contrase�a[arrayLocalizacion] + " es segura";
		  else return "La contrase�a: " + this.Contrase�a[arrayLocalizacion] + " no es segura";
		
      }
      

     

      }

