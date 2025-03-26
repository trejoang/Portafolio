package com.mx.Evento.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mx.Evento.Entidades.Costo;
import com.mx.Evento.Entidades.Ubicacion;
import com.mx.Evento.Entidades.Usuario;
import com.mx.Evento.Entity.Evento;
import com.mx.Evento.OpenFeingClient.IUbicacionFeingClient;
import com.mx.Evento.OpenFeingClient.IUsuarioFeingClient;
import com.mx.Evento.Repository.IEventoRepositorio;

@Service
public class EventoServiceImp implements IEventoService{
	
	@Autowired
	private IEventoRepositorio dao;

	@Override
	public List<Evento> listar() {
		// TODO Auto-generated method stub
		return dao.findAll(Sort.by(Sort.Direction.ASC, "idEvento"));
	}

	@Override
	public void guardar(Evento evento) {
		dao.save(evento);
		
	}

	@Override
	public Evento buscar(int idEvento) {
		// TODO Auto-generated method stub
		return dao.findById(idEvento).orElse(null);
	}

	@Override
	public void editar(Evento evento) {
		// TODO Auto-generated method stub
		dao.save(evento);
	}

	@Override
	public void eliminar(int idEvento) {
		// TODO Auto-generated method stub
		dao.deleteById(idEvento);
	}
	
	//metodos para cponsumir microservicios
	
	//metodo para el microservico de Costo usando RestTemplate
	
	@Autowired
	private RestTemplate restTemplate;
	
	public List<Costo> obtenerCostos(int eventoId){
		
		@SuppressWarnings("unchecked")
		List<Costo> costos = restTemplate.getForObject("http://localhost:8011/C/buscarPorEvento/" + eventoId, List.class); // el List class es un complemento ya que no se sabe que tipo de elemento nos va enlistar
		return costos;
	}
	//metodo para listar ubicacion usando endpoint
	@Autowired
	private IUbicacionFeingClient ubiFC;
	
	public List<Ubicacion> obtenerUbicacion(int eventoId){
		List<Ubicacion> ubis = ubiFC.buscarPorEvento(eventoId);
		return ubis;
	}
	
	//metodo para listar los usuarios
	@Autowired
	private IUsuarioFeingClient usuFC;
	
	private List<Usuario> obtenerUsuarios(int eventoId){
		List<Usuario> usua = usuFC.buscarPorEvento(eventoId);
		return usua;
	}
	
	//metodo para listar toda la informacion sobre el evento
	
	public Map<String, Object> getEventoAndModulos(int eventoId){
		
		Map<String, Object> resultado = new HashMap<>();
		
		//consultar si existe el evento
		
		Evento evento = dao.findById(eventoId).orElse(null);
		if(evento == null) {
			resultado.put("Evento mensaje: ", "Este evento no existe");
		}else {
			resultado.put("Evento", evento);
			//consulta y validacion de Costo
			List<Costo> costos = obtenerCostos(eventoId);
			if(costos.isEmpty()) {
				resultado.put("Costo mensaje:", "La entrada es gratis");
			}else {
				resultado.put("Precios por entrada:", costos);
			}//cierre de costos
			
			//consulta y validacion de ubicacion
			
			List<Ubicacion> ubi = obtenerUbicacion(eventoId);
			if(ubi.isEmpty()) {
				resultado.put("Ubicacion Mensaje","El evento es en linea");
			}else {
				resultado.put("Ubicacion registrada", ubi);
			}//cierre validacion ubicacion
			
			List<Usuario> usu = obtenerUsuarios(eventoId);
				if(usu.isEmpty()) {
					resultado.put("Usuario mensaje", "No hay confirmaciones");
				}else {
					resultado.put("Usuario registrado", usu);
				}
			
		}//cierre de validacion eventos
		return resultado;
	}
	

}
