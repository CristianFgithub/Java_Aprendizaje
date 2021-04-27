package es.cristian.pooAbstractas;

import java.util.Date;

public abstract class Personas {
	
	//propiedades
	private String nombre;
	
	//constructor
	
	public Personas(String nombre) {
		
		this.nombre=nombre;
		
	}
	//metodos
	
	public String getNombre() {
		return this.nombre;
	}
	
	public abstract String getDescripcion();
	

	}

class Empleados extends Personas implements Comparable,ParaTrabajadores{
	//metodos
	private double sueldo;
	
	private Date fechaAlta;
	
	//constructor
	public Empleados(String nombre, Date fechaAlta, double sueldo) {
		super(nombre);
		this.sueldo=sueldo;
		this.fechaAlta=fechaAlta;
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "El empleado: " + this.getNombre() + ", el sueldo es: " + this.sueldo + " y la fecha de alta es: " + this.fechaAlta;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Empleados otroEmpleado = (Empleados)o;
		
		if(this.sueldo<otroEmpleado.sueldo) return -1;
		else if (this.sueldo==otroEmpleado.sueldo)return 0;
		else return 1;
	}

	@Override
	public double setBonus(double gratificacion) {
		// TODO Auto-generated method stub
		return ParaTrabajadores.bonus + gratificacion;
	}
	
}

class Jefes extends Empleados implements ParaJefes{
	
	private double incentivo;
	private String cargo;
	public Jefes(String nombre, Date fechaAlta, double sueldo) {
		super(nombre, fechaAlta, sueldo);
		// TODO Auto-generated constructor stub
	
	}
	
	public void setIncentivo(double incentivo) {
		this.incentivo=incentivo;
	}
	public double Getsuedlo(){
		return (this.Getsuedlo()+this.incentivo);
	}

	@Override
	public void setCargo(String cargo) {
		
		this.cargo=cargo;
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCargo() {
		// TODO Auto-generated method stub
		
		
		return "\nAdemás tiene el cargo de: " + this.cargo;
	}

	@Override
	public double setBonus(double gratificacion) {
		// TODO Auto-generated method stub
		double prima=2000;
		return prima + gratificacion + ParaTrabajadores.bonus;
	}
}

class Alumnos extends Personas{
	//propiedades
	private String a_optativas;
	
	private String aula;
	
	//constructor
	public Alumnos(String nombre, String a_optativas, String aula) {
		super(nombre);
		
		this.a_optativas=a_optativas;
		
		this.aula=aula;
		
	}
	
	//metodos
	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "El alumno: " + this.getNombre() + " esta en el aula " + this.aula
		+ " y ha escogido las asignaturas " + this.a_optativas;
				
	}
	
}