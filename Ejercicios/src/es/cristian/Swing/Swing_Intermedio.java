package es.cristian.Swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Swing_Intermedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marcoEjercicio mimarco = new marcoEjercicio();
		
		mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}

}

class marcoEjercicio extends JFrame {
	
	//constructor
	public marcoEjercicio() {
		
		setBounds(350,400,500,400);
		
		add(new LaminaEjercicio());
		
		setVisible(true);
		
		
	}
}

class LaminaEjercicio extends JPanel{
	//propiedades
	private JTextField nombre,apellidos;
	private JLabel nombre1, apellidos1;
	private javax.swing.JTextArea miareaTexto;
	private JButton boton1, boton2;
	private JCheckBox casilla1,casilla2;
	private JRadioButton radio1,radio2;
	private int contador=1;
	private int contadorCasilla1=0;
	private int contadorCasilla2=0;
	private int contadorRadio1=0;
	private int contadorRadio2=0;
	private String Historico="";
	//constructor
	public LaminaEjercicio() {
		//layout
		setLayout(new BorderLayout());
		
		//JPanel para colocacion
		JPanel superior = new JPanel();
		
		JPanel centro = new JPanel();
		
		JPanel inferior = new JPanel();
		
		//Asignación de variables
		nombre1 = new JLabel("Nombre");
		
		apellidos1 = new JLabel("Apellidos");
		
		nombre = new JTextField(10);
		
		nombre.addActionListener(new listador());
		
		apellidos = new JTextField(10);
		
		apellidos.addActionListener(new listador());
		
		//añado a la asignacion superior lo que se pondrá en el superior
		superior.add(nombre1);
		
		superior.add(nombre);
		
		superior.add(apellidos1);
		
		superior.add(apellidos);
		
		add(superior, BorderLayout.NORTH);
		
		//lo mismo con el centro
		miareaTexto = new javax.swing.JTextArea(15, 25);
		
		JScrollPane laminaScroll = new JScrollPane(miareaTexto);
		
		miareaTexto.setLineWrap(true);
		
		miareaTexto.setEnabled(false);
		
		centro.add(laminaScroll);
		
		add(centro, BorderLayout.CENTER);
		
		//lo mismo con el inferior
		boton1 = new JButton("Boton1");
		
		boton1.addActionListener(new listador());
		
		boton2 = new JButton("Boton2");
		
		boton2.addActionListener(new listador());
		
		casilla1 = new JCheckBox("Casilla1",true);
		
		casilla1.addActionListener(new listador());
		
		casilla2 = new JCheckBox("Casilla2");
		
		casilla2.addActionListener(new listador());
		
		ButtonGroup migrupo = new ButtonGroup();
		
		radio1 = new JRadioButton("Radio1");
		
		radio1.addActionListener(new listador());
		
		radio2 = new JRadioButton("Radio2");
		
		radio2.addActionListener(new listador());

		migrupo.add(radio1);
		migrupo.add(radio2);
		
		inferior.add(boton1);
		inferior.add(boton2);
		inferior.add(casilla1);
		inferior.add(casilla2);
		inferior.add(radio1);
		inferior.add(radio2);
		
		add(inferior,BorderLayout.SOUTH);
		
	}
	class listador implements ActionListener{		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(contador == 1) {
				String nombrePersona = nombre.getText();
				String apellidoPersona = apellidos.getText();
				Historico+=nombrePersona + " " + apellidoPersona + " realiza las siguientes acciones";
				contador++;
			}
			if(e.getSource()==boton1)Historico+=("\nBoton1 presionado");
			if(e.getSource()==boton2)Historico+=("\nBoton2 presionado");
			if(casilla1.isSelected()&& contadorCasilla1==1 && e.getSource()==casilla1) {
				Historico+=("\ncasilla1 ha sido seleccionada");
				contadorCasilla1=1;
			}
			if(!casilla1.isSelected()&& contadorCasilla1==0) {
				Historico+=("\nCasilla1 desactivada");
				contadorCasilla1=1;
				
			}
			if(casilla2.isSelected() && contadorCasilla2==0) {
				Historico+=("\nCasilla2 ha sido seleccionada");
				contadorCasilla2++;
			}
			if(!casilla2.isSelected()&& contadorCasilla2==1) {
				Historico+=("\nCasilla2 desactivada");
				contadorCasilla2=0;
			}
			if(radio1.isSelected()&& contadorRadio1==0) {
				Historico+=("\nradio1 ha sido seleccionado");
				contadorRadio1++;
			}
			if(!radio1.isSelected()&& contadorRadio1==1) {
				contadorRadio1=0;
			}
			if(radio2.isSelected()&& contadorRadio2==0) {
				Historico+=("\nradio2 ha sido seleccionado");
				contadorRadio2++;
			}
			if(!radio2.isSelected()&& contadorRadio2==1) {
				contadorRadio2=0;
			}
			miareaTexto.setText(Historico);
		}
		
	}
}