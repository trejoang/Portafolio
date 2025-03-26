package com.mx.Costo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.Costo.Entity.Costo;

public interface ICostoRepository extends JpaRepository<Costo, Integer>{
	
	public List<Costo> findByEventoId(int eventoId);

}
