package es.cristian.BasesDeDatos;

public class Pedidos {

	public Pedidos(String seccion,String nombreArticulo) {
		this.seccion=seccion;
		this.nombreArticulo=nombreArticulo;
	}

	private String codigoArticulo,seccion,nombreArticulo,Descripcion,Precio,Fecha,Importado,PaisOrigen;

	public String getCodigoArticulo() {
		return codigoArticulo;
	}

	public void setCodigoArticulo(String codigoArticulo) {
		this.codigoArticulo = codigoArticulo;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public String getNombreArticulo() {
		return nombreArticulo;
	}

	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getPrecio() {
		return Precio;
	}

	public void setPrecio(String precio) {
		Precio = precio;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public String getImportado() {
		return Importado;
	}

	public void setImportado(String importado) {
		Importado = importado;
	}

	public String getPaisOrigen() {
		return PaisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		PaisOrigen = paisOrigen;
	};
	

}
