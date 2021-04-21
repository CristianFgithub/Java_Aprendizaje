package es.cristian.poo;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		Empleados empleado1= new Empleados("Cristian");
		
		Empleados empleado2= new Empleados("Laura");
		
		System.out.println(empleado1.getDatosEmpleado());
		
		empleado1.setSeccion("Informática");
		
		System.out.println(empleado1.getDatosEmpleado());
		
		System.out.println(empleado2.getDatosEmpleado());

		System.out.println(Empleados.getIdSiguiente());
	}

}

class Empleados{
	
	//propiedades
	
	private final String nombre;
	
	private String seccion;
	  
	private static int IdSiguiente=1;
	
	private int Id;
	//constructor
		
	public Empleados (String nombre) {
		
		Id=IdSiguiente;
		
		IdSiguiente++;
	
		this.nombre=nombre;
		
		seccion="Administración";
	
	}
	
	public void setSeccion(String seccion) {
		this.seccion=seccion;
	}
	
	public String getDatosEmpleado() {
		
		return "El empleado " + this.nombre + " pertenece a la seccion de " + this.seccion + " y tu id es el " + this.Id;
		
	}
	
	public static String getIdSiguiente() {
		
		return "El Id del siguiente Empleado será: " + IdSiguiente;
		
	}
	
}
