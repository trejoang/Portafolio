package Entidades;

public class Ave extends Mascota{
	
	private String color;
	private String tamano;
	private double peso;
	
	public void acion() {
		System.out.println("Alegro el dia");
	}
	public Ave() {
		
	}
	public Ave(String nomre, String dueno, int edad, String residencia, String color, String tamano, double peso) {
		super(nomre, dueno, edad, residencia);
		this.color = color;
		this.tamano = tamano;
		this.peso = peso;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
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
		return "Ave [nomre=" + nomre + ", dueno=" + dueno + ", edad=" + edad + ", residencia=" + residencia + ", color="
				+ color + ", tamano=" + tamano + ", peso=" + peso + "]";
	}
	
	

}
