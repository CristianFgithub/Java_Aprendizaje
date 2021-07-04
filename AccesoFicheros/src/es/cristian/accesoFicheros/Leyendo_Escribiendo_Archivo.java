package es.cristian.accesoFicheros;

import java.io.*;

public class Leyendo_Escribiendo_Archivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador=0;
		
		int bytesImagen[] = new int[147780];
		
		try {
			FileInputStream lectura_archivo = new FileInputStream("C:\\Users\\Cristian\\Documents\\Java\\Java_Aprendizaje\\AccesoFicheros\\Fuentes_Sillero_Cristian_CV.pdf");
			
			boolean final_archivo=false;
			
			while(!final_archivo) {
				
				int byteImagenEntrada = lectura_archivo.read(); 
				
				if (byteImagenEntrada!=-1) bytesImagen[contador] = byteImagenEntrada;
				
				else final_archivo=true;
				
				System.out.println(bytesImagen[contador]);
				
				contador++;
			}
			lectura_archivo.close();
			
			//System.out.println(contador);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CreaFichero(bytesImagen);
		
	}
	
	static void CreaFichero(int arrayExterno[]) {
		
		try {
			
			FileOutputStream ficheroExterno = new FileOutputStream("C:\\Users\\Cristian\\Documents\\Java\\Java_Aprendizaje\\AccesoFicheros\\Fuentes_Sillero_Cristian_CV_Copiada.pdf");
			
			for(int i=0; i<arrayExterno.length;i++) {
				
				ficheroExterno.write(arrayExterno[i]);
				
				
			}
			ficheroExterno.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
