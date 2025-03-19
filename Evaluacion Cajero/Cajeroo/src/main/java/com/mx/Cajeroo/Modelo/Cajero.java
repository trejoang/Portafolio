package com.mx.Cajeroo.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Cajero {
	
	@Id
	@Column
	private int id;
	
	@Column
	private String tipo;
	
	@Column
	private int cantidad;
	
	@Column
	private double denominacion;
	 
	 public Cajero() {
		 
	 }

	public Cajero(int id, String tipo, int cantidad, int denominacion) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.cantidad = cantidad;
		this.denominacion = denominacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(double denominacion) {
		this.denominacion = denominacion;
	}

	@Override
	public String toString() {
		return "Cajero [id=" + id + ", tipo=" + tipo + ", cantidad=" + cantidad + ", denominacion=" + denominacion
				+ "]";
	}
	

}
