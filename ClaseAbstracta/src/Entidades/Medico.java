package Entidades;

public class Medico extends Profesionista {
	
	private String especialidad;
	private String consultorio;
	private double costoConsulta;
	
	
	@Override
	public void trabajar() {
		System.out.println("trabajo en turnos nocturnos");
		
	}
	
	public Medico() {
		
	}

	public Medico(String nomre, String apellido, int edad, int cedula, String univeridad, int experiencia,
			String especialidad, String consultorio, double costoConsulta) {
		super(nomre, apellido, edad, cedula, univeridad, experiencia);
		this.especialidad = especialidad;
		this.consultorio = consultorio;
		this.costoConsulta = costoConsulta;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getConsultorio() {
		return consultorio;
	}

	public void setConsultorio(String consultorio) {
		this.consultorio = consultorio;
	}

	public double getCostoConsulta() {
		return costoConsulta;
	}

	public void setCostoConsulta(double costoConsulta) {
		this.costoConsulta = costoConsulta;
	}

	@Override
	public String toString() {
		return "Medico [nomre=" + nomre + ", apellido=" + apellido + ", edad=" + edad + ", cedula=" + cedula
				+ ", univeridad=" + univeridad + ", experiencia=" + experiencia + ", especialidad=" + especialidad
				+ ", consultorio=" + consultorio + ", costoConsulta=" + costoConsulta + "]\n";
	}
	

}
