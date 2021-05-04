package InterfacesGraficas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.*;

public class EscribienEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoTexto marco = new MarcoTexto();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	
	}

}

class MarcoTexto extends JFrame{
	
	//constructor
	public MarcoTexto() {
		
		setBounds(400,200,600,450);
		
		setTitle("Escritura en JFrame");
		
		setVisible(true);
		
		PrimerPanel milamina = new PrimerPanel ();
		
		add(milamina);

	}
}


class PrimerPanel extends JPanel{
	
	//constructor
	
	public PrimerPanel() {
		setBackground(new Color(195));
	}
	
	//metodos
	
	public void paintComponent (Graphics g) {
		
		super.paintComponent(g);
		
		Color micolor = new Color(255,190,90);
		
		g.setColor(micolor);
		
		Font miletra = new Font("Verdana", Font.BOLD, 30);
		
		g.setFont(miletra);
		
		
		
		g.drawString("Primer panel",20,20);
		
	}
	
}
