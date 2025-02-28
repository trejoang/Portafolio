package com.mx.Botellas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Implementacion implements IMetodos{
	
	HashMap<Integer, Botellas> hash = new HashMap<Integer, Botellas>();

	@Override
	public void guardar(Botellas botellas) {
		hash.put(botellas.getId(), botellas);
		
		
	}

	@Override
	public Botellas buscar(Botellas botellas) {
		
		return hash.get(botellas.getId());
	}

	@Override
	public void editar(Botellas botellas) {
		
		hash.replace(botellas.getId(), botellas);
		
	}

	@Override
	public void eliminar(Botellas botellas) {
		
		hash.remove(botellas.getId());
		
	}

	@Override
	public void mostrar() {
		
		System.out.println(hash);
		
	}
	
	public void contar() {
		System.out.println("el HashMap contiene: " + hash.size() + " Botellas");
	}

	@Override
	public void mostrama() {
		
		List<Botellas> lb = new ArrayList<>(hash.values());
		
		Collections.sort(lb,Comparator.comparing(Botellas::getMarca));
		System.out.println("Botellas ordenadas por marca");
		for(Botellas botella : lb) {
			System.out.println(botella);
		}
	}

	@Override
	public void mostrapre() {
     
		List<Botellas> lbp = new ArrayList<>(hash.values());
		
		Collections.sort(lbp,Comparator.comparing(Botellas::getPrecio));
		System.out.println("Botellas ordenadas por precio");
		for(Botellas botella : lbp) {
			System.out.println(botella);
		}
		//Collections.sort(Comparator.comparing(Botellas::getPrecio));
		//System.out.println(hash);
		
	}

}
