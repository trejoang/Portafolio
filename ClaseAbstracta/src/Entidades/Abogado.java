package Entidades;

public class Abogado extends Profesionista{
	
	//declarar atributos
	private String tipo;
	private String despacho;
	private double honorarios;

	@Override
	public void trabajar() {
		
		System.out.println("Trabajo todo el dia");
		
	}
	
	public Abogado() {
		
	}

	public Abogado(String nomre, String apellido, int edad, int cedula, String univeridad, int experiencia, String tipo,
			String despacho, double honorarios) {
		super(nomre, apellido, edad, cedula, univeridad, experiencia);
		this.tipo = tipo;
		this.despacho = despacho;
		this.honorarios = honorarios;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDespacho() {
		return despacho;
	}

	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	public double getHonorarios() {
		return honorarios;
	}

	public void setHonorarios(double honorarios) {
		this.honorarios = honorarios;
	}

	@Override
	public String toString() {
		return "Abogado [nomre=" + nomre + ", apellido=" + apellido + ", edad=" + edad + ", cedula=" + cedula
				+ ", univeridad=" + univeridad + ", experiencia=" + experiencia + ", tipo=" + tipo + ", despacho="
				+ despacho + ", honorarios=" + honorarios + "]\n";
	}
	

}
