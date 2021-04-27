package es.cristian.poo;

import java.util.GregorianCalendar;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		/*Empleados Antonio=new Empleados("Antonio", 1300.55,2005,9,15);
			
		Jefes Ana=new Jefes("Ana",2900,2008,8,9);
		
		System.out.println(Ana.getSueldo());
		
		Ana.setIncentivo(400);
		
		System.out.println(Ana.getSueldo());
		}	*/	
		
		Jefes Juan=new Jefes("Juan", 5000,2013,9,8);
		
		Juan.setIncentivo(400);
			
		Empleados[] losEmpleados= new Empleados[6];
		
		losEmpleados[0]=new Empleados("Cristian", 1305.4, 1999, 5, 3);
		losEmpleados[1]=new Empleados("Peponcio", 1305.4, 1919, 4, 6);
		losEmpleados[2]=new Empleados("Jose", 1305.4, 1992, 8, 2);
		losEmpleados[3]=new Empleados("Maria", 1305.4, 1993, 12, 4);
		losEmpleados[4]=Juan;
		losEmpleados[5]=new Jefes("Patricia",8000,2009,4,2);
		
		Jefes Patricia=(Jefes)losEmpleados[5];
		
		Patricia.setIncentivo(500.5);
		
		//casting explicito down
		/*Empleados Patricia=new Jefes("Patricia",2500,2007,5,6);
		
		Jefes PatriciaDirectora=(Jefes)Patricia;*/
		
		
		for (Empleados obj : losEmpleados) {
			System.out.println(obj.getDatosEmpleado() + " y un salario de: " +obj.getSueldo() );
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

class Jefes extends Empleados {
	//propiedades
	private double incentivo;
	
	
	
	//constructor
	public Jefes(String nombre, double sueldo, int agno, int mes, int dia) {
		super(nombre, sueldo, agno, mes, dia);
		
	}
	
	//metodos
	
	public void setIncentivo(double incentivo) {

		this.incentivo=incentivo;
	}
	
	public double getSueldo() {
		
		double sueldoJefe=super.getSueldo();
		return sueldoJefe + this.incentivo;
		
	}
}

