package es.cristian.pooAbstractas;

import java.awt.event.*;

import javax.swing.*;

public class Prueba_temporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Temporizador oyente= new Temporizador();
		
		Timer miTemporizador=new Timer(5000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Hola reclutadores");
				
			}
					
		});
	
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null,"pulsa aceptar para detener");
	}

}

/*class Temporizador implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("Hola Reclutadores");
		
	}
	
}*/