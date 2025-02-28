package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Principal.IMetodos;

public class ImplementacionGenerica implements IMetodos {
	
	//protected
	//protected List<Object, Object> list = new ArrayList<Object, Object>();
	protected List<Object[]> list = new ArrayList<Object[]>();

	@Override
	public void guardar(Object key, Object value) {
		
		list.add(new Object[] {key, value});
		
	}

	@Override
	public void editar(Object key, Object value) {
		
		for(Object []par : list) {
			if(par[0].equals(key)) {
				par[1] = value;
				return;
			}
		}
		
	}

	@Override
	public void eliminar(Object key) {

		list.removeIf(par -> par[0].equals(key));
		
	}

	@Override
	public Object buscar(Object key) {
		
		for(Object []par : list) {
			if(par[0].equals(key)) {
				return par[1];
				
			}
		}
		return null;
	}

	@Override
	public void mostrar() {
		for(Object []par : list) {
			System.out.println("Clave: " + par[0] + " valor " + par[1]);
		}
		
	}

}
