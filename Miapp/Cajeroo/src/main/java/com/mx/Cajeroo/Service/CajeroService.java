package com.mx.Cajeroo.Service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.Cajeroo.Dao.CajeroDao;
import com.mx.Cajeroo.Modelo.Cajero;

import jakarta.transaction.Transactional;


@Service
public class CajeroService {

    @Autowired
    private CajeroDao Dao;
    

    @Transactional
    public Map<String, Integer> calcularRetiro(double monto) {
        // Crear un mapa para guardar el resultado (denominaciones y cantidades)
        Map<String, Integer> resultado = new HashMap<>();

        // Recuperar todas las denominaciones de la base de datos
        List<Cajero> cajeros = (List<Cajero>) Dao.findAll();

        // Calcular el total de efectivo disponible en el cajero
        double totalDisponible = 0;
        for (Cajero cajero : cajeros) {
            totalDisponible += cajero.getDenominacion() * cajero.getCantidad();
        }

        // Verificar si el monto solicitado excede el total disponible
        if (monto > totalDisponible) {
            throw new RuntimeException("La cantida excede el total disponible en el cajero.");
        }

        // Comenzamos con la cantidad solicitada
        double montoRestante = monto;

        // Ordenar las denominaciones de mayor a menor (para que los billetes grandes se procesen primero)
        cajeros.sort((c1, c2) -> Double.compare(c2.getDenominacion(), c1.getDenominacion()));

        // Iteramos sobre las denominaciones de mayor a menor
        for (Cajero cajero : cajeros) {
        	double denominacion = cajero.getDenominacion();
            int cantidadDisponible = cajero.getCantidad();

            // Asegurarse de que no intentemos dividir por cero
            if (denominacion > 0 && montoRestante >= denominacion) {
                // Calcular cuántos billetes o monedas de esta denominación se pueden entregar
                int cantidadParaEntregar = (int)Math.min(montoRestante / denominacion, cantidadDisponible);

                // Actualizar el monto restante
                montoRestante -= cantidadParaEntregar * denominacion;

                // Almacenar la cantidad de esta denominación
                if (cantidadParaEntregar > 0) {
                    resultado.put(cajero.getTipo() + " de " + denominacion+"  ", cantidadParaEntregar);
                    
                    int nuevaCantidad = cajero.getCantidad() - cantidadParaEntregar;
                    cajero.setCantidad(nuevaCantidad);
                    Dao.save(cajero); // Guardar el nuevo valor en la base de datos
                    
                }
            }

            // Si el monto ya se ha cubierto, rompemos el ciclo
            if (montoRestante == 0) {
                break;
            }
        }

        // Si no se pudo cubrir el monto con billetes, verificar las monedas
        if (montoRestante > 0) {
            // Si el monto restante es menor que el valor de las monedas disponibles, se puede usar
            for (Cajero cajero : cajeros) {
                if (cajero.getDenominacion() <= montoRestante) {
                	double denominacion = cajero.getDenominacion();
                    int cantidadDisponible = cajero.getCantidad();

                    // Calcular cuántas monedas de esta denominación se pueden entregar
                    int cantidadParaEntregar = (int)Math.min(montoRestante / denominacion, cantidadDisponible);
                    montoRestante -= cantidadParaEntregar * denominacion;

                    // Almacenar la cantidad de esta denominación de monedas
                    if (cantidadParaEntregar > 0) {
                        resultado.put(cajero.getTipo() + " de " + denominacion, cantidadParaEntregar);
                        
                        int nuevaCantidad = cajero.getCantidad() - cantidadParaEntregar;
                        cajero.setCantidad(nuevaCantidad);
                        Dao.save(cajero); // Guardar el nuevo valor en la base de datos
                        
                    }
                }

                // Si el monto restante es 0, ya hemos cubierto todo
                if (montoRestante == 0) {
                    break;
                }
            }
        }

        // Si no se pudo cubrir el monto, devolvemos un error
        if (montoRestante > 0) {
            throw new RuntimeException("No se puede entregar la cantidad solicitada.");
        }

        return resultado;
       
    }
}
