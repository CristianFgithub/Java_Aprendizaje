import javax.swing.JOptionPane;

public class Calculo_Peso_ideal {

	public static void main(String[] args) {
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Cual es su altura"));
		String genero = JOptionPane.showInputDialog("¿Eres hombre o mujer?");
		
		if(genero.equals("hombre")) {
			int calculo = altura - 110;
			System.out.println("Tu peso ideal es " + calculo  );
		}else {
			int calculo = altura -120;
			System.out.println("Tu peso ideal es " + calculo  );
		}

	}

}
