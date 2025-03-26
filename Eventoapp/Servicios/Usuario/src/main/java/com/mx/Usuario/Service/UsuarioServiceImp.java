package com.mx.Usuario.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mx.Usuario.Entity.Usuario;
import com.mx.Usuario.Repository.IUsuarioRepository;
@Service  // no olvidar la notacion 
public class UsuarioServiceImp implements IUsuarioService{
	
	@Autowired
	private IUsuarioRepository dao;

	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return dao.findAll(Sort.by(Sort.Direction.ASC, "idUsuario"));
	}

	@Override
	public void guardar(Usuario usuario) {
		// TODO Auto-generated method stub
		dao.save(usuario);
	}

	@Override
	public void eliminar(int idUsuario) {
		// TODO Auto-generated method stub
		dao.deleteById(idUsuario);
	}

	@Override
	public void editar(Usuario usuario) {
		// TODO Auto-generated method stub
		dao.save(usuario);
	}

	@Override
	public Usuario buscar(int idUsuario) {
		// TODO Auto-generated method stub
		return dao.findById(idUsuario).orElse(null);
	}
	
	//buscar por costo
	public List<Usuario> buscarPorCosto(int costoId){
		return dao.findBycostoId(costoId);
	}
	
	//metodo para buscar por evento
		public List<Usuario> buscarPorEvento(int eventoId){
			return dao.findByEventoId(eventoId);
			
		}

}
