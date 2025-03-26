package com.mx.Usuario.Service;

import java.util.List;

import com.mx.Usuario.Entity.Usuario;

public interface IUsuarioService {
	
	public List<Usuario> listar();
	
	public void guardar (Usuario usuario);
	
	public void eliminar (int idUsuario);
	
	public void editar (Usuario usuario);
	
	public Usuario buscar (int idUsuario); 

}
