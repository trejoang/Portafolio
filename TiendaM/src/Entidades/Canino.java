package Entidades;

public class Canino extends Mascota{
	
	private String raza;
	private String tamano;
	private double peso;
	
	public void acion() {
		System.out.println("Defiendo la casa");
	}
	public Canino() {
		
	}
	public Canino(String nomre, String dueno, int edad, String residencia, String raza, String tamano, double peso) {
		super(nomre, dueno, edad, residencia);
		this.raza = raza;
		this.tamano = tamano;
		this.peso = peso;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getTamano() {
		return tamano;
	}
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Canino [nomre=" + nomre + ", dueno=" + dueno + ", edad=" + edad + ", residencia=" + residencia
				+ ", raza=" + raza + ", tamano=" + tamano + ", peso=" + peso + "]";
	}
	

}
