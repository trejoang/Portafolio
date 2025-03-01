package Entidadees;

import Principal.Entregable;

public class Serie implements Entregable{
	
	private String titulo;
	private int nuTemporadas ;
	private boolean entregado;
	private String genero;
	private String creador;
	
	
	public Serie() {
		
	}
	

	public Serie(String titulo, int nuTemporadas, boolean entregado, String genero, String creador) {
		super();
		this.titulo = "";
		this.nuTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}


	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.nuTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = creador;
	}

	public Serie(String titulo, int nuTemporadas, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.nuTemporadas = nuTemporadas;
		this.entregado=false;
		this.genero = genero;
		this.creador = creador;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getNuTemporadas() {
		return nuTemporadas;
	}


	public void setNuTemporadas(int nuTemporadas) {
		this.nuTemporadas = nuTemporadas;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getCreador() {
		return creador;
	}


	public void setCreador(String creador) {
		this.creador = creador;
	}


	@Override
	public void entregar() {
		
		this.entregado=true;
		
	}


	@Override
	public void devolver() {
		
		this.entregado=false;
		
	}


	@Override
	public boolean isEntregado() {
		
		return entregado;
	}


	@Override
	public int comparateTo(Object key) {
		
		if(key instanceof Serie) {
			Serie serie = (Serie) key;
			return Integer.compare(this.nuTemporadas, serie.getNuTemporadas());
		}
		
		return 0;
	}


	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", nuTemporadas=" + nuTemporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]\n";
	}
	
	
	

}
