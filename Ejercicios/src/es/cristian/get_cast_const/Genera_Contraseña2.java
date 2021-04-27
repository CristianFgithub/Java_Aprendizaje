package es.cristian.get_cast_const;

 

 

import java.util.Random;

 

import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet.CharacterAttribute;

 

 

 

public class Genera_Contraseña2 {

 

      public static void main(String[] args) {

             // TODO Auto-generated method stub

            

             int tamañoArray=Integer.parseInt(JOptionPane.showInputDialog("De cuanto tamaño será el Array"));

             int tamañoContraseña=Integer.parseInt(JOptionPane.showInputDialog("De cuanto tamaño será la contraseña"));

            

             Construye_Contraseña contraseña1= new Construye_Contraseña(tamañoArray,tamañoContraseña);

            

             contraseña1.setArrayContraseña();

            
             // Si quisieramos ver todas las contraseñas quitamos los comentarios
            /* for (int i=0;i<tamañoArray;i++) {

                   System.out.println(contraseña1.getContraseña()[i]);

             }    */    
             for (int z=0;z<tamañoArray;z++) {
             System.out.println(contraseña1.esSegura(z));
      
             }
      }

 

}

 

class Construye_Contraseña{

     

      //propiedades

      private int longitudArray;

      private int longitudContraseña;

      private String[] Contraseña;
      
      private String ContraseñaGenerada;

     

      //constructor

      public Construye_Contraseña(int longitudArray,int longitudContraseña) {

 

             this.longitudArray=longitudArray;

            

             this.longitudContraseña=longitudContraseña;

            

             Contraseña = new String[this.longitudContraseña];

            

            

      }

     

      //metodos

     

      public void setArrayContraseña() {

            

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

             ContraseñaGenerada = token.substring(0, longitud);

             this.Contraseña[z]=ContraseñaGenerada;

            

             }

            

            

      }

     

     

      public String[] getContraseña(){

            

            

             return Contraseña;

            

      }

            

     

      public int getLongitudContraseña() {

            

             return this.longitudContraseña;

     

      }

     
      public String esSegura(int arrayLocalizacion){
    	  
    	  int numeros=0;
    	  int minuscula=0;
    	  int mayuscula=0;
    	  
    	  
	    	  for (int z=0; z<this.longitudContraseña;z++) {
	    		  if (Character.isLowerCase(this.Contraseña[arrayLocalizacion].charAt(z))) minuscula++;
	    			  
	    		  else if(Character.isUpperCase(this.Contraseña[arrayLocalizacion].charAt(z))) mayuscula++;
	    			  
	    		  else numeros++;
	    	  }
	    		  
	    	 
    	  
    	  if (numeros>5 && minuscula>1 && mayuscula>2) return "La contraseña: " + this.Contraseña[arrayLocalizacion] + " es segura";
		  else return "La contraseña: " + this.Contraseña[arrayLocalizacion] + " no es segura";
		
      }
      

     

      }

