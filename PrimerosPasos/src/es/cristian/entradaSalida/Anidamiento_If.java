package es.cristian.entradaSalida;

import javax.swing.JOptionPane;

public class Anidamiento_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad, por favor"));
		
		if(edad>=18) {
			
			String carnet=JOptionPane.showInputDialog("¿Tienes carnet?: ");
			
			if(carnet.equals("si")) {
				JOptionPane.showMessageDialog(null, "Puedes comprar el coche");
			}else {
				JOptionPane.showMessageDialog(null, "Sin carnet no hay coche");
			}
		}else {
			
			JOptionPane.showMessageDialog(null, "Si eres menor no hay carnet ni coche");
		}
	}

}
