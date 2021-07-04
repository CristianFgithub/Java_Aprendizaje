package es.cristian.ChatDeTexto;

import java.awt.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.*;
import java.util.ArrayList;

import javax.swing.*;

public class ServidorChat  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoServidorChat mimarco=new MarcoServidorChat();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}	
}

class MarcoServidorChat extends JFrame implements Runnable {
	
	private	JTextArea areatexto;
	
	public MarcoServidorChat(){
		
		setBounds(1200,300,280,350);				
			
		JPanel milamina= new JPanel();
		
		milamina.setLayout(new BorderLayout());
		
		areatexto=new JTextArea();
		
		milamina.add(areatexto,BorderLayout.CENTER);
		
		add(milamina);
		
		setVisible(true);	
		
		Thread miHilo = new Thread(this);
		
		miHilo.start();
		
		}	
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			
			ServerSocket miServidor = new ServerSocket(9999); //puerto a la escucha
			
			String nick,ip, texto;
			
			ArrayList<String>listaIpConectados = new ArrayList<String>();
			
			envioPaqueteDatos paqueteRecibido;
			
			while(true) {
			
				Socket miSocket = miServidor.accept();  //aceptamos todas las conexiones que viajan por el socket
				

				//flujo de entrada de datos
				
				ObjectInputStream flujoDatosEntrada = new ObjectInputStream(miSocket.getInputStream());

				paqueteRecibido = (envioPaqueteDatos)flujoDatosEntrada.readObject();
				
				nick = paqueteRecibido.getNick();
				ip = paqueteRecibido.getIp();
				texto = paqueteRecibido.getTextoCliente();
				
				if(!texto.equals(" Online")) {
				
					areatexto.append("\n" + "nick: " + nick + " Mensaje: " + texto + " IP: " + ip );
				
					Socket reenvioDestinatario = new Socket(ip,9090);
				
					ObjectOutputStream paqueteReEnvio = new ObjectOutputStream(reenvioDestinatario.getOutputStream());
				
					paqueteReEnvio.writeObject(paqueteRecibido);
				
					reenvioDestinatario.close();
				
					miSocket.close();
				}else {
					
					InetAddress dirClientes= miSocket.getInetAddress();
				
					String ipClientesConectados = dirClientes.getHostAddress();
					
					System.out.println("Dirección remota conectada: " + ipClientesConectados);
				
					listaIpConectados.add(ipClientesConectados);
					
					paqueteRecibido.setIP(listaIpConectados);
					
					for (String laip : listaIpConectados) {
						
						System.out.println("ArrayList: " + laip);
						
						Socket reenvioDestinatario = new Socket(laip,9090);
						
						ObjectOutputStream paqueteReEnvio = new ObjectOutputStream(reenvioDestinatario.getOutputStream());
					
						paqueteReEnvio.writeObject(paqueteRecibido);
					
						reenvioDestinatario.close();
					
						miSocket.close();
					}
				}
			
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}