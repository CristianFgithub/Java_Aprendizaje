package es.cristian.colecciones;

import java.util.*;

public class PruebaLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> personas = new LinkedList<String>();
		
		personas.add("Cristian");
		
		personas.add("Pepe");
		
		personas.add("Ana");
		
		System.out.println(personas.size());
		
		ListIterator<String> it= personas.listIterator();
		
		it.next();
		
		it.add("Sandra");
		
		for( String persona : personas) {
			
			System.out.println(persona);
		}
	}

}
