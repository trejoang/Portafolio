package com.mx.Eletrodomestico;

public interface IMetodos {
	
	public void guardar(Electrodomestico electrodomestico);
	public Electrodomestico buscar(Electrodomestico electrodomestico);
	public void editar(Electrodomestico electrodomestico);
	public void eliminar(Electrodomestico electrodomestico);
	public void mostrar();

}
