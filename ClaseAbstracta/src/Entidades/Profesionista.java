package Entidades;

public abstract class Profesionista {
	
	//declarar atributos
	protected String nomre;
	protected String apellido;
	protected int edad;
	protected int cedula;
	protected String univeridad;
	protected int experiencia;
	
	//metodo concrecto
	public void cobrar(String trabajo, double sueldo) {
		System.out.println("Trebajo como: " + trabajo + " y me pagan: " + sueldo);
	}
	
	//metodo asbtracto
	public abstract void trabajar();
	
	public Profesionista() {
		
	}

	public Profesionista(String nomre, String apellido, int edad, int cedula, String univeridad, int experiencia) {
		super();
		this.nomre = nomre;
		this.apellido = apellido;
		this.edad = edad;
		this.cedula = cedula;
		this.univeridad = univeridad;
		this.experiencia = experiencia;
	}

	public String getNomre() {
		return nomre;
	}

	public void setNomre(String nomre) {
		this.nomre = nomre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getUniveridad() {
		return univeridad;
	}

	public void setUniveridad(String univeridad) {
		this.univeridad = univeridad;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Profesionista [nomre=" + nomre + ", apellido=" + apellido + ", edad=" + edad + ", cedula=" + cedula
				+ ", univeridad=" + univeridad + ", experiencia=" + experiencia + "]";
	}
	

}
