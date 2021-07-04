package es.cristian.colecciones;

public class UsoLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		libro libro1= new libro("Cristian","programacion",10);
		libro libro2= new libro("Cristian","programacion",10);
		//libro1=libro2;
		if(libro1.equals(libro2)) {
			System.out.println("Es igual");
			
			System.out.println(libro1.hashCode());
			
			System.out.println(libro2.hashCode());
		}
		else {
			
			System.out.println("No son iguales");
			
			System.out.println(libro1.hashCode());
			
			System.out.println(libro2.hashCode());
		}

	}

}

class libro{
	//propiedades
	private String autor;
	private String titulo;
	private int ISBN;
	
	//constructor
	public libro(String autor, String titulo, int iSBN) {
		this.autor = autor;
		this.titulo = titulo;
		ISBN = iSBN;
	}
	
	//metodos
	
	/*public boolean equals(Object obj) {
		
		libro otrolibro=(libro)obj;
		
		if(obj instanceof libro) {
			
			if(this.ISBN==otrolibro.ISBN) return true;
			else return false;
			
		}
		else return false;
		
		
		
	}*/
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ISBN;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		libro other = (libro) obj;
		if (ISBN != other.ISBN)
			return false;
		return true;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	
	public String getDatos() {
		
		return "El titulo es: " + this.titulo + ". El autor es: "+ this.autor + ". Y el ISBN es: " + this.ISBN + ".";
	}
	
	

}