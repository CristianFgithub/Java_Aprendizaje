package misBeans;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.*;

public class EjemploBean extends JLabel {
	
	private File laImagen=null;

	public EjemploBean() {
		
		setBorder(BorderFactory.createEtchedBorder());
		
	}

	public String getLaImagen() {
		
		if(laImagen==null)return null;
		
		else return laImagen.getPath();
	}
	
	public Dimension getPreferredSize() {
		
		return new Dimension(600,400);
	}

	public void setLaImagen(String escogeImagen) {
		
		laImagen = new File(escogeImagen);
		
		try {
			setIcon(new ImageIcon(ImageIO.read(laImagen)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			laImagen=null;
			setIcon(null);
		}
		
	}
	

}
