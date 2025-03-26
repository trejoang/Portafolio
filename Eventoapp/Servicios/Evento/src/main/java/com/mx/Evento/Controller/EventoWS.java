package com.mx.Evento.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Evento.Entidades.Costo;
import com.mx.Evento.Entidades.Ubicacion;
import com.mx.Evento.Entity.Evento;
import com.mx.Evento.Service.EventoServiceImp;

@RestController
@RequestMapping(path ="/E")
//@CrossOrigin
public class EventoWS {
	
	@Autowired
	private EventoServiceImp service;
	
	//url  http://localhost:8010/E
	
	@GetMapping
	public ResponseEntity<?> listar(){
		List<Evento> eventos = service.listar();
		if(eventos.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No existen registros en esta bd");
		}else {
			return ResponseEntity.ok(eventos);
		}
	}
	//guardar   http://localhost:8010/E/guardar
	@PostMapping
	public ResponseEntity<?> guardar(@RequestBody Evento evento){
	    try {
	    	Evento encontrado = service.buscar(evento.getIdEvento());
	    	if(encontrado == null) {
	    		service.guardar(evento);
	    		return ResponseEntity.ok("se registro exitosamente");
	    	}else {
	    		return ResponseEntity.status(HttpStatus.FOUND).body("este registro ya existe");
	    	}
	    }catch(IllegalArgumentException e) {
	    	return ResponseEntity.status(HttpStatus.CONFLICT).build();
	    }
	}
	
	
	//buscar  http://localhost:8010/Ebuscar
	@GetMapping(path ="/{idEvento}")
	public ResponseEntity<?> buscar(@PathVariable ("idEvento") int idEvento){
		Evento encontrado = service.buscar(idEvento);
		if(encontrado != null) {
			return ResponseEntity.ok(encontrado);
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("no se encontro registro con ese id");
		}
	}
	
	//eliminar   http://localhost:8010/E/eliminar
	@DeleteMapping(path = "/{idEvento}")
	public ResponseEntity<?> eliminar(@PathVariable int idEvento){
		Evento encontrado = service.buscar(idEvento);
		if(encontrado != null) {
			service.eliminar(idEvento);
			return ResponseEntity.ok("el registro fue eliminado con exito");
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("este registro no se puede eliminar xq no existe");
		}
	}
	
	//editar
	@PutMapping(path = "/{idEvento}")
    public ResponseEntity<?> editar(@PathVariable("idEvento") int idEvento, @RequestBody Evento evento) {
        Evento encontrado = service.buscar(idEvento);
        if(encontrado != null) {
            // Actualizamos el evento con los nuevos datos
            evento.setIdEvento(idEvento);  // Aseguramos que el ID no cambie
            service.editar(evento);
            return ResponseEntity.ok("El registro fue actualizado con éxito");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontró el registro para editar");
        }
    }
	
	// metodos que consumen microservicios
	//COSTOS
	// URL del metodo http://localhost:8010/E/Costo/eventoId
    @GetMapping("/Costo/{eventoId}")
    public ResponseEntity<?> mostrarCostosPorEvento(@PathVariable int eventoId){
    	try {
    		//primero buscaremos si existe el evento por id
    		Evento aux = service.buscar(eventoId);
    		if(aux == null) {
    			return ResponseEntity.badRequest().body("No exixten eventos con ese ID");
    		}else {
    			//genera si existe entonces valida los costos
    			List<Costo> costos = service.obtenerCostos(eventoId);
    			if(costos.isEmpty()) {
    				return ResponseEntity.ofNullable("El evento es de entrada Gratuita");
    			}else {
    				return ResponseEntity.ok(costos);
    			}
    		}
    	}catch(Exception e) {
    		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrio un error el servicio no esta disponible"+ e.getMessage());
    	}
    }
    
    //endpoint de ubicaciones
    
    @GetMapping("/Ubicacion/{eventoId}")
    public ResponseEntity<?> ubicaciones(@PathVariable int eventoId){
    	try {
    		//validamos
    		Evento aux = service.buscar(eventoId);
    		if(aux == null) {
    			return ResponseEntity.badRequest().body("No existen eventos registrados");
    		}else {
    			List<Ubicacion> ubi = service.obtenerUbicacion(eventoId);
    			if(ubi.isEmpty()) {
    				return ResponseEntity.ofNullable("Ubicacion no especificada");
    			}else {
    				return ResponseEntity.ok(ubi);
    			}
    		}
    	}catch(Exception e){
    		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error, Servicio no disponible" + e.getMessage());
    	}
    }
    
    //endpoint para listar todo
    @GetMapping("/todo/{eventoId}")
    public ResponseEntity<?> listarTodo(@PathVariable int eventoId){
    	Map<String, Object> resultado = service.getEventoAndModulos(eventoId);
    	return ResponseEntity.ok(resultado);
    }
    
}
