import javax.swing.JOptionPane;

public class Factorial {

	public static void main(String[] args) {
		
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número para hacer el factorial"));
		
		long factorial=numero;
		
		for(int i=numero-1;i>0;i--) {
			
			factorial=factorial*i;
			
		}
		System.out.println(factorial);
		
		
	}

}
