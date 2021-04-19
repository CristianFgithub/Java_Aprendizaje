package es.cristian.poo;

public class EjercicioPoo1_Constructor {

	public EjercicioPoo1_Constructor(String nombreTitular, double saldo) {
	
		this.nombreTitular=nombreTitular;
		
		this.saldo=saldo;
		
		numeroCuenta=(long) (Math.random()*1000);
		
	}
	
	public void setIngreso(int ingreso) {
		saldo=saldo+ingreso;
	}
	
	public void setReintegro(int reintegro) {
		saldo=saldo-reintegro;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getDatos() {
		
		return "El nombre del titular es: " + nombreTitular + " el saldo es " + saldo + "€ y tu número de cuenta es " + numeroCuenta  ;
	}
	
	public static void Transferencia(EjercicioPoo1_Constructor titul1, EjercicioPoo1_Constructor titul2, double cantidad) {
		titul1.saldo-=cantidad;
		titul2.saldo+=cantidad;
	}
	
	private double saldo;
	
	private String nombreTitular;
	
	private long numeroCuenta;
}
