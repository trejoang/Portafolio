package com.mx.Costo.Entidades;

import lombok.Data;

@Data
public class Usuario {
	
	private int idUsuario;
	private String tipoUsuario;
	private String nombre;
	private int contrasena;
	private String fechaCreacion;
	private int costoId;

}
