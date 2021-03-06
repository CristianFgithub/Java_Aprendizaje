package InterfacesGraficas;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;

public class DibujandoEnJFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoDibujos miMarco = new MarcoDibujos();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class MarcoDibujos extends JFrame{
	
	
	
	
	
	//constructor
	public MarcoDibujos() {
		
		setBounds(300, 300, 800, 450);
		
		LaminaDibujos miLamina = new LaminaDibujos();
		
		//miLamina.setBackground(Color.lightGray);
		
		add(miLamina);
		
		setVisible(true);
		
	}
	
}

class LaminaDibujos extends JPanel{
	
	//constructor
	
	public LaminaDibujos () {
		
		setBackground(Color.LIGHT_GRAY);
	}
	
	
	
	public void paintComponent (Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		 
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
		
		float midash[] = {10.0f};
		
		BasicStroke milapiz = new BasicStroke (4, BasicStroke.CAP_BUTT,BasicStroke.JOIN_MITER,10, midash, 0);
		
		g2.setPaint(Color.BLUE);
		
		g2.setStroke(milapiz);
		
		g2.draw(rectangulo);
		
		//Color miColor = new Color(125,188,230);
		
		g2.setPaint(new Color(125,188,230));
		
		g2.fill(rectangulo);
	}
	
}