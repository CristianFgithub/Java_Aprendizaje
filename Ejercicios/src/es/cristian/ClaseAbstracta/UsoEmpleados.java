package es.cristian.ClaseAbstracta;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado empleados[]= new Empleado[4];
		
		EmpleadoFijo empleado1 = new EmpleadoFijo("6546546Z","Antonio","Lopez",2014,1125);
		empleados[0] = empleado1;
		EmpleadoComision empleado2 = new EmpleadoComision("7879879S","Sandra","Nieto",2011,169,19.10);
		empleados[1] = empleado2;
		//Aquí debería setear uno a uno los datos pero por simplificar lo hago así
		EmpleadoComision empleado3 = new EmpleadoComision("4654654D","Manuel","Ruiz",2010,35,6.9);
		empleados[2] = empleado3;
		EmpleadoFijo empleado4 = new EmpleadoFijo("778798F","Maria", "Ramos",2011,1055);
		empleados[3] = empleado4;
		
		sueldoMayor(empleados);
		mostrarTodos(empleados);
		
		
	}

	public static void sueldoMayor(Empleado empleados[]) {
		double Sueldo=0;
		int contador=0;
		for (int i=0;i<empleados.length;i++) {
			if (empleados[i].getSueldoTotal()>Sueldo) {
				Sueldo=empleados[i].getSueldoTotal();
				contador=i;
			}
		}
		System.out.println("El nombre de la persona con mayor sueldo es: " + empleados[contador].getNombre() + 
				"\nEl apellido es: " + empleados[contador].getApellidos() + "\nEl salario es: " + empleados[contador].getSueldoTotal());
	}
	
	public static void  mostrarTodos(Empleado empleados[]) {
		System.out.println("Todos los empleados:\n");
		for (int i=0;i<empleados.length;i++) {
			empleados[i].imprimir();
		}
		
		
		
	}
}
