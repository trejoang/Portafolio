package Tenis;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;


public class Implementacion implements IMetodos{
	
	List<Tenis> lista = new ArrayList<Tenis>();

	
	
	@Override
	public void guardar(Tenis tenis) {
		//lista.add(tenis);
		
		if (existeTenis(tenis.getModelo(), tenis.getColor())) {
            System.out.println("El modelo " + tenis.getModelo() + " con el color " + tenis.getColor() +" ya está registrado.");
        } 
		else {
            lista.add(tenis);
            System.out.println("Tenis agregado exitosamente: " + tenis.getModelo());
        }	
	}

	@Override
	public void editar(int indice, Tenis tenis) {
		
		lista.set(indice, tenis);
		
	}

	@Override
	public void mostra() {
		
		System.out.println(lista);
		
	}

	@Override
	public void eliminar(int indice) {
		
		lista.remove(indice);
		System.out.println("Tenis eliminado");
		
	}

	@Override
	public Tenis buscar(int indice) {
		
		return lista.get(indice);
	}
	
	//metodo perzonalizado contar
		public void contar() {
			int cont = lista.size();
			 System.out.println("La lista contiene: " + cont + " tenis \n");
		} 
	// busqueda alfabetica

		
		/*public void mostraalf() {
			lista.sort(Comparator.comparing(Tenis::getMarca));
			System.out.println(lista);
			
		}
	// busqueda alfabetica

		
		public void mostrape() {
			lista.sort(Comparator.comparing(Tenis::getPrecio));
			System.out.println(lista);
			
		}*/
		public boolean existeTenis(String modelo, String color) {
	        for (Tenis tenis : lista) {
	            if (tenis.getModelo().equalsIgnoreCase(modelo) && tenis.getColor().equalsIgnoreCase(color)) {
	                return true; // Ya existe un tenis con el mismo modelo
	            }
	        }
	        return false; // No existe
	    }
		

}
