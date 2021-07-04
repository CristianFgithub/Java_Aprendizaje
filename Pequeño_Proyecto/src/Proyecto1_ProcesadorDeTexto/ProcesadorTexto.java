package Proyecto1_ProcesadorDeTexto;

import java.awt.*;
import javax.swing.*;
import javax.swing.text.StyledEditorKit;

public class ProcesadorTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marcoProcesadorTexto miMarco = new marcoProcesadorTexto();
		
		miMarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
	}

}


class marcoProcesadorTexto extends JFrame{
	
	public marcoProcesadorTexto() {
		
		setBounds(600,400,600,500);
		
		add(new LaminaProcesadorTexto());
		
		setVisible(true);
	}
	
}

class LaminaProcesadorTexto extends JPanel{
	
	//declaraciones
	private JTextPane miArea;
	private JMenu fuente,estilo, tamanio, color;
	
	public LaminaProcesadorTexto() {
		
		setLayout(new BorderLayout());
		
		JPanel superior = new JPanel();
		
		//Construcción de menú
		
		JMenuBar miBarra= new JMenuBar();
		
		fuente = new JMenu("Fuente");
		
		estilo = new JMenu("Estilo");
		
		tamanio = new JMenu("Tamaño");
		
		color = new JMenu("Color");
		
		configuraMenu("Arial","fuente","Arial",1,12);
		
		configuraMenu("Courier","fuente","Courier",1,12);
		
		configuraMenu("Verdana","fuente","Verdana",1,12);
		
		configuraMenu("Azul", "color","Azul",1,12);	
		
		miBarra.add(fuente);
		miBarra.add(estilo);
		miBarra.add(tamanio);
		
		//----------------------
		
		configuraMenu("Negrita","estilo","",Font.BOLD,12);
		
		configuraMenu("Cursiva","estilo","",Font.ITALIC,12);
		
		//------------------------
		
		configuraMenu("12", "tamaño", "", 1,12);
		
		configuraMenu("16", "tamaño", "", 1,16);
		
		configuraMenu("20", "tamaño", "", 1,20);
		
		configuraMenu("24", "tamaño", "", 1,24);
		
		superior.add(miBarra);
		
		add(superior, BorderLayout.NORTH);
		
		miArea = new JTextPane();
		
		add(miArea, BorderLayout.CENTER);
		
		//barra de herramientas
		
		JButton colorAzul = new JButton(new ImageIcon("azul.jpg"));
		JButton colorRojo = new JButton(new ImageIcon("rojo.png"));
		JButton colorVerde = new JButton(new ImageIcon("verde.jpg"));
		
		JToolBar barra = new JToolBar("Barra de Herramientas",JToolBar.VERTICAL);
		
		barra.add(colorAzul);
		barra.add(colorRojo);
		barra.add(colorVerde);
		
		add(barra, BorderLayout.WEST);
	}
	public void configuraMenu(String rotulo, String menu, String tipoLetra, int estilo, int tamagno) {
		
		JMenuItem elemMenu = new JMenuItem(rotulo);
		
		
		if (menu=="fuente") {
			
			fuente.add(elemMenu);
			elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("CambiaLetra", tipoLetra));
		}
		
		else if (menu =="estilo") {
			this.estilo.add(elemMenu);
			
			if(estilo==Font.BOLD)elemMenu.addActionListener(new StyledEditorKit.BoldAction());
			else elemMenu.addActionListener(new StyledEditorKit.ItalicAction());
		}
		
		else if (menu=="tamaño") {
			this.tamanio.add(elemMenu);
			elemMenu.addActionListener(new StyledEditorKit.FontSizeAction("CambiaTamaño", tamagno));
		}
		
		if (menu=="Color") {
			Font miFont = miArea.getFont();
			if (rotulo=="Azul") elemMenu.addActionListener(new StyledEditorKit.ForegroundAction(miFont.getFontName(),new Color(0,0,255)));
		}
		
			
		
		//SI QUISIERAMOS TODO EL TEXTO QUITAMOS ESTE COMENTARIO Y EL DE GESTIONAEVENTOS
		//elemMenu.addActionListener(new  GestionaEventos(rotulo,tipoLetra,estilo,tamagno));
	
	}
	
	
	
	
	
	
	/*SI QUISIERAMOS QUE FUERA TODO EL TEXTO
	 * 
	 * private class GestionaEventos implements ActionListener{

		String rotulo; 
		String tipoLetra;
		int estilo;
		int tamagno;
		Font letraExistente;
		
		public GestionaEventos(String rotulo,String tipoLetra,int estilo,int tamagno) {
			
			this.rotulo=rotulo;
			this.tipoLetra=tipoLetra;
			this.estilo=estilo;
			this.tamagno=tamagno;
			
		}
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			letraExistente = miArea.getFont();
			
			if(rotulo=="Arial" || rotulo=="Courier" || rotulo=="Verdana") {
				
				estilo=letraExistente.getStyle();
				
				tamagno=letraExistente.getSize();
				
			}
			
			else if(rotulo=="Cursiva" || rotulo=="Negrita") {
				
				if(letraExistente.getStyle()==1 && rotulo=="cursiva" || letraExistente.getStyle()==2 && rotulo=="negrita") estilo=3;
				
				tipoLetra=letraExistente.getFontName();
				
				tamagno=letraExistente.getSize();
				
				
			}
			else if(rotulo=="12" || rotulo=="16" || rotulo=="20" || rotulo=="24") {
				
				tipoLetra=letraExistente.getFontName();
				
				estilo=letraExistente.getStyle();
			}
			
			miArea.setFont(new Font(tipoLetra, estilo,tamagno));
			
		}
		
	}*/
	
	
}