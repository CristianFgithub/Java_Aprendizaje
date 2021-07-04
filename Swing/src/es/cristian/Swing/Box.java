package es.cristian.Swing;

import javax.swing.*;

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBox miMarco=new MarcoBox();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);
	}

}

class MarcoBox extends JFrame{
	
	public MarcoBox() {
		
		setTitle("Disposición Box");
		
		setBounds(700,400,200,200);
		
		JLabel nUsuario = new JLabel("Nombre");
		
		JTextField cUsuario = new JTextField(10);
		
		cUsuario.setMaximumSize(cUsuario.getPreferredSize());
		
		javax.swing.Box cajaUsuario = javax.swing.Box.createHorizontalBox();
	
		cajaUsuario.add(nUsuario);
		
		cajaUsuario.add(javax.swing.Box.createHorizontalStrut(10));
		
		cajaUsuario.add(cUsuario);
		
		//segundo Box
		
		JLabel nPassword = new JLabel("Password");
		
		JTextField cPassword = new JTextField(10);
		
		cPassword.setMaximumSize(cPassword.getPreferredSize());
		
		javax.swing.Box cajaPassword = javax.swing.Box.createHorizontalBox();
	
		cajaPassword.add(nPassword);
		
		cajaPassword.add(javax.swing.Box.createHorizontalStrut(10));
		
		cajaPassword.add(cPassword);
		
		//tercer box
		
		JButton boton1 = new JButton("OK");
		
		JButton boton2 = new JButton("Cancelar");
		
		javax.swing.Box cajaBotones = javax.swing.Box.createHorizontalBox();
		
		cajaBotones.add(boton1);
		
		cajaBotones.add(javax.swing.Box.createGlue());
		
		cajaBotones.add(boton2);
		
		//vertical Box
		
		javax.swing.Box cajaVertical = javax.swing.Box.createVerticalBox();
		
		cajaVertical.add(cajaUsuario);
		
		cajaVertical.add(cajaPassword);
		
		cajaVertical.add(cajaBotones);
		
		add(cajaVertical);
	}
}