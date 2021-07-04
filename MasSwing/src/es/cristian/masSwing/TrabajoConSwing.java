package es.cristian.masSwing;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TrabajoConSwing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoLista miFrame=new MarcoLista();
		
		miFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miFrame.setVisible(true);
		
	}

}


class MarcoLista extends JFrame{
	
	private JList<String> listaMeses;
	
	private JPanel laminaLista, laminaLabel;
	
	private JLabel rotuloMeses;

	public MarcoLista() {
		
		setTitle("Lista de meses");
		
		setBounds(500,300,500,300);
		
		String meses[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio"};
		
		listaMeses = new JList<String>(meses);
		
		listaMeses.setVisibleRowCount(4);
		
		JScrollPane barraDes = new JScrollPane(listaMeses);
		
		//JList a la escucha
		
		listaMeses.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				List<String> elementos = listaMeses.getSelectedValuesList();
				
				StringBuilder textoSeleccionado = new StringBuilder("Mes seleccionado ");
				
				for(String el:elementos) {
					
					String mes = el;
					
					textoSeleccionado.append(mes);
					
					textoSeleccionado.append(" ");
				}
				
				rotuloMeses.setText(textoSeleccionado.toString());
			
			}
		});
		
		laminaLista = new JPanel();
		
		laminaLista.add(barraDes);
		
		laminaLabel = new JPanel();
		
		rotuloMeses = new JLabel("Mes seleccionado: ");
		
		laminaLabel.add(rotuloMeses);
		
		add(laminaLista,BorderLayout.NORTH);
		
		add(laminaLabel,BorderLayout.SOUTH);
		
		
	}
	
	
}