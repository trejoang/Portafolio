package Herenciaa;

public class Hija extends Madre{
	
	protected String localidad;
	protected String colorPelo;
	
	public Hija () {
		
	}

	public Hija(String nombre, String apellido, String oficio, double sueldo, String localidad, String colorPelo) {
		super(nombre, apellido, oficio, sueldo);
		this.localidad = localidad;
		this.colorPelo = colorPelo;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getColorPelo() {
		return colorPelo;
	}

	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}

	@Override
	public String toString() {
		return "Hija [nombre=" + nombre + ", apellido=" + apellido + ", oficio=" + oficio + ", sueldo=" + sueldo
				+ ", localidad=" + localidad + ", colorPelo=" + colorPelo + "]\n";
	}
	
	

}
