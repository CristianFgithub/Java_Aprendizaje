package es.cristian.Swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	MarcoCheckBox mimarco = new MarcoCheckBox();
	
	mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
	}

}


class MarcoCheckBox extends JFrame{
	
	public MarcoCheckBox() {		
		setBounds(600,300,600,400);
		
		LaminaCheckBox laminaBaja = new LaminaCheckBox();	
		
		add(laminaBaja);
		
		setVisible(true);
	}
}

class LaminaCheckBox extends JPanel{
	// Propiedades
	private JCheckBox checkBoxNegrita, checkBoxCursiva;
	
	private JLabel texto;
	
	//constructor
	public LaminaCheckBox() {
	
		setLayout(new BorderLayout());
		
		texto = new JLabel("Hola Reclutadores");
		
		texto.setFont(new Font("Courier", Font.PLAIN, 24));
		
		JPanel superior = new JPanel();
		
		JPanel inferior = new JPanel();
		
		superior.add(texto);
		
		checkBoxNegrita = new JCheckBox("Negrita");
			
		checkBoxCursiva = new JCheckBox("Cursiva");
		
		inferior.add(checkBoxNegrita);
		
		inferior.add(checkBoxCursiva);
		
		checkBoxCursiva.addActionListener(new ManejaChecks());
		
		checkBoxNegrita.addActionListener(new ManejaChecks());
		
		add(superior, BorderLayout.NORTH);
		
		add(inferior, BorderLayout.SOUTH);
	}
	
	private class ManejaChecks implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			int negrita_cursiva=0;
			
			if(checkBoxNegrita.isSelected()) negrita_cursiva+=Font.BOLD;
			if(checkBoxCursiva.isSelected()) negrita_cursiva+=Font.ITALIC;
		
			texto.setFont(new Font("Courier", negrita_cursiva, 24));
		}
		
	}
	
}
