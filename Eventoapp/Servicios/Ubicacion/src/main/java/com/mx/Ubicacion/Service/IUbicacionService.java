package com.mx.Ubicacion.Service;

import java.util.List;

import com.mx.Ubicacion.Entity.Ubicacion;

public interface IUbicacionService {
	
	public List<Ubicacion> listar();
	public void guardar(Ubicacion ubicacion);
	public Ubicacion buscar(int ubicacionId);
	public void editar(Ubicacion ubicacion);
	public void eliminar(int ubicacionId);
	

}
