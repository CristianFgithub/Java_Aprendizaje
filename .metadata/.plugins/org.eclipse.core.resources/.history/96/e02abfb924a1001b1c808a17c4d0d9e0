package es.cristian.poo;

public class Vehiculo {
	private int ruedas;
	
	private String color;
	
	private int largo;
	
	private double ancho;
	
	private int peso;
	
	private boolean climatizador;
	
	private boolean tapiceria_cuero;
	
	private boolean gps;
	
	
	
	
	public Vehiculo(int ruedas) { //constructor de la clase. mismo nombre que la clase.
		
		this.ruedas=ruedas;
		
		largo=2;
		
		ancho=1;
		
		peso=2;
		
		color="Sin color";
		
		
	}
	public Vehiculo(int ruedas, int largo, double ancho, int peso) { //constructor de la clase. mismo nombre que la clase.
		
		this.ruedas=ruedas;
		
		this.largo=largo;
		
		this.ancho=ancho;
		
		this.peso=peso;
		
		color="Sin color";
		
		
	}
	
	public void setExtra(boolean climatizador) {
		
		this.climatizador=climatizador;
		
	}
	
	public void setExtra(boolean climatizador ,boolean gps, boolean tapiceria_cuero) {
		
		this.climatizador=climatizador;
		
		this.gps=gps;
	
		this.tapiceria_cuero=tapiceria_cuero;
		
	}
	
	public String getExtra() {
		
		if(climatizador && !gps && !tapiceria_cuero) return "Tu vehiculo tiene solo climatizador";
		else if(climatizador && gps && tapiceria_cuero) return "Tu vehiculo tiene todos los extras";
		else return "Combinación de extras no válida";
		
	}
	

	public void setColor(String color) { //método setter establece valor de propiedad
		
		this.color=color;
		
	}
	
	public String getColor(){ //método getter devuelve valor de propiedad
		
		
		
		return color;
		
	}
	
	public String getDatosVehiculo() {
		
		
		
		return "Tu vehículo tiene " + ruedas + " ruedas. Ademas"+
		" tiene " + largo + " metros de largo";
	}
	
	

}
