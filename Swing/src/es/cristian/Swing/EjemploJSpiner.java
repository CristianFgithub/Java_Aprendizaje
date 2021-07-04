package es.cristian.Swing;

import java.awt.Dimension;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import javax.swing.*;

public class EjemploJSpiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoJSpiner mimarco = new MarcoJSpiner();
		
		mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}


class MarcoJSpiner extends JFrame{
	
	public MarcoJSpiner() {
		
		setBounds(600,300,600,400);
		
		add(new LaminaJSpiner());
		
		setVisible(true);
	}
	
	
}

class LaminaJSpiner extends JPanel{
	
	public LaminaJSpiner() {
		
		String meses[] = {"Enero", "Febrero", "Marzo", "Abril"};
		
		
		JSpinner control = new JSpinner(new SpinnerListModel(meses));
		
		//Dimension d = new Dimension(150,20);
		
		control.setPreferredSize(new Dimension(100,20));
		
		control.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				System.out.println("El valor es " + control.getValue());
			}
		});
		
		add(control);
		
	}
		
	
	
}