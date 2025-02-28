package Entidades;

public abstract class Producto {
	
	protected int codigo; //key
	protected String categoria;
	protected String tamano;
	
	public Producto() {
		
	}

	public Producto(int codigo, String categoria, String tamano) {
		super();
		this.codigo = codigo;
		this.categoria = categoria;
		this.tamano = tamano;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", categoria=" + categoria + ", tamano=" + tamano + "]\n";
	}
	

}
