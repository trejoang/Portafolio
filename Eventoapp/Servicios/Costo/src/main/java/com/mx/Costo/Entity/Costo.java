package com.mx.Costo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
//las tablas h2 se refieren a la bd h2 que es una bd en memoria y ligera
//se utiliza porque permite trabajar con bd de una instalacion, facilita la configuracion y puebas
//en su mayoria se usa para pruebas y verificar el funcionamiento del microservicio
@Entity
@Table
@Data
public class Costo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//sirve para generar el id de un autoincremento
	private int idCosto;
	private int costoEntrada;
	private String categoria;
	private int eventoId;

}
