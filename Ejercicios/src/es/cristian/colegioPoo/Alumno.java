package es.cristian.colegioPoo;

public class Alumno {

	// propiedades
	private Colegio nombreColegio;
	
	private String nombreAlumno;

	private double notaMedia;

	private static int numeroAlumno=1;
	
	private int nAlumno;
	//constructor
	public Alumno(Colegio NombreColegio, String nombreAlumno, double notaMedia) {
		
		this.nombreColegio=NombreColegio;
		
		this.nombreAlumno=nombreAlumno;
		
		this.notaMedia=notaMedia;
		
		nAlumno=numeroAlumno;
		
		numeroAlumno++;
		
		
	}
	
	
	//metodos
	public String toString() {
		
		return "Nombre alumno: " + this.nombreAlumno + "\nColegio: " +
		this.getNombreColegioAlumno() + "\nN? alumno: " + this.nAlumno + 
		"\nNota media: " + this.notaMedia;
				
	}
	
	
	public String getNombreColegioAlumno() {
		
		return this.nombreColegio.getNombreColegio();
	}
	
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	
	public void setNotaMedia(double notaMedia) {
		
		this.notaMedia=notaMedia;
		
	}

}
