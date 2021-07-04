package es.cristian.serializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Recuperando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		
			ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream("C:\\Users\\Cristian\\Documents\\Java\\Java_Aprendizaje\\Serializacion\\miObjeto.dat"));
		
			Empleado [] entradaObjeto =(Empleado[]) flujoEntrada.readObject();
		
			flujoEntrada.close();
			
			for(Empleado e: entradaObjeto) {
				
				System.out.println(e);
			}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
