package vista;

import java.awt.*;

import javax.swing.*;

import controlador.ControladorBoton;
import controlador.ControladorCargaMenus;

public class MarcoMVC extends JFrame {
	//propiedades
	private JComboBox secciones;
	private JComboBox paises;
	private JTextArea resultados;
	
	public JComboBox getSecciones() {
		return secciones;
	}

	public void setSecciones(JComboBox secciones) {
		this.secciones = secciones;
	}

	public JComboBox getPaises() {
		return paises;
	}

	public void setPaises(JComboBox paises) {
		this.paises = paises;
	}

	public JTextArea getResultados() {
		return resultados;
	}

	public void setResultados(JTextArea resultados) {
		this.resultados = resultados;
	}

	public MarcoMVC() {
		
		setTitle("Consulta articulos");
		
		setBounds(500,300,400,400);
		
		setLayout(new BorderLayout());
		
		JPanel menus = new JPanel();
		
		menus.setLayout(new FlowLayout());
	
		secciones = new JComboBox();
		
		secciones.addItem("Todas");
		
		paises = new JComboBox();
		
		paises.addItem("Todos");
		
		menus.add(secciones);
		
		menus.add(paises);
		
		add(menus, BorderLayout.NORTH);
		
		resultados = new JTextArea(4,50);
		
		add(resultados, BorderLayout.CENTER);
		
		JButton botonAccion = new JButton("Buscar");
		
		botonAccion.addActionListener(new ControladorBoton(this));
		
		add(botonAccion,BorderLayout.SOUTH);
		
		addWindowListener(new ControladorCargaMenus(this));
		
		
	}
	
	
	
}
