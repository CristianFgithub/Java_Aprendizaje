package es.cristian.flujo;

public class Ejemplo_For {

	public static void main(String[] args) {
		
		for (int i=1;i<11;i++) {
			
			System.out.println("Hola el saludo es el número " + i);
			//if(i==8)break;
			
			for(int j=0;j<10;j++) {
				
				System.out.println("Hola dentro de 2 for");
			}
		}
		
		System.out.println("He salido del bucle");
	}

}
