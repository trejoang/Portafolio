package com.mx.TiendaV;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		
		Juegos juego = new Juegos("guerrilla", "horizon", 012 , 700 , "nuevo" );
		Juegos juego1 = new Juegos("ubisot", "xdefiant", 4522 , 1550 , "nuevo" );
		Juegos juego2 = new Juegos("activision", "COD 3", 0532 , 400 , "usado" );
		Juegos juego3 = new Juegos("activision", "crash bandicoot", 242 , 650 , "usado" );
		Juegos juego4 = new Juegos("Santa monica", "God of War", 777 , 1599 , "nuevo" );
		Juegos juego5 = new Juegos("ubisot", "assassins creed", 222 , 400 , "usado" );
		
		Juegos auxJuego = null;
		
		List<Juegos> lista = new ArrayList<Juegos>();
		
		lista.add(juego);
		lista.add(juego1);
		lista.add(juego2);
		lista.add(juego3);
		lista.add(juego4);
		lista.add(juego5);
		/*
		//mostrar lista
		System.out.println(lista);
		
		//busca elemento
		auxJuego = lista.get(1);
		System.out.println("elemento encontrado: " + auxJuego);
		
		//modificar elemento
		auxJuego = lista.get(3);
		auxJuego.setPrecio(10.45);
		
		//eliminar elemento
		auxJuego = lista.get(5);
		lista.remove(5);
		
		//mostrar lista
		System.out.println("lista actualizada " + lista);
		
		//muestra la cantidad de elemntos
		System.out.println("existen: " + lista.size() +  " juegos en la lista");
		
		//eliminar lista
		  lista.clear();
		
		//validar si la lista esta vacia
		if(lista.isEmpty()) {
			System.out.println("la lista esta vacia");
		}else{
			System.out.println("la lista es: \n" + lista);
		}
		//lista alfabeticamente
		lista.sort(Comparator.comparing(Juegos::getEstudio));
		System.out.println("lista ordenada por estudio " + lista);
		
		lista.sort(Comparator.comparing(Juegos::getPrecio));
		System.out.println("lista ordenada por precio " + lista);*/
		
		//creacion de menu interativo para manipular la informacion de unestra lista
		Scanner scan = null; //se utiliza para leer la entrada de un usuario
		int menuPrincipal = 0, menuSecundario=0, indice=0;
		//los menus son variables que van a almacenar opciones
		//indice va a almacenar el indice de un objecto
		
		//variables locales
		String estudio, nombre, estado;
		int id;
		double precio;
		
		//inicio del menu interativo
		//usar ciclo dowhile: en java es una estructura que permite ejecutar un bloque de codigo almenos 
		//una vez y continua su ejecucion hasta cumplirla condicion
		
		do {
			System.out.println("--- M e n u ----");
			System.out.println("1.- agregar nuevo registro");
			System.out.println("2.- Mostrar la lista");
			System.out.println("3.- editar");
			System.out.println("4.- buscar elemento por atributo");
			System.out.println("5.- eliminar un elemento por atributo");
			System.out.println("6.- contar todos los elementos");
			System.out.println("7.- Eliminar todos los elementos");
			System.out.println("8.- salir del menu");
			System.out.println("***** elige una opccion valida ****");
			scan = new Scanner(System.in);
			menuPrincipal = scan.nextInt();
			
			//metodo switch o case: es una estructura de control de flujo que permite ejecutar diferentes
			//bloques de codigo basados en el valor de una expresion
			//tambien es conocido como un metodo case porque dentro de un switch se utilizan
			//varias opcciones case para manejar los diferentes casos de una posible expresion
			switch(menuPrincipal) {
			case 1: //REGISTRAR
				System.out.println("1.- agregar un nuevo registro");
				System.out.println("escribe el nombre del estudio del juego");
				scan = new Scanner(System.in);
				estudio = scan.nextLine();
				
				System.out.println("escribe el nombre del juego");
				scan = new Scanner(System.in);
				nombre = scan.nextLine();
				
				System.out.println("escribe el id del juego");
				scan = new Scanner(System.in);
				id = scan.nextInt();
				
				System.out.println("escribe el precio del juego");
				scan = new Scanner(System.in);
				precio = scan.nextDouble();
				
				System.out.println("escribe el estado del juego");
				scan = new Scanner(System.in);
				estado = scan.nextLine();
				
				//VALIDACION
				boolean exi = false;
				for (Juegos Juego : lista) {
					if(Juego.getNombre().equals(nombre)) {
						exi = true;
						break;
					}
				}
				if (exi) {
					System.out.println("El registro ya EXISTE");
				}else {
					//instaciar el objecto
					//Juegos es el contructor de la otra clase
					auxJuego = new Juegos(estudio, nombre, id, precio, estado);
					//guardar en la lista
					lista.add(auxJuego);
					System.out.println("El registro fue exitoso");
				}
				break; //rompe el case 1
				
			case 2: //MOSTRAR
				System.out.println("2.- Mostrar lista");
				System.out.println("La informacion almacenada es:\n " + lista);
				break;
				
			case 3:  //EDITAR
				System.out.println("3.- Editando un elemento");
				System.out.println("Ingresa el indice para editar");
				scan = new Scanner(System.in);
				indice = scan.nextInt();
				
				auxJuego = lista.get(indice);
				do {
					System.out.println("1.- Editar el estudio");
					System.out.println("2.- Editar el nombre");
					System.out.println("3.- Editar el id");
					System.out.println("4.- Editar el precio");
					System.out.println("5.- Editar el estado");
					System.out.println("6.- Regresar el menu principal");
					System.out.println("*** Elige una opccion para editar ***");
					
					scan = new Scanner(System.in);
					menuSecundario = scan.nextInt();
					
					switch(menuSecundario) {
					case 1:
						System.out.println("1.- Escribe el nuevo estudio");
						scan = new Scanner(System.in);
						estudio = scan.nextLine();
						auxJuego.setEstudio(estudio);
						lista.set(indice, auxJuego);
						System.out.println("Se edito coreectamente el estudio");
						break;
					case 2:
						System.out.println("2.- Escribe el nuevo nombre");
						scan = new Scanner(System.in);
						nombre = scan.nextLine();
						auxJuego.setNombre(nombre);
						lista.set(indice, auxJuego);
						System.out.println("Se edito coreectamente el nombre");
						break;
					case 3:
						System.out.println("3.- Escribe el nuevo id");
						scan = new Scanner(System.in);
						id = scan.nextInt();
						auxJuego.setId(id);
						lista.set(indice, auxJuego);
						System.out.println("Se edito coreectamente el id");
						break;
					case 4:
						System.out.println("4.- Escribe el nuevo precio");
						scan = new Scanner(System.in);
						precio = scan.nextDouble();
						auxJuego.setPrecio(precio);
						lista.set(indice, auxJuego);
						System.out.println("Se edito coreectamente el precio");
						break;
					case 5:
						System.out.println("5.- Escribe el nuevo estado");
						scan = new Scanner(System.in);
						estado = scan.nextLine();
						auxJuego.setEstado(estado);
						lista.set(indice, auxJuego);
						System.out.println("Se edito coreectamente el estado");
						break;
					case 6:
						System.out.println(" Regresando al menu PRINCIPAL... Regresa pronto ");
						break;
						default:
							System.out.println(" indice fuera del rango, escribe una opccion valida !! ");
							break;
					}
				}while(menuSecundario !=6); 
					break;
			case 4:   //BUSCAR
				System.out.println("4.- Buscar un elemento por atributo");
				System.out.println("Cual es el juego que deseas buscas?");
				scan = new Scanner(System.in);
				nombre = scan.nextLine();
				
				boolean exis = false;
				for(Juegos juegos : lista) {
					if(juegos.getNombre().equalsIgnoreCase(nombre)) {
						System.out.println("Elemento encontrado: " + juego);
						exis = true;
						break;
					}
				}
				if(!exis) {
					System.out.println("No se encontro el juego ");
				}
				break;
				/*auxJuego = lista.get(indice);
				System.out.println("Elemento encontrado " + auxJuego);*/
				
				
			case 5:   //ELIMINAR
				System.out.println("5.- Eliminando elementos");
				System.out.println("Que elemento deseas Eliminar");
				scan = new Scanner(System.in);
			    nombre = scan.nextLine();
				
			    boolean elimin = false;
			    for (Juegos Juego : lista) {
			    	if(Juego.getNombre().equalsIgnoreCase(nombre)) {
			    		lista.remove(Juego);
			    		System.out.println("Se elimino correctamente. Lista actualizada: " + lista);
			    		elimin = true;
			    		break;
			    	}
			    }
			    if (!elimin) {
			    	System.out.println("No se encontro un juego con ese nombre.");
			    }
			    
			    break;
			    //indice = lista.indexOf(indice);
				//lista.remove(indice);
				//System.out.println("Se elimino corectamente\n Lista Actualizada:\n " + lista);
			case 6:   //CONTAR
				System.out.println("6.- Contando todos los elementos");
				System.out.println("Existen : " + lista.size() + " juegos en la lista");
				break;
				
			case 7:  //ELIMINAR TODOOO
				System.out.println("Se han eliminado  los elementos !!");
				lista.clear();
				break;
				
            case 8:   //SALIR
				System.out.println("Saliendo del menu, vuelve pronto !!!");
				break;
				default:
					System.out.println("Opcion invalida.. Intenta con una opccion dentrodel menu !!");
					break;
			}
		}while(menuPrincipal !=8);
		
	}

}
