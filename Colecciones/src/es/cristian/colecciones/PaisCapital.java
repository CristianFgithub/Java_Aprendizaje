package es.cristian.colecciones;

import java.util.LinkedList;
import java.util.ListIterator;

public class PaisCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> Paises = new LinkedList<String>();
		
		LinkedList<String> Capitales = new LinkedList<String>();
	
		ListIterator<String> itp = Paises.listIterator();
		
		ListIterator<String> itc = Capitales.listIterator();
		
		itp.add("España");
		itp.add("Colombia");
		itp.add("México");
		itp.add("Peru");
		
		itc.add("Madrid");
		itc.add("Bogotá");
		itc.add("D.F");
		itc.add("Lima");
		
		int endC = Capitales.size();
		//con esto vuelvo al index 0 al itc
		for (int j=0;j<endC;j++)itc.previous();

		int endP = Paises.size();
		int contador=1;
		for (int i=0; i<endP;i++) {
			if(itc.hasNext()) {
				Paises.add(contador, Capitales.get(i));
				contador = contador+2;
				itc.next();
			}
			else System.out.println("Ha habido un error, no hay capital para su Pais.");
		}
		for (String pais : Paises) {
			System.out.println(pais);
		}
		
		int contadorCapital = 1;
	


		
		//con esto vuelvo al index 0 al itc
		for (int j=0;j<endC;j++)itc.previous();
		
		while (itc.hasNext()) {
			if(contadorCapital%2==0) {
				itc.next();
				itc.remove();
				contadorCapital++;
			}
			else { itc.next();
			contadorCapital++;
			}
		}
		
		System.out.println("-----------Vamos a ver si borra los pares de las capitales---------------");
		
		for (String capital : Capitales) {
			System.out.println(capital);
		}
			
		
	}

}
