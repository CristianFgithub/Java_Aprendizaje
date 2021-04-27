package es.cristian.ClaseAbstracta;

public abstract class Empleado {
	
	//propiedades
	private String DNI;
	private String nombre;
	private String apellidos;
	private int agnoAlta;
	
	abstract public double getSueldo();
	abstract public double getSueldoTotal();
	abstract public void imprimir();
	
	
	
	
	//constructor
	
	public Empleado(String DNI, String nombre, String apellidos, int agnoAlta) {
		
		this.DNI=DNI;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.agnoAlta=agnoAlta;
		
	}
	
	//metodos
	public int getAgnoAlta() {
		return this.agnoAlta;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getApellidos() {
		return this.apellidos;
	}
	
	public String getDNI(){
		return this.DNI;
	}
	
	
	
	
	
}
class EmpleadoFijo extends Empleado{
	//propiedades
	private double sueldo;
	
	
	
	//constructor
	public EmpleadoFijo(String DNI, String nombre, String apellidos, int agnoAlta, double salarioFijo) {
		super(DNI, nombre, apellidos, agnoAlta);
		
		this.sueldo=salarioFijo+getSueldo();
		
		
	}

	
	//metodos
	
	public double getSueldo() {
		int agnoExperiencia=2021-this.getAgnoAlta();
		if (agnoExperiencia<2) return 0;
		else if(agnoExperiencia>=2 && agnoExperiencia<=3)return this.sueldo=this.sueldo+this.sueldo*0.07;
		else if(agnoExperiencia>3 && agnoExperiencia<=8)return this.sueldo=this.sueldo+this.sueldo*0.11;
		else return this.sueldo=this.sueldo+this.sueldo*0.17;
		
		
	}
	
	public double getSueldoTotal() {
		return this.sueldo;
	}
	
	public void imprimir() {
		System.out.println("Los datos del empleado son los siguientes: DNI: " + this.getDNI() + " Nombre: " + this.getNombre() + " Apellidos: " + this.getApellidos() + " Año de alta: " + this.getAgnoAlta() + " y su salario es: " + this.sueldo);
	}

	
}

class EmpleadoComision extends Empleado{
	
	//propiedades
	private double sueldo;
	private int ClientesCaptados;
	private double comision;
	
	//constructor
	public EmpleadoComision(String DNI, String nombre, String apellidos, int agnoAlta, int ClientesCaptados, double comision) {
		super(DNI, nombre, apellidos, agnoAlta);
		
		this.ClientesCaptados=ClientesCaptados;
		
		this.comision=comision;
		
		this.sueldo=getSueldo();
	}
	
	//metodos
	public double getSueldo() {
		double DineroGenerado=this.ClientesCaptados*this.comision;
		
		if (DineroGenerado<950)return 950;
		else return DineroGenerado;
		
	}
	
	public double getSueldoTotal() {
		return this.sueldo;
	}

	
	public double getComision() {
		return this.comision;
	}
	public int getClientesCap() {
		return this.ClientesCaptados;
	}
	public void imprimir() {
		System.out.println("Los datos del empleado son los siguientes: DNI: " + this.getDNI() + " Nombre: " + this.getNombre() + " Apellidos: " + this.getApellidos() + " Año de alta: " + this.getAgnoAlta() + " Su salario es: " + this.sueldo + " Sus clientes totales son: " + this.ClientesCaptados + " su comisión es: " +this.comision);
	}
	
	
	
	
	
	
}
