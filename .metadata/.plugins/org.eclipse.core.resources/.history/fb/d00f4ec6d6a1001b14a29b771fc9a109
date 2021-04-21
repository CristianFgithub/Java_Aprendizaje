package es.cristian.poo;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		Empleados empleado1= new Empleados("Cristian");
		
		System.out.println(empleado1.getDatosEmpleado());
		
		empleado1.setSeccion("Informática");
		
		System.out.println(empleado1.getDatosEmpleado());
		
		
	}

}

class Empleados{
	
	//propiedades
	
	private final String nombre;
	
	private String seccion;
	
	//constructor
	
	public Empleados (String nombre) {
	
		this.nombre=nombre;
	
		seccion="Administración";
	
	}
	
	public void setSeccion(String seccion) {
		this.seccion=seccion;
	}
	
	public String getDatosEmpleado() {
		
		return "El empleado " + this.nombre + " pertenece a la seccion de " + this.seccion;
		
	}
}
