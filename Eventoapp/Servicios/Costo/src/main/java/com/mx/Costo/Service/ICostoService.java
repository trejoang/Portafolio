package com.mx.Costo.Service;

import java.util.List;

import com.mx.Costo.Entity.Costo;

public interface ICostoService {
	
	public List<Costo> listar();
	
	public void guardar(Costo costo);
	
	public void eliminar(int idCosto);
	
	public void editar(Costo costo);
	
	public Costo buscar(int idCosto);
	
	

}
