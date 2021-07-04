package es.cristian.Swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JcomboBoxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoComboBox mimarco = new MarcoComboBox();
		mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);;
	}

}

class MarcoComboBox extends JFrame{
	
	public MarcoComboBox() {
		
		setBounds(600,300,600,400);
		
		add(new LaminaComboBox());
		
		setVisible(true);
	}
}

class LaminaComboBox extends JPanel{
	
		JLabel texto;
		JComboBox miCombo;
		JSlider miSlider;
	public LaminaComboBox() {
		
		setLayout(new BorderLayout());
		
		texto = new JLabel("En breve aprendere JavaXF");
		
		texto.setFont(new Font("Serif", Font.PLAIN, 18));
		
		add(texto, BorderLayout.CENTER);
		
		JPanel superior = new JPanel();
		
		miCombo = new JComboBox();
		
		miCombo.addItem("Serif");
		
		miCombo.addItem("SansSerif");
		
		miCombo.addItem("Monospaced");
		
		miCombo.addItem("Dialog");
		
		miCombo.addItem("Calibri");
		
		superior.add(miCombo);
		
		miSlider = new JSlider(8,36,24);
		
		miSlider.setMajorTickSpacing(6);
		
		miSlider.setMinorTickSpacing(2);
		
		miSlider.setPaintTicks(true);

		miSlider.setPaintLabels(true);
		
		miSlider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				texto.setFont(new Font((String) miCombo.getSelectedItem(), Font.PLAIN,miSlider.getValue()));
			}
			
		});
		
		
		superior.add(miSlider);
		
		miCombo.addActionListener(new eventoComboFuente());
		
		add(superior, BorderLayout.NORTH);
		
	}
	
	private class eventoComboFuente implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			texto.setFont(new Font((String) miCombo.getSelectedItem(), Font.PLAIN,miSlider.getValue()));
		}
		
	}
}