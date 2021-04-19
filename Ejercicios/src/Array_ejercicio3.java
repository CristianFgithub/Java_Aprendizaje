
public class Array_ejercicio3 {

	public static void main(String[] args) {
		
		int [] numeros= new int[100];

		for(int i=0;i<numeros.length;i++) {
			numeros[i]=(int) (Math.random()*100);
		}
		for (int elementos:numeros) {
			System.out.println(elementos);
		}
		
		
		
		
	}

}
