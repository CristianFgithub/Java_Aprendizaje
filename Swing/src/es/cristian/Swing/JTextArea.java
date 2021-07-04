package es.cristian.Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JTextArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	MarcoAreaTexto mimarco = new MarcoAreaTexto();
	
	mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
	}

}


class MarcoAreaTexto extends JFrame{
	
	public MarcoAreaTexto() {
		
		setBounds(600,300,600,400);
		
		add(new LaminaAreaTexto());
		
		setVisible(true);
	}
}

class LaminaAreaTexto extends JPanel{
	//propiedades
	
	private javax.swing.JTextArea miareaTexto;

	
	
	public LaminaAreaTexto() {
	
		miareaTexto = new javax.swing.JTextArea(7, 25);
		
		JScrollPane laminaScroll = new JScrollPane(miareaTexto);
		
		miareaTexto.setLineWrap(true);
		
		add(laminaScroll);
		
		JButton miboton = new JButton("Escribir por pantalla");
		
		miboton.addActionListener(new AccionBoton());
		
		add(miboton);
		
	}
	class AccionBoton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println(miareaTexto.getText());
		}
}


	
	
}