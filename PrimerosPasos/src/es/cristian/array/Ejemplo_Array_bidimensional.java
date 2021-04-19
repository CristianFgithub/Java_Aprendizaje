package es.cristian.array;

public class Ejemplo_Array_bidimensional {

	public static void main(String[] args) {
		
		/*int[][] numeros=new int[5][3];
		
		numeros[0] [0]=5;
		numeros[0] [1]=7;
		numeros[0] [2]=50;
		
		numeros[1] [0]=51;
		numeros[1] [1]=2;
		numeros[1] [2]=3;
		
		numeros[2] [0]=9;
		numeros[2] [1]=8;
		numeros[2] [2]=81;
		
		numeros[3] [0]=43;
		numeros[3] [1]=44;
		numeros[3] [2]=45;
		
		numeros[4] [0]=1;
		numeros[4] [1]=6;
		numeros[4] [2]=92;
				
		for(int i=0;i<numeros.length;i++) {
			
			for(int j=0;j<3;j++) {
			
				System.out.print(numeros[i][j] + " ");
			
			}
			System.out.println();
			
		}
		*/
		//System.out.println(numeros[2][1]);
		
		int[][] numeros= {
				{5,7,50},
				{51,2,3},
				{9,8,81},
				{43,44,45},
				{1,6,92}};
		
		for(int[] elementos1:numeros) {
			
			for(int elementos2:elementos1) {
				System.out.print(elementos2 + " ");
			}
		System.out.println();
		}
		
	}

}
