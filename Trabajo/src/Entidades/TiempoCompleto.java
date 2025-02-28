package Entidades;

public class TiempoCompleto extends Empleado{
	
	private String turno;
	private int descanso;
	
	public TiempoCompleto() {
		
	}
	public TiempoCompleto(String nombre, String trabajo, double costo, int horas, String turno, int descanso) {
		super(nombre, trabajo, costo, horas);
		this.turno = turno;
		this.descanso = descanso;
	}



	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public int getDescanso() {
		return descanso;
	}

	public void setDescanso(int descanso) {
		this.descanso = descanso;
	}

	@Override
	public String toString() {
		return "TiempoCompleto [nombre=" + nombre + ", trabajo=" + trabajo + ", costo=" + costo + ", horas=" + horas
				+ ", turno=" + turno + ", descanso=" + descanso + "]";
	}

	
	

}
