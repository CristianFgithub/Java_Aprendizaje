import javax.swing.JOptionPane;

public class CalculoPotenciaJOptionPane {

	public static void main(String[] args) {
		
		int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
		
		int exponente =Integer.parseInt(JOptionPane.showInputDialog("Introduce el exponente"));
		
		System.out.println("El resultado de  " + base + " elevado a " + exponente + " es: " + Math.pow(base, exponente));

	}

}
