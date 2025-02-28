package Entidades;

public class Autobus extends Transporte {
	
	protected String color;
	protected String ruta;
	
	public void iniciarRuta() {
		System.out.println("Horario de 4:30am a 11:00pm");
	}
	public Autobus() {
		
	}
	public Autobus(String compania, int capacida, String residencia, String color, String ruta) {
		super(compania, capacida, residencia);
		this.color = color;
		this.ruta = ruta;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getRuta() {
		return ruta;
	}
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	@Override
	public String toString() {
		return "Autobus [compania=" + compania + ", capacida=" + capacida + ", residencia=" + residencia + ", color="
				+ color + ", ruta=" + ruta + "]";
	}
	

}
