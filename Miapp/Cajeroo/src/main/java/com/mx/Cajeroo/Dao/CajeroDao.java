package com.mx.Cajeroo.Dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mx.Cajeroo.Modelo.Cajero;


@Repository
public interface CajeroDao extends CrudRepository<Cajero, Integer>{

}
