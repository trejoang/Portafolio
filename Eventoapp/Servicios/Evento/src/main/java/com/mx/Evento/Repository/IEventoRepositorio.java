package com.mx.Evento.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.Evento.Entity.Evento;

@Repository
public interface IEventoRepositorio extends JpaRepository<Evento, Integer>{

}
