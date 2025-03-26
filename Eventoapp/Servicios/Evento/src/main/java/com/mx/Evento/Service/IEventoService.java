package com.mx.Evento.Service;

import java.util.List;

import com.mx.Evento.Entity.Evento;

public interface IEventoService {
	
	public List<Evento> listar();
	public void guardar(Evento evento);
	public Evento buscar(int idEvento);
	public void editar(Evento evento);
	public void eliminar(int idEvento);
	

}
