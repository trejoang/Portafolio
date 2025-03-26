package com.mx.Usuario.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.Usuario.Entity.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	public List<Usuario> findBycostoId(int costoId);
	
	public List<Usuario> findByEventoId(int eventoId);

}
