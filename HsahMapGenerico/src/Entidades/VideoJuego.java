package Entidades;

public class VideoJuego {
	//atributos
	private String nombre;  //Key
	private String categorias;
	private String compania;
	private int estreno;
	private double precio;
	private String clasificacion;
	
	public VideoJuego() {
		
	}

	public VideoJuego(String nombre, String categorias, String compania, int estreno, double precio,
			String clasificacion) {
		super();
		this.nombre = nombre;
		this.categorias = categorias;
		this.compania = compania;
		this.estreno = estreno;
		this.precio = precio;
		this.clasificacion = clasificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategorias() {
		return categorias;
	}

	public void setCategorias(String categorias) {
		this.categorias = categorias;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public int getEstreno() {
		return estreno;
	}

	public void setEstreno(int estreno) {
		this.estreno = estreno;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	@Override
	public String toString() {
		return "VideoJuego [nombre=" + nombre + ", categorias=" + categorias + ", compania=" + compania + ", estreno="
				+ estreno + ", precio=" + precio + ", clasificacion=" + clasificacion + "]\n";
	}
	

}
