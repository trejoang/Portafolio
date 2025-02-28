package Entidades;

public class Profesor {
	private int nprof; //key
	private String nombre;
	private String apellido;
	private int htraba;
	private double sueldo;
	
	public Profesor() {
		
	}

	public Profesor(int nprof, String nombre, String apellido, int htraba, double sueldo) {
		super();
		this.nprof = nprof;
		this.nombre = nombre;
		this.apellido = apellido;
		this.htraba = htraba;
		this.sueldo = sueldo;
	}

	public int getNprof() {
		return nprof;
	}

	public void setNprof(int nprof) {
		this.nprof = nprof;
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

	public int getHtraba() {
		return htraba;
	}

	public void setHtraba(int htraba) {
		this.htraba = htraba;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Profesor [nprof=" + nprof + ", nombre=" + nombre + ", apellido=" + apellido + ", htraba=" + htraba
				+ ", sueldo=" + sueldo + "]\n";
	}
	

}
