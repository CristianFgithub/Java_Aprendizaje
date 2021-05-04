package es.cristian.JFrame;

import javax.swing.JFrame;

public class Creacion_3_JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		miJFrame miJFrame1 = new miJFrame(300,400,500,600);
		miJFrame miJFrame2 = new miJFrame(300,300,200,400);
		miJFrame miJFrame3 = new miJFrame(400,400,100,300);
		
		
	}

}


class miJFrame extends JFrame{
	
	
	public miJFrame(int horizontal,int vertical,int posHorizontal,int posVertical) {
	setBounds (horizontal,vertical,posHorizontal,posVertical);
	setTitle("Ventana de pruebas");
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
}