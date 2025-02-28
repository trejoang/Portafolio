package com.mx.Coche;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		//instanciar a nuestro objecto: Mando a llamar a mi clase y le agregoun valor espesifico usando 
		//el constructor parametrizado
		Coche coche1 = new Coche("Toyota", "Corolla", 2020, "Rojo", "Automatico", 255589.70);
		Coche coche2 = new Coche("Chevrolet", "Cabalier", 2022, "Azul", "estandar", 30673.70);
		Coche coche3 = new Coche("Cupra", "Leon", 2024, "Negro", "Estandar", 700000);
		Coche coche4 = new Coche("Ford", "Explorer", 2024, "azul", "automatico", 302452.50);
		Coche coche5 = new Coche("tsuru", "ford",2018, "blanco","Estandar", 56321.70);
		Coche coche6= new Coche ("Chevrolet","Aveo", 2023, "Negro", "Estandar", 555589.70);
		Coche coche7 = new Coche("Honda",  "Civic", 2004, "Plata", "Automático", 40000.00);
		
		//objetoauxiliar: Para poder asignarle despues un valor de busqueda
		//se declara en nulo, para despues poder asignarle el valor que se requiera
		
		Coche auxCoche = null;
		
		//Creacion de una lista
		//Es una estructura de datos que permite almacenar elementos (objectos) de manera ordenada
		//Se utiliza la libreria java.util. que nos ofrece la interfaz de list
		//List proporciona los metodos: añadir, eliminar, modificar y visualizar elementos dentro de la lista
		//new AraList<> es una implementacion concreta de la interfaz List que realiza un arreglo dinamico para almacenar informacion 
		List<Coche> lista = new ArrayList<Coche>();
		//agregar elementos a la lista
		//usa el metodo ad
		lista.add(coche1);
		lista.add(coche2);
		lista.add(coche3);
		lista.add(coche4);
		lista.add(coche5);
		lista.add(coche6);
		lista.add(coche7);
		//visualizar la informacion de la lista
		//usamos el metodo de inpresion
		System.out.println(lista);
		
		//metodo para buscar un elemento espesifico en la lista
		auxCoche = lista.get(1);
		System.out.println("elemento encontrado: " + auxCoche);
		
		//editando un elemento
		auxCoche = lista.get(3);
		auxCoche.setColor("Dorado");
		auxCoche.setMarca("honda");
		
		//eliminar un elemento
		auxCoche = lista.get(6);
		lista.remove(6);
		System.out.println("lista actualizada: " + lista);
		
		//contando el tamaño de la lista
		System.out.println("existen: " + lista.size() +  " coches en la lista");
		//eliminar toda la lista
		lista.clear();
		
		//validar si la lista esta vacia
		if(lista.isEmpty()) {
			System.out.println("la lista esta vacia");
		}else{
			System.out.println("la lista es: \n" + lista);
		}
		
		//van a realizar la practica,replicando el ejercicio que se vio en clase
		//van a crear un nuevo proyecto.
		//el nuevo paquete
		//una nueva clase(elijan la entidad que ustedes deseen)
		//usen todos los metodos necesarios para construir la clase
		//y en la principal, van a generar por lo menos 5 instancias y las pruebas necesarias para 
		//el uso de las listas

	}

}
