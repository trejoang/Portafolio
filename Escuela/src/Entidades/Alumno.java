package Entidades;

public class Alumno {
	
	private int ncontrol; //key
	private String nombre;
	private String apellidop;
	private String apellidom;
	private String curso;
	
	public Alumno() {
		
	}

	public Alumno(int ncontrol, String nombre, String apellidop, String apellidom, String curso) {
		super();
		this.ncontrol = ncontrol;
		this.nombre = nombre;
		this.apellidop = apellidop;
		this.apellidom = apellidom;
		this.curso = curso;
	}

	public int getNcontrol() {
		return ncontrol;
	}

	public void setNcontrol(int ncontrol) {
		this.ncontrol = ncontrol;
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

	public String getApellidom() {
		return apellidom;
	}

	public void setApellidom(String apellidom) {
		this.apellidom = apellidom;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Alumno [ncontrol=" + ncontrol + ", nombre=" + nombre + ", apellidop=" + apellidop + ", apellidom="
				+ apellidom + ", curso=" + curso + "]\n";
	}
	

}
