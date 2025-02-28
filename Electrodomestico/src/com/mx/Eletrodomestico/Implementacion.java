package com.mx.Eletrodomestico;

import java.util.HashMap;

public class Implementacion implements IMetodos{

	/* la sintaxis de hashMap: 
	 *HashMap(clave, valor) hash = new HashMap<clave, valor>();
	 *HashMap -> es una libreria de java.util
	 *KeyDataType -> clase contenedora del dato primitivo de nuestra clase
	 *valueDataType ->el nombre de la clase
	 *nombre ->el nombre es asignado por el programador
	 *new -> palabra reservada para invocar al constructor y lo llama por defecto
	 */
	//declaracion HashMap
	HashMap<Integer, Electrodomestico> hash = new HashMap<Integer, Electrodomestico>();
	
	@Override
	public void guardar(Electrodomestico electrodomestico) {
		
		hash.put(electrodomestico.getClave(), electrodomestico);
	}

	@Override
	public Electrodomestico buscar(Electrodomestico electrodomestico) {
		
		
		return hash.get(electrodomestico.getClave());
	}

	@Override
	public void editar(Electrodomestico electrodomestico) {
		//al agregar un objecto con clave existente en el Hash este sera remplazado
		hash.replace(electrodomestico.getClave(), electrodomestico);
		
	}

	@Override
	public void eliminar(Electrodomestico electrodomestico) {
		
		hash.remove(electrodomestico.getClave());
		
	}

	@Override
	public void mostrar() {
		
		System.out.println(hash);
		
	}
	
	public void contar() {
		System.out.println("el HashMap contiene: " + hash.size() + " electrodomesticos");
	}
	
	

}
