package Entidades;

public class Electronico extends Producto{
	
	protected String nombre;
	protected double precio;
	
	public Electronico() {
		
	}

	public Electronico(int codigo, String categoria, String tamano, String nombre, double precio) {
		super(codigo, categoria, tamano);
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Electronico [codigo=" + codigo + ", categoria=" + categoria + ", tamano=" + tamano + ", nombre="
				+ nombre + ", precio=" + precio + "]\n";
	}
	

}
