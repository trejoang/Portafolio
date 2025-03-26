package com.mx.Ubicacion.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mx.Ubicacion.Entity.Ubicacion;
import com.mx.Ubicacion.Repository.IUbicacionRepository;
@Service
public class UbicacionServiceImp implements IUbicacionService{
	
	@Autowired
	private IUbicacionRepository dao;

	@Override
	public List<Ubicacion> listar() {
		// TODO Auto-generated method stub
		return dao.findAll(Sort.by(Sort.Direction.ASC, "ubicacionId"));
	}

	@Override
	public void guardar(Ubicacion ubicacion) {
		// TODO Auto-generated method stub
		dao.save(ubicacion);
	}

	@Override
	public Ubicacion buscar(int ubicacionId) {
		// TODO Auto-generated method stub
		return dao.findById(ubicacionId).orElse(null);
	}

	@Override
	public void editar(Ubicacion ubicacion) {
		// TODO Auto-generated method stub
		dao.save(ubicacion);
	}

	@Override
	public void eliminar(int ubicacionId) {
		// TODO Auto-generated method stub
		dao.deleteById(ubicacionId);
	}
	
	//metodo para buscar por evento
	public List<Ubicacion> buscarPorEvento(int eventoId){
		return dao.findByEventoId(eventoId);
		
	}
}
