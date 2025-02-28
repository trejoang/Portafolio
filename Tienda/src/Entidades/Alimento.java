package Entidades;

public class Alimento extends Producto{
	
	protected String color;
	protected double precio;
	
	public Alimento() {
		
	}

	public Alimento(int codigo, String categoria, String tamano, String color, double precio) {
		super(codigo, categoria, tamano);
		this.color = color;
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Alimento [codigo=" + codigo + ", categoria=" + categoria + ", tamano=" + tamano + ", color=" + color
				+ ", precio=" + precio + "]\n";
	}

     
	

}
