package Entidades;

public class Metro extends Transporte{
	
	protected String tamaño;
	protected String linea;
	
	public void iniciarRuta() {
		System.out.println("inicio de operaciones de 5:00am a las 00");
	}
	public Metro() {
	}
	public Metro(String compania, int capacida, String residencia, String tamaño, String linea) {
		super(compania, capacida, residencia);
		this.tamaño = tamaño;
		this.linea = linea;
	}
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	public String getLinea() {
		return linea;
	}
	public void setLinea(String linea) {
		this.linea = linea;
	}
	@Override
	public String toString() {
		return "Metro [compania=" + compania + ", capacida=" + capacida + ", residencia=" + residencia + ", tamaño="
				+ tamaño + ", linea=" + linea + "]";
	}
	

}
