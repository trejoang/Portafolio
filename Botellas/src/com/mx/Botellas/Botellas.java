package com.mx.Botellas;

public class Botellas {
	
	private int id;
	private String marca;
	private String categoria;
	private String nombre;
	private double precio;
	
	public Botellas () {
		
	}

	public Botellas(int id, String marca, String categoria, String nombre, double precio) {
		super();
		this.id = id;
		this.marca = marca;
		this.categoria = categoria;
		this.nombre = nombre;
		this.precio = precio;
	}

	public Botellas(int id) {
		
		this.id = id;
	
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
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
		return "Botellas [id=" + id + ", marca=" + marca + ", categoria=" + categoria + ", nombre=" + nombre
				+ ", precio=" + precio + "]\n";
	}
	

}
