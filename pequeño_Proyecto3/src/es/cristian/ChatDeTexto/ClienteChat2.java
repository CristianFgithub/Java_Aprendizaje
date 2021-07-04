package es.cristian.ChatDeTexto;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.ArrayList;

import javax.swing.*;

public class ClienteChat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoClienteChat mimarco=new MarcoClienteChat();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoClienteChat extends JFrame{
	
	public MarcoClienteChat(){
		
		setBounds(600,300,280,350);
				
		LaminaClienteChat milamina=new LaminaClienteChat();
		
		add(milamina);
		

		
		estableceConexionServidor();
		
		}	
	void estableceConexionServidor() {
		try {
			Socket miSocket = new Socket("192.168.123.1",9999);
			
			envioPaqueteDatos datos = new envioPaqueteDatos();
			
			datos.setTextoCliente(" Online");
			
			ObjectOutputStream flujoSalidaPaquete = new ObjectOutputStream(miSocket.getOutputStream());
			
			flujoSalidaPaquete.writeObject(datos);
			
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setVisible(true);	
		
	}
}


class LaminaClienteChat extends JPanel implements Runnable{
	
	public LaminaClienteChat(){	
		
		nick = new JLabel();
		
		nick.setText(JOptionPane.showInputDialog("Nick"));
		
		add(nick);
		
		JLabel cliente = new JLabel("Online -->");
		
		add(cliente);
		
		ip = new JComboBox();
		
		add(ip);
		
		areaChat = new JTextArea(13,20);
		
		add(areaChat);
		
		campo1=new JTextField(20);
	
		add(campo1);		
	
		miboton=new JButton("Enviar");	
		
		miboton.addActionListener(new ActionListener() {
			
			

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				//System.out.println(campo1.getText());
				
				try {
					//creacion  de socket
				
					Socket miSocket = new Socket("192.168.123.1",9999);
					
					envioPaqueteDatos datos = new envioPaqueteDatos();
					
					datos.setNick(nick.getText());
					
					datos.setIp(ip.getSelectedItem().toString());
					
					datos.setTextoCliente(campo1.getText());
					
					datos.setIpE(datos.getIp());
					
					ObjectOutputStream flujoSalidaPaquete = new ObjectOutputStream(miSocket.getOutputStream());
					
					flujoSalidaPaquete.writeObject(datos);
					
					miSocket.close();
					
					
					
					
					
					//creacion de flujo de datos
					/*DataOutputStream flujoSalida = new DataOutputStream(miSocket.getOutputStream());
				
					flujoSalida.writeUTF(campo1.getText());
					
					flujoSalida.close();*/
					
					
				
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		add(miboton);	
		
		Thread miHilo = new Thread(this);
		
		miHilo.start();
		
	}
	public void run() {
		// TODO Auto-generated method stub
		try {
			
		ServerSocket escuchaCliente = new ServerSocket(9090);
		
		Socket cliente;
		
		envioPaqueteDatos paqueteRecibido;
		
		while(true) {
			
			cliente = escuchaCliente.accept();
			
			ObjectInputStream flujoEntrada = new ObjectInputStream(cliente.getInputStream());
			
			paqueteRecibido = (envioPaqueteDatos) flujoEntrada.readObject();
			
			if(paqueteRecibido.getTextoCliente().equals(" Online")) {
				
				//areaChat.append("\n" + paqueteRecibido.getIPs());
				
				ArrayList <String> IpsJCombo = new ArrayList<String>();
				
				IpsJCombo = paqueteRecibido.getIPs();
				
				ip.removeAllItems();
				
				for (String ips : IpsJCombo) {
					
					
					
					ip.addItem(ips);
					
				}
			
			}else {
				
				areaChat.append("\n" + paqueteRecibido.getNick() + ": " + paqueteRecibido.getTextoCliente());
			}
		
			
			
		}
		
		} catch(IOException e) {
			
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private JTextArea areaChat;
	
	private JTextField campo1;
	
	private JComboBox ip;
	
	private JLabel nick;
	
	private JButton miboton;

	

}

class envioPaqueteDatos implements Serializable{
	
	private String nick, ip, textoCliente, ipE;
	
	public String getIpE() {
		return ipE;
	}

	public void setIpE(String ipE) {
		this.ipE = ipE;
	}

	private ArrayList<String>IP;

	public ArrayList<String> getIPs() {
		return IP;
	}

	public void setIP(ArrayList<String> iP) {
		IP = iP;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getTextoCliente() {
		return textoCliente;
	}

	public void setTextoCliente(String textoCliente) {
		this.textoCliente = textoCliente;
	}
	
	
}