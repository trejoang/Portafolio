package com.mx.Costo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mx.Costo.Entidades.Usuario;
import com.mx.Costo.Entity.Costo;
import com.mx.Costo.Repository.ICostoRepository;
@Service
public class CostoServiceImp implements ICostoService{
	
	@Autowired
	private ICostoRepository dao;

	@Override
	public List<Costo> listar() {
		// TODO Auto-generated method stub
		return dao.findAll(Sort.by(Sort.Direction.ASC, "idCosto"));
	}

	@Override
	public void guardar(Costo costo) {
		// TODO Auto-generated method stub
		dao.save(costo);
	}

	@Override
	public void eliminar(int idCosto) {
		// TODO Auto-generated method stub
		dao.deleteById(idCosto);
	}

	@Override
	public void editar(Costo costo) {
		// TODO Auto-generated method stub
		dao.save(costo);
	}

	@Override
	public Costo buscar(int idCosto) {
		// TODO Auto-generated method stub
		return dao.findById(idCosto).orElse(null);
	}
	
	//buscar por evento
	public List<Costo> buscarPorEvento(int eventoId){
		return dao.findByEventoId(eventoId);
	}
	
	//metodos para cponsumir microservicios
	
		//metodo para el microservico de Costo usando RestTemplate
	
	@Autowired
	private RestTemplate restTemplate;
	
	public List<Usuario> obtenerUsuarios(int costoId){
		
		@SuppressWarnings("unchecked")
		List<Usuario> usuarios = restTemplate.getForObject("http://localhost:8012/U/buscarPorCosto/" + costoId, List.class);
		return usuarios;
	}
	

}
