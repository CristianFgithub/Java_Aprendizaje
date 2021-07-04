package es.cristian.programacionGenerica;

import java.util.*;

public class Uso_Empleados {

	public static void main(String[] args) {
		
			
		/*Empleados[] losEmpleados= new Empleados[4];
		
		losEmpleados[0]=new Empleados("Cristian", 1305.4, 1999, 5, 3);
		losEmpleados[1]=new Empleados("Peponcio", 1305.4, 1919, 4, 6);
		losEmpleados[2]=new Empleados("Jose", 1305.4, 1992, 8, 2);
		losEmpleados[3]=new Empleados("Maria", 1305.4, 1993, 12, 4);
		losEmpleados[4] = new Empleados("Eva",1300,1992,8,5);
		*/
		
		ArrayList<Empleados> listaEmpleados = new ArrayList<Empleados>();
		
		//listaEmpleados.ensureCapacity(5);
		
		listaEmpleados.add(new Empleados("Cristian", 1305.4, 1999, 5, 3));
		listaEmpleados.add(new Empleados("Peponcio", 1305.4, 1919, 4, 6));
		listaEmpleados.add(new Empleados("Jose", 1305.4, 1992, 8, 2));
		listaEmpleados.add(new Empleados("Maria", 1305.4, 1993, 12, 4));
		
		//reemplazo de elemento
		
		listaEmpleados.set(1, new Empleados("Jorge",1900,2003,5,6));
		
		//System.out.println(listaEmpleados.size());
		
		/*for (Empleados obj : listaEmpleados) {
			System.out.println(obj.getDatosEmpleado()+ " y un salario de: " + obj.getSueldo());
		}
		*/
		/*Empleados EmpleadosArray[] = new Empleados[listaEmpleados.size()];
		
		listaEmpleados.toArray(EmpleadosArray);
		
		for (int i=0;i<EmpleadosArray.length; i++) {
			System.out.println(EmpleadosArray[i].getDatosEmpleado());
		}*/
		
		//iteradores
		
		Iterator<Empleados> IteradorEmpleados = listaEmpleados.iterator();
		
		while(IteradorEmpleados.hasNext()) {
			System.out.println(IteradorEmpleados.next().getDatosEmpleado());
		}
		
	}

}
class Empleados{
	
	
	//propiedades
	
	private final String nombre;
	  
	private static int IdSiguiente=1;
	
	private int Id;
	
	private double sueldo;
	
	GregorianCalendar calendario;
	
	//constructor
		
	public Empleados (String nombre, double sueldo, int agno, int mes, int dia) {
		
		this.nombre=nombre;
		
		this.sueldo=sueldo;
		
		this.calendario=new GregorianCalendar(agno, mes, dia);
		
		Id=IdSiguiente;
		
		IdSiguiente++;	
	}
	
	
	
	public String getDatosEmpleado() {
		
		return "El empleado " + this.nombre +  " tiene el ID: " + this.Id;
		
	}
	
	public double getSueldo() {
		
		return this.sueldo;
	
	}
	
	public GregorianCalendar getFechaAlta() {
		
		return this.calendario;
		
	}
	
	public void setSubeSalario(double porcentaje) {
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
		
	}
	public String getIdSiguiente() {
		
		return "El Id del siguiente Empleado será: " + IdSiguiente;
		
	}
	

	
}




