package com.mx.Evento.OpenFeingClient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mx.Evento.Entidades.Ubicacion;

//esta anotacion feingClient es la conexion con un microservicioRESTfull para ello se utiliza el 
//nombre del MS, la url y path
//con esta anotacion estoy espesificando el microservicio que voy a consumir

@FeignClient(name ="Ubicacion", url = "http://localhost:8013", path ="/ub" )
public interface IUbicacionFeingClient {
	
	//quiero especificar cual es el metodo que va a consumir de ese microservicio
	@GetMapping(path ="buscarPorEvento/{eventoId}")
	public List<Ubicacion> buscarPorEvento(@PathVariable ("eventoId")int eventoId);

}
