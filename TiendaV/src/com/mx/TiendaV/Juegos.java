package com.mx.TiendaV;

public class Juegos {
	
	private String estudio;
	private String nombre;
	private int id;
	private double precio;
	private String estado;
	//* constructores
	public Juegos() {
		
	}
	
	public Juegos(String estudio, String nombre, int id, double precio, String estado) {
		this.estudio=estudio;
		this.nombre= nombre;
		this.id=id;
		this.precio=precio;
		this.estado=estado;
	} //*
	
	//gets y sets
	
	public String getEstudio() {
		return estudio;
	}

	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}
	//ssss

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//ssss

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	//ssss

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	//sssss

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	
	public String toString() {
		return "Juegos[" + " estudio= " + estudio + " nombre= " + nombre +
				" id= " + id + " precio= " + precio +" estado=" + estado +"]\n";
	}
	
	
	
	

}
