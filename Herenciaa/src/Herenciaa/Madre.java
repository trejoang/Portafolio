package Herenciaa;

public class Madre {
	
	protected String nombre;
	protected String apellido;
	protected String oficio;
	protected double sueldo;
	
	public Madre () {
		
	}

	public Madre(String nombre, String apellido, String oficio, double sueldo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.oficio = oficio;
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Madre [nombre=" + nombre + ", apellido=" + apellido + ", oficio=" + oficio + ", sueldo=" + sueldo + "]\n";
	}
	
	public void mensj () {
		System.out.println("ocupada en mi sueño");
	}
	

}
