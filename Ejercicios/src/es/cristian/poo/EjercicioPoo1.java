package es.cristian.poo;

public class EjercicioPoo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjercicioPoo1_Constructor miCuenta1 = new EjercicioPoo1_Constructor("Cristian",1000);
		EjercicioPoo1_Constructor miCuenta2 = new EjercicioPoo1_Constructor("paco",2000);
		
		System.out.println(miCuenta1.getDatos());
		
		miCuenta1.setIngreso(590);
		
		miCuenta1.setReintegro(90);
		
		EjercicioPoo1_Constructor.Transferencia(miCuenta1, miCuenta2, 600);
		
		System.out.println(miCuenta1.getSaldo());
		
		System.out.println(miCuenta1.getDatos());
		
		System.out.println(miCuenta2.getDatos());
	}
	

	

}
