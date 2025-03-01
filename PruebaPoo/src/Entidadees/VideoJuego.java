package Entidadees;

import Principal.Entregable;

public class VideoJuego implements Entregable{

	private String titulo;
	private int horasEstimaadas;
	private boolean entregado;
	private String genero;
	private String compañia;
	
	public VideoJuego() {
		
	}

	public VideoJuego(String titulo, int horasEstimaadas, boolean entregado, String genero, String compañia) {
		super();
		this.titulo = "";
		this.horasEstimaadas = 10;
		this.entregado = false;
		this.genero = "";
		this.compañia = "";
	}

	public VideoJuego(String titulo, int horasEstimaadas) {
		super();
		this.titulo = titulo;
		this.horasEstimaadas = horasEstimaadas;
		this.entregado = false;
		this.genero = "";
		this.compañia = "";
	}

	public VideoJuego(String titulo, int horasEstimaadas, String genero, String compañia) {
		super();
		this.titulo = titulo;
		this.horasEstimaadas = horasEstimaadas;
		this.genero = genero;
		this.compañia = compañia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimaadas() {
		return horasEstimaadas;
	}

	public void setHorasEstimaadas(int horasEstimaadas) {
		this.horasEstimaadas = horasEstimaadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
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
		
		if(key instanceof VideoJuego) {
			VideoJuego juego = (VideoJuego) key;
			return Integer.compare(this.horasEstimaadas, juego.getHorasEstimaadas());
		}
		return 0;
	}

	@Override
	public String toString() {
		return "VideoJuego [titulo=" + titulo + ", horasEstimaadas=" + horasEstimaadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compañia=" + compañia + "]\n";
	}
	
	

}
