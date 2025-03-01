package Libro;

import java.util.ArrayList;
import java.util.List;

public class Implementacion implements IMetodos {
	//declacaramos una lista
		List<Libro> lista = new ArrayList<Libro>();

		@Override
		public void guardar(Libro libro) {
			
			lista.add(libro);
		}

		@Override
		public void editar(int indice, Libro libro) {
			lista.set(indice, libro);
			
		}

		@Override
		public void mostar() {
			System.out.println(lista);
			
		}

		@Override
		public void eliminar(int indice) {
			lista.remove(indice);
			
		}

		@Override
		public Libro buscar(int indice) {
			
			return lista.get(indice);
		}
		
		//metodo perzonalizado
		public void contar() {
			int cont = lista.size();
			 System.out.println("La lista contiene: " + cont + " libros");
		} 
		 
		
		

	}
