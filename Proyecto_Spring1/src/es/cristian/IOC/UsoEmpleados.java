package es.cristian.IOC;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creación de objetos de tipo empleado
		
		/*Empleados Empleado1 = new SecretarioEmpleado();
		
		
		//Uso de los objetos Creados
		
		System.out.println(Empleado1.getTareas());*/
		ClassPathXmlApplicationContext contexto;
		contexto = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
		
		System.out.println(Juan.getTareas());
		
		contexto.close();
	}

}
