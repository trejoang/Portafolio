package Implementacion;

import java.util.HashMap;

import Principal.IMeto;

public class Implementa implements IMeto{
	
	protected HashMap<Object, Object> hash = new HashMap<Object, Object>();

	@Override
	public void guardar(Object key, Object value) {
		
		hash.put(key, value);
		
	}

	@Override
	public void editar(Object key, Object value) {
		
		hash.replace(key, value);
		
	}

	@Override
	public void eliminar(Object key) {
		
		hash.remove(key);
		
	}

	@Override
	public Object buscar(Object key) {
		if(hash.containsKey(key)) {
			return hash.get(key);
		}else {
			return null;
		}
	}
	@Override
	public void mostrar() {
		System.out.println(hash);
		
	}

}
