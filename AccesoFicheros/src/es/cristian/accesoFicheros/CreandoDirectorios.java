package es.cristian.accesoFicheros;

import java.io.File;
import java.io.IOException;

public class CreandoDirectorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		File directorio = new File("C:"+File.separator+ "Users"+File.separator+ "Cristian"+File.separator+"Documents"+File.separator+"Java"+File.separator+"Java_Aprendizaje"+File.separator+"pdf" + File.separator + "Creando_Directorio"+ File.separator + "CreandoArchivo.txt");
		
		try {
			directorio.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
