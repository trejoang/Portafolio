package com.mx.Costo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Costo.Entidades.Usuario;
import com.mx.Costo.Entity.Costo;
import com.mx.Costo.Service.CostoServiceImp;

@RestController
@RequestMapping(path = "/C")
//@CrossOrigin
public class CostoWS {
	
	@Autowired
	private CostoServiceImp service;
	
	//url  http://localhost:8011/C
	
	//listar
	@GetMapping
	public ResponseEntity<?> listar(){
		List<Costo> costos = service.listar();
		if(costos.isEmpty()) {
			return ResponseEntity.ofNullable("no existen costos");
		}else {
			return ResponseEntity.ok(costos);
		}
	}
	
	//guardar
	@PostMapping
	public ResponseEntity<?> guardar (@RequestBody Costo costo){
		try {
			Costo encontrado = service.buscar(costo.getIdCosto());
			if(encontrado == null) {
				service.guardar(costo);
				return ResponseEntity.ok("registro guardado");
			}else {
				return ResponseEntity.status(HttpStatus.FOUND).body("el registro ya existe en la bd");
			}
		}catch(IllegalArgumentException e) {
			return ResponseEntity.status(HttpStatus.CONFLICT).build();
		}
	}
	
	//buscar
	@GetMapping(path ="{idCosto}")
	public ResponseEntity<?> buscar(@PathVariable("idCosto")int idCosto){
		Costo encontrado = service.buscar(idCosto);
		if(encontrado != null) {
			return ResponseEntity.ok(encontrado);
		}else {
			return ResponseEntity.ofNullable("el registro no se encuentra en la bd");
		}
	}
	
	//eliminar
	@DeleteMapping(path = "/{idCosto}")
	public ResponseEntity<?> eliminar(@PathVariable("idCosto")int idCosto){
		Costo costo = service.buscar(idCosto);
		if(costo != null) {
			service.eliminar(idCosto);
			return ResponseEntity.ok("registro eliminado con exito");
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("registro no existe");
		}
	}
	
	//editar
	@PutMapping
	public ResponseEntity<?> editar(@RequestBody Costo costo){
		try {
			Costo existente = service.buscar(costo.getIdCosto());
			
			if(existente == null) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("este costo no eixste en el sistema");
			}else {
				service.editar(costo);
				return ResponseEntity.ok("el registro se edito corretamente");
			}
		}catch(IllegalArgumentException e) {
			return ResponseEntity.status(HttpStatus.CONFLICT).build();
		}
	}
	
	//buscar por evento
	@GetMapping(path ="buscarPorEvento/{eventoId}")
	public ResponseEntity<?> buscarPorEvento(@PathVariable("eventoId")int eventoId){
		List<Costo> costos = service.buscarPorEvento(eventoId);
		return ResponseEntity.ok(costos);
	}
	
	// metodos que consumen microservicios
		//COSTOS
		// URL del metodo http://localhost:8011/C/Usuario/costoId
	
	@GetMapping("/Usuario/{costoId}")
	public ResponseEntity<?> mostratUsuariosPorCosto(@PathVariable int costoId){
		try {
			Costo aux = service.buscar(costoId);
			if(aux == null) {
				return ResponseEntity.badRequest().body("No existen usuarios con ese ID");
			}else {
				List<Usuario> usuarios = service.obtenerUsuarios(costoId);
				if(usuarios.isEmpty()) {
					return ResponseEntity.ofNullable("el evento de momento no cuenta con usuarios");
				}else {
					return ResponseEntity.ok(usuarios);
				}
			}
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrio un error, el servicio no esta disponible"+ e.getMessage());
		}
	}

}
