package es.cristian.Swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuEmergente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	MarcoMenuEmergente mimarco = new MarcoMenuEmergente();
	
	mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
	}

}


class MarcoMenuEmergente extends JFrame{
	
	public MarcoMenuEmergente() {		
		setBounds(600,300,600,400);
		
		add(new LaminaMenuEmergente());
		
		setVisible(true);
	}
}

class LaminaMenuEmergente extends JPanel{
	// Propiedades
	
	//constructor
	public LaminaMenuEmergente() {
		
		JPopupMenu emergente = new JPopupMenu();
		
		JMenuItem azul = new JMenuItem("Azul");
		
		JMenuItem rojo = new JMenuItem("Rojo");
		
		JMenuItem verde = new JMenuItem("Verde");
		
		azul.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setBackground(Color.blue);
			}
		});
		
		rojo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setBackground(Color.RED);
			}
		});
		
		verde.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setBackground(Color.green);
			}
		});
		emergente.add(azul);
		emergente.add(rojo);
		emergente.add(verde);
		
		
		setComponentPopupMenu(emergente);
		
		
	}
	
		
}
	