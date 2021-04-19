import java.util.Scanner;

public class Sucursales {

	public static void main(String[] args) {
		
		//Sucursal miSucursal = new Sucursal(1, "Calle vaguada número 2", "El cuervo de Sevilla");
	
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Introduce el número de la sucursal");
	
		int numero = entrada.nextInt();
		
		System.out.println("Introducce tu dirección");
		
		String direccion = entrada.next();
		
		System.out.println("Introducce tu ciudad");
		
		String ciudad = entrada.next();
		
		Sucursal miSucursal = new Sucursal(numero,direccion,ciudad);
		
		System.out.println("Cuantos paquetes desea enviar");
		
		int paquetes = entrada.nextInt();
		
		System.out.println("Referencia del envio");
		
		int referencia = entrada.nextInt();
		
		System.out.println("DNI Remitente");
		
		String DNI = entrada.next();
		
		System.out.println("¿Cual es su peso?");
		
		double peso=entrada.nextInt();
		
		System.out.println("Indique su prioridad 0=normal, 1=alta y 2=urgente");

		int prioridad = entrada.nextInt();
		
		Paquete miPaquete = new Paquete(referencia,peso,DNI,prioridad);
		
		System.out.println("El numero de tu sucursal es " + miSucursal.sucursal + ", "
				+ "la dirección es " + miSucursal.direccion + " y tu ciudad es: " + miSucursal.ciudad +
				". La referencia del envío es " + miPaquete.refEnvio + ", el DNI es: " + miPaquete.DNI + 
				", la prioridad es: " + miPaquete.prioridad + " y el precio es: " + miSucursal.calculaPrecio(miPaquete));
	
	
	
	}
	public static class Paquete{
		//propiedades
		
		private int refEnvio;
		
		private double peso;
		
		private String DNI;
		
		private int prioridad;
		
		//Constructor
		public Paquete(int refEnvio,double peso, String DNI, int prioridad) {
			
			this.refEnvio=refEnvio;
			
			this.peso=peso;
			
			this.DNI=DNI;
			
			this.prioridad=prioridad;
			
		}
		
		//metodos
		
		public void setModificacion(double peso) {
			
			this.peso=peso;			
		}
		
		public void setModificacion(int prioridad) {
			
			this.prioridad=prioridad;
		}
		
		public double getPeso() {
			
			return this.peso;
		}
		public double getPrioridad() {
			
			return this.prioridad;
		}
		
		
	}
	public static class Sucursal{
		//propiedades
		private int sucursal;
		
		private String direccion;
		
		private String ciudad;
		
		//constructor
		
		public Sucursal(int sucursal,String direccion, String ciudad) {
			
			this.sucursal=sucursal;
			
			this.direccion=direccion;
			
			this.ciudad=ciudad;
			
		}
			
		//metodos
		
		public double calculaPrecio(Paquete t) {
			
			double precio;
			
			precio=t.getPeso();
			
			if(t.getPrioridad()==1) precio+=10;
			if(t.getPrioridad()==2) precio+=20;
			
			return precio;
		}
		
		public String getSucursal(){
	
			return "La sucursal es " + this.sucursal;
		
		}
		
		public String getDireccion() {
			
			return "La dirección es " + this.direccion;
			
		}
		
		public String getCiudad() {
			
			return "La ciudad es " + this.ciudad;
			
		}
		

		
	}


}
