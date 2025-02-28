package Tenis;

public class Tenis {
	
	private String marca;
	private String modelo;
	private String color;
	private int talla; 
	private double precio;
	
	public Tenis() {
		
	}

	public Tenis(String marca, String modelo, String color, int talla, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.talla = talla;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Tenis [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", talla=" + talla + ", precio="
				+ precio + "]\n";
	}
	
	

}
