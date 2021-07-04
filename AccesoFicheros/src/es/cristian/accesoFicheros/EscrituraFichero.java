package es.cristian.accesoFicheros;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class EscrituraFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Escritura escritura = new Escritura();
		
		escritura.escribiendo();
	}

}


class Escritura{
	
	public void escribiendo() {
		
		String texto = "Estamos escribiendo en un fichero";
		
		try {
			FileWriter escritura = new FileWriter("C:\\Users\\Cristian\\Documents\\Java\\Java_Aprendizaje\\AccesoFicheros\\ficheroEscritura.txt");
			
			for(int i=0;i<texto.length();i++) {
				
				escritura.write(texto.charAt(i));
			}
		escritura.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
