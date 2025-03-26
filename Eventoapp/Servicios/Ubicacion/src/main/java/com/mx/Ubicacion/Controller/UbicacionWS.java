package com.mx.Ubicacion.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Ubicacion.Entity.Ubicacion;
import com.mx.Ubicacion.Service.UbicacionServiceImp;

@RestController
@RequestMapping(path = "/ub")
//@CrossOrigin
public class UbicacionWS {
	
	@Autowired
	private UbicacionServiceImp service;
	
	//url  http://localhost:8013/Ub
	
	@GetMapping
	public ResponseEntity<?> listar(){
		List<Ubicacion> ubi = service.listar();
		if(ubi.isEmpty()) {
			return ResponseEntity.ofNullable("No hay registros disponibles");
		}else {
			return ResponseEntity.ok(ubi);
		}
	}
	
	//Guardar
		@PostMapping
		public ResponseEntity<?> guardar(@RequestBody Ubicacion ubicacion){
			Ubicacion ubi = service.buscar(ubicacion.getUbicacionId());
			if(ubi == null) {
				service.guardar(ubicacion);
				return ResponseEntity.ok("El registro de ubicacion se guardo con exito");
			}else {
				return ResponseEntity.status(HttpStatus.FOUND).body("Este Registro ya Existe");
			}
		}
	
	//buscar
	@GetMapping (value ="/{ubicacionId}")
	public ResponseEntity<?> buscawr (@PathVariable int ubicacionId){
		Ubicacion encontrada = service.buscar(ubicacionId);
		if(encontrada != null) {
			return ResponseEntity.ok(encontrada);
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ese id no se encuentra en la base de datos");
		}
	}
	
	//eliminar
	@DeleteMapping(path ="/{ubicacionId}")
	public ResponseEntity<?> eliminar (@PathVariable int ubicacionId){
		Ubicacion ubi= service.buscar(ubicacionId);
		if( ubi !=null) {
			service.eliminar(ubicacionId);
			return ResponseEntity.ok("Se elimino con esxito");
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Operacion imposible no existe");
		}
	}
	
	//busca por evento
	@GetMapping(path ="buscarPorEvento/{eventoId}")
	public ResponseEntity<?> buscarPorEvento(@PathVariable ("eventoId")int eventoId){
		List<Ubicacion> ubi = service.buscarPorEvento(eventoId);
		return ResponseEntity.ok(ubi);
	}

}
