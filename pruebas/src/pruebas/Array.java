package pruebas;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] Array = new int[4];
		
		Array[0]=-100;
		
		Array[1]=84;
		
		Array[2]=10;
		
		Array[3]=9;
		
		SolArray prueba = new SolArray(Array);
		
		System.out.println(prueba.getArray());
		
	}

}

class SolArray {
	//propiedades
	int [] Array;
	
	
	public SolArray(int [] Array) {
		
		this.Array = Array;
		
	}
	
	public int getArray() {
	
		int solucion=0;
		
		for(int e : this.Array) {
				
			if(e%4==0) {
				solucion+=e;				
			}
		}	

		
		return solucion;
	}
	
	
	
}
