package com.mx.Coche;

public class Coche {
	//declaracion de atributos
	private String marca;
	private String submarca;
	private int modelo;
	private String color;
	private String transmision;
	private double precio;
	
	//constructor por defecto o constructor vacio
	public Coche() {
		
	}
	
	// construtor parametrizado inicialzar el objecto con valores espesificos
	public Coche(String marca, String submarca, int modelo, String color, String transmision, double precio) {
		this.marca=marca;
		this.submarca=submarca;
		this.modelo=modelo;
		this.color=color;
		this.transmision=transmision;
		this.precio=precio;
	}
	//metodos get y set
	//get: regresa el valor del atributo
	//set: modefica el valor del atributo con validaciones
	public String getMarca() {
		return marca;
	}
		public void setMarca(String marca) {
			this.marca=marca;
		}
		//
	public String getSubMarca() {
			return submarca;
		}
		public void setSubMarca(String submarca) {
				this.submarca=submarca;
			}
			//
	public int getModelo() {
				return modelo;
			}
		public void setModelo(int modelo) {
					this.modelo=modelo;
				}
				//
		public String getColor() {
			return color;
		}
	public void setColor(String color) {
				this.color=color;
			}
			//
	public String getTransmision() {
					return transmision;
				}
		public void setTransmisiona(String transmision) {
						this.transmision=transmision;
					}
					//
	public double getPrecio() {
						return precio;
					}
		public void setPrecio(double precio) {
							this.precio=precio;
						}
		//metodo toString declaracion en las funciones, sirve para cualquier objeto en cadena(String)
		//se utilizapara representar un objecto en cadena y los convierte en legibles
		public String toString() {
			return "Coche[" + " marca = " + marca + " submarca= " + submarca + " modelo= " + modelo + " color= " + color +
					" transmision= " + transmision + " precio= " + precio + "]\n";
		}
		

}
