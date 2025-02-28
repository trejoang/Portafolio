package Entidades;

public abstract class Empleado {
	
	protected String nombre;
	protected String trabajo;
	protected double costo;
	protected int horas;
	
    public void calcularSalario(String nombre, double salario) {
		System.out.println("El empleado: " + nombre + " Gana: " + horas*costo);
	     }
        
       public Empleado() {
    	   
       }

	

	public Empleado(String nombre, String trabajo, double costo, int horas) {
		super();
		this.nombre = nombre;
		this.trabajo = trabajo;
		this.costo = costo;
		this.horas = horas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	public double getSalario() {
		return costo;
	}

	public void setSalario(double costo) {
		this.costo = costo;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", trabajo=" + trabajo + ", costo=" + costo + ", horas=" + horas
				+ "]";
	}

	
       



}
