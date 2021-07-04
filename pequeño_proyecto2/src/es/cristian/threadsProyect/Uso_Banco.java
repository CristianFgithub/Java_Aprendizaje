package es.cristian.threadsProyect;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Uso_Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Banco b = new Banco();
		
		for (int i=0;i<100;i++) {
			
			EjecutandoTransferencias r = new EjecutandoTransferencias(b, i,2000);
			
			Thread t = new Thread(r);
			
			t.start();
		}

	}
}

class Banco{
	private double saldo = 2000;
	private final double [] cuentas;
	private Lock bloqueaBanco = new ReentrantLock();
	private Condition saldoSuficiente;
	
	public Banco() {
		cuentas = new double[100];
		
		for(int i=0;i<100;i++) {
			
			cuentas[i]=2000;
		}
		
		saldoSuficiente = bloqueaBanco.newCondition();
	}

	public void Transferencia(int cuentaOrigen,int cuentaDestino, double saldo) throws InterruptedException {
		bloqueaBanco.lock();
		try {
			//if(cuentas[cuentaOrigen] < saldo) return;
			
			while(cuentas[cuentaOrigen] < saldo) saldoSuficiente.await();
			
			System.out.println(Thread.currentThread());
			
			cuentas[cuentaOrigen]-= saldo;
			
			cuentas[cuentaDestino]+= saldo;
			
			//System.out.println(saldo + " € de la cuenta: " + cuentaOrigen + " a la cuenta: " + cuentaDestino);
			
			System.out.printf("%10.2f de %d para la cuenta %d", saldo, cuentaOrigen, cuentaDestino);
			System.out.println();
			//System.out.println(getSaldoTotal());
			System.out.printf("Saldo total: %10.2f%n", getSaldoTotal());

			saldoSuficiente.signalAll();
		}
		finally {
			bloqueaBanco.unlock();
		}
	}
	
	public double getSaldoTotal() {
		
		double sumaSaldoBanco = 0;
		
		for(double a:cuentas) {
			
			sumaSaldoBanco+=a;
			
		}
		return sumaSaldoBanco;
		
	}

}

class EjecutandoTransferencias implements Runnable{

	public EjecutandoTransferencias(Banco miBanco, int cuentaDeOrigen, double cantidadMaxima) {
		this.miBanco = miBanco;
		this.cuentaDeOrigen = cuentaDeOrigen;
		this.cantidadMaxima = cantidadMaxima;
	}



	private Banco miBanco;
	
	private int cuentaDeOrigen;
	
	private double cantidadMaxima;
	
	private Lock bloqueaBanco = new ReentrantLock();
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			
			int cuentaDeDestino = (int)(Math.random()*100);
			
			double cantidadATransferir = cantidadMaxima * Math.random();
			try {
			miBanco.Transferencia(cuentaDeOrigen, cuentaDeDestino,  cantidadATransferir);
			
			
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}