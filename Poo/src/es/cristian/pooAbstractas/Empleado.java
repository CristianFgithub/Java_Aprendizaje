package es.cristian.pooAbstractas;

import java.util.Arrays;
import java.util.Date;

public class Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Jefes David=new Jefes("David", new Date (312314), 4800);
		David.setCargo("Jefe supremo");
		System.out.println(David.getNombre());
		System.out.println(David.getDescripcion()+David.getCargo());*/
		Empleados losEmpleados[] = new Empleados[5];
		
		losEmpleados[0]= new Empleados("Juan", new Date(694234821), 2500);
		losEmpleados[1]= new Empleados("maria", new Date(694312231), 1500);
		losEmpleados[2]= new Empleados("Ana", new Date(69425821), 3500);
		losEmpleados[3]= new Empleados("Sandra", new Date(6921), 6000);
		losEmpleados[4]= new Empleados("Antonio", new Date(691231), 2100);
		
		Arrays.sort(losEmpleados);
		
		for (Empleados e: losEmpleados) {
			
			System.out.println(e.getDescripcion());
			
			
		}
		
		Jefes Manuel = new Jefes("Manuel", new Date(1412),5000);
		
		Empleados Sonia = new Empleados ("Sonia", new Date(512312), 3000);
		
		System.out.println("El trabajador " + Manuel.getNombre() + " tiene un bonus de: " + Manuel.setBonus(500));
		
	}

}
