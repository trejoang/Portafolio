package com.mx.Ubicacion.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.Ubicacion.Entity.Ubicacion;

public interface IUbicacionRepository extends JpaRepository<Ubicacion, Integer>{
	
	public List<Ubicacion> findByEventoId(int eventoId);

}
