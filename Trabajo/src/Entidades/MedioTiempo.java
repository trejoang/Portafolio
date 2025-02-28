package Entidades;

public class MedioTiempo extends Empleado{
	
	private String lugar;
	
	
	public MedioTiempo() {
		
	}


	public MedioTiempo(String nombre, String trabajo, double costo, int horas, String lugar) {
		super(nombre, trabajo, costo, horas);
		this.lugar = lugar;
	}


	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}



	@Override
	public String toString() {
		return "MedioTiempo [nombre=" + nombre + ", trabajo=" + trabajo + ", costo=" + costo + ", horas=" + horas
				+ ", lugar=" + lugar + "]";
	}

	

}
