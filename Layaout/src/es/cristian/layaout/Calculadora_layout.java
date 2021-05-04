package es.cristian.layaout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculadora_layout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalcuLayout miMarco=new CalcuLayout();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);

	}

}

class CalcuLayout extends JFrame{
	
	
	public CalcuLayout(){
		
		setTitle("Calculadora");
		
		setBounds(600,350,600,300);
		
		PanelCalcuLayout lamina=new PanelCalcuLayout();
		
		
		
		//FlowLayout disposicion = new FlowLayout(FlowLayout.RIGHT);
		
		//lamina.setLayout(disposicion);
		
		//lamina.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		add(lamina);
		
		
	
	}
	
}



class PanelCalcuLayout extends JPanel{
	//propiedades
	private JPanel numeracion;
	
	private JButton pantalla;
	
	private boolean comienzo;
	
	private String ultimaOperacion="";
	
	private double resultado;
	
	private double ultimoValor;
	//constructor
	public PanelCalcuLayout() {
		
		comienzo=true;
		
		setLayout(new BorderLayout());
		
		pantalla = new JButton("0");
		
		pantalla.setEnabled(false);
		
		add(pantalla, BorderLayout.NORTH);
		
		numeracion = new JPanel();
		
		numeracion.setLayout(new GridLayout(4,4));
		
		/*numeracion.add(new JButton("7"));	
		
		numeracion.add(new JButton("8"));	
		
		numeracion.add(new JButton("9"));	
		
		numeracion.add(new JButton("*"));	
		
		numeracion.add(new JButton("4"));	
		
		numeracion.add(new JButton("5"));
		
		numeracion.add(new JButton("6"));	
		
		numeracion.add(new JButton("-"));	
		
		numeracion.add(new JButton("1"));	
		
		numeracion.add(new JButton("2"));	
		
		numeracion.add(new JButton("3"));	
		
		numeracion.add(new JButton("+"));	
		
		numeracion.add(new JButton("/"));	
		
		numeracion.add(new JButton("0"));	
		
		numeracion.add(new JButton(","));	
		
		numeracion.add(new JButton("="));*/
		
		InsertarNumeros insertar = new InsertarNumeros();
		Operacion realizarOperacion = new Operacion();
		
		ponerBoton("7", insertar);
		ponerBoton("8", insertar);
		ponerBoton("9", insertar);
		ponerBotonOperaciones("x", realizarOperacion);
		ponerBoton("4", insertar);
		ponerBoton("5", insertar);
		ponerBoton("6", insertar);
		ponerBotonOperaciones("-", realizarOperacion);
		ponerBoton("1", insertar);
		ponerBoton("2", insertar);
		ponerBoton("3", insertar);
		ponerBotonOperaciones("+", realizarOperacion);
		ponerBotonOperaciones("/", realizarOperacion);
		ponerBoton("0", insertar);
		ponerBoton(",", insertar);
		ponerBotonOperaciones("=", realizarOperacion);
		
		add(numeracion, BorderLayout.CENTER);
		
	}
	
	private void ponerBoton(String TextoBoton, InsertarNumeros oyente) {
		
		JButton boton = new JButton(TextoBoton); 
		
		boton.addActionListener(oyente);
		
		numeracion.add(boton);
		
		
	}
	
	private void ponerBotonOperaciones(String TextoBoton, Operacion oyente) {
		
		JButton boton = new JButton(TextoBoton); 
		
		boton.addActionListener(oyente);
		
		numeracion.add(boton);
		
		
	}
	
	private class InsertarNumeros implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub			
			String entrada = e.getActionCommand();

			if(comienzo) {
				
				pantalla.setText(entrada);
				
				comienzo = false;
			} else pantalla.setText(pantalla.getText() + entrada);
			
			ultimoValor = Double.parseDouble(pantalla.getText());
			
		}
		
		
	}
	
	private class Operacion implements ActionListener{
		//propiedades
		
		private String ultimaOperacion;
		
		private int contador;
		
		private int contadorGlobal;
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			String operacionPulsada = e.getActionCommand();
			
			if(operacionPulsada.equals("+")) {
				
				resultado+=ultimoValor;
				
				pantalla.setText("" + resultado);
				
				ultimaOperacion="+";
				
			}
			
			else if(operacionPulsada.equals("x")) {
				
				double valor = Double.parseDouble(pantalla.getText());
				
				if (contador == 0) resultado=valor*1;
				
				else resultado*=ultimoValor;
					
					pantalla.setText("" + resultado);
				
					ultimaOperacion="x";
					
					contador++;
				
			}
			
			else if(operacionPulsada.equals("-")) {
				
				if (contador==0 && contadorGlobal==0) { 
					
					resultado=ultimoValor;
				
					pantalla.setText("" + resultado);
					
					ultimaOperacion="-";
					
					contador++;
				}
				else {
				resultado-=ultimoValor;
				
				pantalla.setText("" + resultado);
				
				ultimaOperacion="-";
				}
				
			}
			
			else if (operacionPulsada.equals("/")) {
				
				double valor = Double.parseDouble(pantalla.getText());
				
				if (contador == 0) resultado=valor*1;
				
				else resultado/=ultimoValor;
					
					pantalla.setText("" + resultado);
				
					ultimaOperacion="/";
					
					contador++;
			}
			
			else {
				
				if(ultimaOperacion.equals("+")) resultado+=ultimoValor;
				if(ultimaOperacion.equals("x")) { resultado*=ultimoValor; contador=0;}
				if(ultimaOperacion.equals("-")) { resultado-=ultimoValor; contador=0;}
				if(ultimaOperacion.equals("/")) { resultado/=ultimoValor; contador=0;}
				
				
				pantalla.setText("" + resultado);
				
				ultimoValor=0;
				contadorGlobal++;
				
			}
			

			
			comienzo=true;
			
			
			
			
		}
		
		
	}
}

