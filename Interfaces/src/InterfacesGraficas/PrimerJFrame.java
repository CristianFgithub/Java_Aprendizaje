package InterfacesGraficas;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

public class PrimerJFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*JFrame miVentana = new JFrame();
		
		miVentana.setSize(600, 350);

		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		miVentana.setLocation(650, 350);
		
		miVentana.setVisible(true);*/
		
		MiJFrame miVentana = new MiJFrame();
		
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MiJFrame extends JFrame{
	//propiedades
	
	
	//constructor
	public MiJFrame() {
		
		//setSize(600,350);
		
		//setLocation(650, 350);
		
		setBounds (600,350,650,350);
		
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		
		setTitle("Ventana de pruebas");
		
		//setResizable(false);
		
		//setLocationRelativeTo(null);
		
		Toolkit miSistema = Toolkit.getDefaultToolkit();
		
		Image miIcono = miSistema.getImage("src/InterfacesGraficas/tick.jpg");
		
		setIconImage(miIcono);
		
		setVisible(true);
	}
}
