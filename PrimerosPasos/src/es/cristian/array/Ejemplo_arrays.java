package es.cristian.array;

public class Ejemplo_arrays {

	public static void main(String[] args) {
		
		int [] valores= {1,4,5,9,10};

		String [] nombre_personas= {"Cristian","Pepe","Laura"};
		/*int[] valores= new int[5];
		
		valores[0]=1;
		
		valores[1]=4;
		
		valores[2]=5;
			
		valores[3]=9;
		
		valores[4]=10;
		*/
		//System.out.println(valores[1]);
		
		//for(int i=0;i<valores.length;i++)System.out.println(valores[i]);
		//for(int i=0;i<nombre_personas.length;i++)System.out.println(nombre_personas[i]);
		for(int elemento:valores) {
			System.out.println(elemento);
		}
		for(String elemento:nombre_personas)System.out.println(elemento);
	}

}
