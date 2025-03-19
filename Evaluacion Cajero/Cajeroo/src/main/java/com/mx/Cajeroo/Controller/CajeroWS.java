package com.mx.Cajeroo.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Cajeroo.Service.CajeroService;


@RestController
@RequestMapping("/api/cajero")
@CrossOrigin 
public class CajeroWS {
	
	 @Autowired
	    private CajeroService cajeroService;

     // url  http://localhost:8003/api/cajero/retiro	 
	 
	 @PostMapping("/retiro")
	    public ResponseEntity<Map<String, ?>> retirar(@RequestBody Map<String, Integer> solicitud) {
	        int monto = solicitud.get("monto");
	        try {
	            // Caso exitoso: devolver Map<String, Integer>
	            Map<String, Integer> resultado = cajeroService.calcularRetiro(monto);
	            return ResponseEntity.ok(resultado);
	        } catch (RuntimeException e) {
	            // Caso de error: devolver Map<String, String>
	            Map<String, String> errorResponse = new HashMap<>();
	            errorResponse.put("error", e.getMessage());
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
	        }
	    }
	}



