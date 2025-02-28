package Entidades;

public abstract class Mascota {
	
	protected String nomre;
	protected String dueno;
	protected int edad;
	protected String residencia;
	
	public void ser(String nombre, String dueño) {
		System.out.println("La mascota: " + nombre + " Tiene como dueño a: " + dueno);
		
	}
	
	public abstract void acion();
	
	public Mascota() {
		
	}

	public Mascota(String nomre, String dueno, int edad, String residencia) {
		super();
		this.nomre = nomre;
		this.dueno = dueno;
		this.edad = edad;
		this.residencia = residencia;
	}

	public String getNomre() {
		return nomre;
	}

	public void setNomre(String nomre) {
		this.nomre = nomre;
	}

	public String getDueno() {
		return dueno;
	}

	public void setDueno(String dueno) {
		this.dueno = dueno;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getResidencia() {
		return residencia;
	}

	public void setResidencia(String residencia) {
		this.residencia = residencia;
	}

	@Override
	public String toString() {
		return "Mascota [nomre=" + nomre + ", dueno=" + dueno + ", edad=" + edad + ", residencia=" + residencia + "]";
	}
	

}
