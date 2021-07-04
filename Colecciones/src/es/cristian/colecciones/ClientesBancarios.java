package es.cristian.colecciones;

import java.util.*;

public class ClientesBancarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente1 = new Cliente("Cristian Fuentes","0001",20000);

		Cliente cliente2 = new Cliente("Rafael Gomez","0002",15000);

		Cliente cliente3 = new Cliente("Ana Regordan","0003",200000);
		
		Cliente cliente4 = new Cliente("Juan Diaz","0004",20);
	
		Cliente cliente5 = new Cliente("Cristian Fuentes","0001",20000);
		
		Set<Cliente> clientesDelBanco = new HashSet<Cliente>();
	
		clientesDelBanco.add(cliente1);
		clientesDelBanco.add(cliente2);
		clientesDelBanco.add(cliente3);
		clientesDelBanco.add(cliente4);
		clientesDelBanco.add(cliente5);
		
		/*for (Cliente cliente : clientesDelBanco) {
			
			System.out.println(cliente.getNombre() + " tiene el número de cuenta: " + cliente.getnCuenta() + " y tiene un saldo de: " + cliente.getSaldo());
			
		}*/
		
		Iterator<Cliente> it = clientesDelBanco.iterator();
		
		while(it.hasNext()) {
			
			String nombreCliente = it.next().getNombre();
			
			
			
			System.out.println(nombreCliente);
		}
	
	}

}
