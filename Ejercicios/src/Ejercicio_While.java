import javax.swing.JOptionPane;

public class Ejercicio_While {

	public static void main(String[] args) {
		
		int NumeroAleatorio = (int) Math.round(Math.random()*100);
		
		int NumeroUsuario=0;
		
		int intentos= 0;
		
		while(!(NumeroAleatorio == NumeroUsuario)) {
			intentos++;
			
			NumeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n?mero del 1 al 100"));
			
			if(NumeroAleatorio == NumeroUsuario) System.out.println("??Has acertado con solo " + intentos + " intentos !!");
		
			else {
				
				if(NumeroAleatorio>NumeroUsuario) System.out.println("Tu n?mero es menor que el aleatorio");
				
				else System.out.println("Tu n?mero es mayor que el aleatorio");
				
			}
			
		}
	}

}
