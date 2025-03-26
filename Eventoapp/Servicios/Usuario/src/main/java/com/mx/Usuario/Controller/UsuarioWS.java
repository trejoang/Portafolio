package com.mx.Usuario.Controller;

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

import com.mx.Usuario.Entity.Usuario;
import com.mx.Usuario.Service.UsuarioServiceImp;

@RestController
@RequestMapping(path = "/U")
//@CrossOrigin
public class UsuarioWS {
	
	@Autowired
	private UsuarioServiceImp service;
	
	
	//url  http://localhost:8012/U
	
	//listar
		@GetMapping
		public ResponseEntity<?> listar(){
			List<Usuario> usuarios = service.listar();
			if(usuarios.isEmpty()) {
				return ResponseEntity.ofNullable("no existen usuarios");
			}else {
				return ResponseEntity.ok(usuarios);
			}
		}
		
		//guardar
		@PostMapping
		public ResponseEntity<?> guardar (@RequestBody Usuario usuario){
			try {
				Usuario encontrado = service.buscar(usuario.getIdUsuario());
				if(encontrado == null) {
					service.guardar(usuario);
					return ResponseEntity.ok("Usuario guardado");
				}else {
					return ResponseEntity.status(HttpStatus.FOUND).body("el Usuario ya existe en la bd");
				}
			}catch(IllegalArgumentException e) {
				return ResponseEntity.status(HttpStatus.CONFLICT).build();
			}
		}
		
		//buscar
		@GetMapping(path ="{idUsuario}")
		public ResponseEntity<?> buscar(@PathVariable("idUsuario")int idUsuario){
			Usuario encontrado = service.buscar(idUsuario);
			if(encontrado != null) {
				return ResponseEntity.ok(encontrado);
			}else {
				return ResponseEntity.ofNullable("el usuario no se encuentra en la bd");
			}
		}
		
		//eliminar
		@DeleteMapping(path = "/{idUsuario}")
		public ResponseEntity<?> eliminar(@PathVariable("idUsuario")int idUsuario){
			Usuario costo = service.buscar(idUsuario);
			if(costo != null) {
				service.eliminar(idUsuario);
				return ResponseEntity.ok("usuario eliminado con exito");
			}else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("usuario no existente");
			}
		}
		
		//editar
		@PutMapping
		public ResponseEntity<?> editar(@RequestBody Usuario usuario){
			try {
				Usuario existente = service.buscar(usuario.getIdUsuario());
				
				if(existente == null) {
					return ResponseEntity.status(HttpStatus.NOT_FOUND).body("este Usuario no eixste en el sistema");
				}else {
					service.editar(usuario);
					return ResponseEntity.ok("el Usuario se edito corretamente");
				}
			}catch(IllegalArgumentException e) {
				return ResponseEntity.status(HttpStatus.CONFLICT).build();
			}
		}
		
		//buscar por evento
		@GetMapping(path ="/buscarPorCosto/{costoId}")
		public ResponseEntity<?> buscarPorCostto(@PathVariable("costoId")int costoId){
			List<Usuario> costos = service.buscarPorCosto(costoId);
			return ResponseEntity.ok(costos);
		}
		
		//busca por evento
		@GetMapping(path ="/buscarPorEvento/{eventoId}")
		public ResponseEntity<?> buscarPorEvento(@PathVariable ("eventoId")int eventoId){
			List<Usuario> ubi = service.buscarPorEvento(eventoId);
			return ResponseEntity.ok(ubi);
		}
		
}
