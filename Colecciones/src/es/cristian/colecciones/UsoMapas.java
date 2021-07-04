package es.cristian.colecciones;

import java.util.*;

public class UsoMapas {
	
	public static void main(String[] args) {
		
		HashMap<String, Empleado> listaEmpleado = new HashMap<String,Empleado>();
		
		listaEmpleado.put("100", new Empleado("Cristian"));
		listaEmpleado.put("99", new Empleado("Pepe"));
		listaEmpleado.put("101", new Empleado("Ana"));
		listaEmpleado.put("312", new Empleado("Laura"));
		listaEmpleado.put("2312", new Empleado("Alejandro"));
		listaEmpleado.put("9229", new Empleado("Eva"));
		
		System.out.println(listaEmpleado);
		
		for (Map.Entry<String, Empleado> personaEmpleado : listaEmpleado.entrySet()) {
			
			String clave = personaEmpleado.getKey();
			
			Empleado valor = personaEmpleado.getValue();
			
			System.out.println("Clave= " + clave + " Valor= " + valor);
		}
	}

}

class Empleado{
	
	private String nombre;
	private double salario;
	
	public Empleado(String nombre) {
		this.nombre = nombre;
		
		salario=2000;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", salario=" + salario + "]";
	}
	
	
	
}