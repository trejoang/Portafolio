package Entidades;

public abstract class Transporte {
	
	protected String compania;
	protected int capacida;
	protected String residencia;
	

	public abstract void iniciarRuta();
	
	public Transporte () {
		
	}

	public Transporte(String compania, int capacida, String residencia) {
		super();
		this.compania = compania;
		this.capacida = capacida;
		this.residencia = residencia;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public int getCapacida() {
		return capacida;
	}

	public void setCapacida(int capacida) {
		this.capacida = capacida;
	}

	public String getResidencia() {
		return residencia;
	}

	public void setResidencia(String residencia) {
		this.residencia = residencia;
	}

	@Override
	public String toString() {
		return "Transporte [compania=" + compania + ", capacida=" + capacida + ", residencia=" + residencia + "]";
	}
	

}
