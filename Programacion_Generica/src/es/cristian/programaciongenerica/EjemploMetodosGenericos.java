package es.cristian.programaciongenerica;

import java.util.ArrayList;

public class EjemploMetodosGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombresPersonas[] = {"Sara", "Antonio", "Maria"};
		
		System.out.println(ExaminaArrays.getmenor(nombresPersonas));
		
	}

}

class ExaminaArrays{
	
	
	public static <T extends Comparable> T getmenor(T[]elArray){
		
		T objetoMenor=elArray[0];
		
		for(int i=1; i<elArray.length;i++) {
			if(objetoMenor.compareTo(elArray[1])>0) {
				
				objetoMenor=elArray[i];
			
			}
			
		}
		return objetoMenor;
		
	}
	
}
