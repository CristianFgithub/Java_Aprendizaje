package es.cristian.colecciones;

import java.util.*;

public class ColeccionTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*TreeSet<String> ordenaGente = new TreeSet<String>();
		
		ordenaGente.add("Cristian");
		
		ordenaGente.add("Maria");
		
		ordenaGente.add("Ana");
		
		
		for (String gente : ordenaGente) {
			System.out.println(gente);
		}*/
		
		Productos comparadorPr = new Productos();
		
		TreeSet<Productos> ordenaProductos = new TreeSet<Productos>(comparadorPr);
	
		Productos producto2 = new Productos(2,"segundo");
		Productos producto3 = new Productos(3,"es el tercero");
		Productos producto1 = new Productos(1,"es el primero y tiene tomates");
		Productos producto4 = new Productos(4,"es el cuarto medio");
		
		ordenaProductos.add(producto4);
		ordenaProductos.add(producto1);
		ordenaProductos.add(producto2);
		ordenaProductos.add(producto3);
		
		for (Productos e : ordenaProductos) {
			
			System.out.println(e.getDescripcion());
		}
		
	}

}


class Productos implements Comparable<Productos>, Comparator<Productos>{
	
	private int numeroProducto;
	
	private String descripcion;
	
	public Productos() {
		
	}
	
	public Productos (int numeroProducto,String descripcion) {
		this.numeroProducto = numeroProducto;
		this.descripcion = descripcion;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	@Override
	public int compareTo(Productos o) {
		// TODO Auto-generated method stub
		return numeroProducto - o.numeroProducto;
	}

	@Override
	public int compare(Productos o1, Productos o2) {
		// TODO Auto-generated method stub
		int carac1 = o1.getDescripcion().length();
		int carac2 = o2.getDescripcion().length();
		
		if ( carac1<carac2) return -1;
		else if (carac1>carac2) return 1;
		else return 0;
	}


	
}