package es.cristian.colegioPoo;

public class UsoColegio {

	public static void main(String[] args) {
		
		Colegio SanJavier=new Colegio("San Javier", 200);

		SanJavier.nuevoAlumno("Juan", 8.5);
		
		SanJavier.nuevoAlumno("Cristian", 10);
		
		SanJavier.getTodosAlumnos();
		
		
		
		//System.out.println(SanJavier.getDatoAlumno("Jn"));
	}

}
