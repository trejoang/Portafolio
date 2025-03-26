package com.mx.Usuario.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data // agregar @Data despues de colocar las variables
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario;
	private String tipoUsuario;
	private String nombre;
	private int contrasena;
	private String fechaCreacion;
	private int costoId;
	private int eventoId;

}
