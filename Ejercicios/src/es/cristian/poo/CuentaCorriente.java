package es.cristian.poo;

public class CuentaCorriente {

	public static void main(String[] args) {
		
		CrearCuentaCorriente cuenta1 = new CrearCuentaCorriente("Cristian", 9000);
		
		CrearCuentaCorriente cuenta2 = new CrearCuentaCorriente("Laura", 9000);
		
		System.out.println(cuenta1.setAndGetIngresoSaldo(500));
		
		System.out.println(cuenta1.setAndGetRetiradaSaldo(400));
		
		cuenta1.setIngreso(0, cuenta1, cuenta2);
		
		System.out.println(cuenta1.getDatos());
		
		System.out.println(cuenta2.getSaldo());

	}

public static class CrearCuentaCorriente{
	private final String nombre;
	
	private double saldo;
	
	private long numCuenta;
	
	//constructor
	public CrearCuentaCorriente(String nombre, int saldo) {
		
		this.nombre=nombre;
		
		this.saldo=saldo;
		
		numCuenta=(long) (Math.random()*10000);
	}
	
	public String setAndGetIngresoSaldo(double saldo) {
		
		if(saldo<=0)return "No se puede ingresar un n?mero negativo";
		else {
			this.saldo=saldo+this.saldo;
			return "Tu saldo actual es " + this.saldo;
		}
		
	}
	
	public String setAndGetRetiradaSaldo(double saldo) {
		
		if(saldo<=0) return "no se puede sacar un dinero negativo";
		else {
			this.saldo=this.saldo-saldo;
			return "Tu saldo actual tras sacar " + saldo + " es igual a: " +this.saldo;
		}
	}
	
	public double getSaldo() {
		
		return this.saldo;
		
	}
	
	public String getDatos() {
		
		return "El titular es: " + this.nombre + " el saldo es: " + this.saldo + " el n?mero de cuenta es: " + this.numCuenta;
	}
	
	public void setIngreso(double saldo,CrearCuentaCorriente origen, CrearCuentaCorriente destino) {
		origen.saldo-=saldo;
		destino.saldo+=saldo;
		
		
		
	}
	
	//metodos
	
	
	
}



}
