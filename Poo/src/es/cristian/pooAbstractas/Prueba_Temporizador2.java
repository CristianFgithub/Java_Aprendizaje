package es.cristian.pooAbstractas;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Prueba_Temporizador2 {

	public static void main(String[] args) {
		
		Reloj mireloj=new Reloj();
		
		mireloj.ejecutarTemporizador(3000, true);
		
		JOptionPane.showMessageDialog(null, "Pulsa acceptar para terminar");

	}

}

class Reloj {
	//metodos
	
	public void ejecutarTemporizador(int intervalo,boolean sonido) {
		//clase interna
			/*class DameLaHora implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				Date ahora = new Date();
				
				System.out.println("La hora de ahora es: " + ahora);
				
				if (sonido) Toolkit.getDefaultToolkit().beep();
			}
			
		}
		
		ActionListener oyente= new DameLaHora();*/
		
		Timer miTemporizador = new Timer(intervalo, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				Date ahora = new Date();
				
				System.out.println("La hora de ahora es: " + ahora);
				
				if (sonido) Toolkit.getDefaultToolkit().beep();
				
			}
			
		});
		
		miTemporizador.start();
	}
	

	
	
	
}