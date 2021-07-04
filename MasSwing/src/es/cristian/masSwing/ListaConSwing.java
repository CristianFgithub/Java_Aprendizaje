package es.cristian.masSwing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class ListaConSwing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaConSwing frame = new ListaConSwing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ListaConSwing() {
		JPanel panel_1;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);
		
		JList list = new JList();
		JLabel lblNewLabel = new JLabel("Los meses seleccionados son: ");
		
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				
				List<String> elementosUsados = list.getSelectedValuesList();
				
				StringBuilder textoSeleccionado = new StringBuilder("Los meses seleccionados son: ");
				
				for(String el:elementosUsados) {
					
					String mes = el;
					
					textoSeleccionado.append(mes);
					
					textoSeleccionado.append(" ");
				
				}
				lblNewLabel.setText(textoSeleccionado.toString());
			}
			
		});
		scrollPane.setViewportView(list);
		list.setVisibleRowCount(3);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.add(lblNewLabel);
		

	}

}
