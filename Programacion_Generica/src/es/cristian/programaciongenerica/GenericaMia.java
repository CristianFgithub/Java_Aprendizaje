package es.cristian.programaciongenerica;

public class GenericaMia<T>{
	
	private T objeto;
	
	public GenericaMia() {
		
		this.objeto=null;
		
	}
	
	public void setObjeto(T nuevoValor) {
		
		this.objeto = nuevoValor;
		
	}
	
	public T getObjeto(){
		
		return this.objeto;
	}
	
	
	
	
	
}
