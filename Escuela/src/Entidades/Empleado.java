package Entidades;

public class Empleado {
	private String nseguro; //key
	private String nombre;
	private String apellidop;
	private String edificio;
	private double sueldo;
	
	public Empleado() {
		
	}

	public Empleado(String seguro, String nombre, String apellidop, String edificio, double sueldo) {
		super();
		this.nseguro = seguro;
		this.nombre = nombre;
		this.apellidop = apellidop;
		this.edificio = edificio;
		this.sueldo = sueldo;
	}

	public String getSeguro() {
		return nseguro;
	}

	public void setSeguro(String seguro) {
		this.nseguro = seguro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidop() {
		return apellidop;
	}

	public void setApellidop(String apellidop) {
		this.apellidop = apellidop;
	}

	public String getEdificio() {
		return edificio;
	}

	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [seguro=" + nseguro + ", nombre=" + nombre + ", apellidop=" + apellidop + ", edificio="
				+ edificio + ", sueldo=" + sueldo + "]\n";
	}
	

}
