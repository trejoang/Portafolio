package Libro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

public static void main(String[] args) {
		
		//iniciar el objecto
		Libro libro1 = new Libro("Los juegos del hambre", "Suzzane Collins", "ALfaguara", 555, 350.50);
		Libro libro2 =new Libro("El trono de hielo", "azusena", "diamante", 650, 730.60);
		Libro libro3 = new Libro("La chica del tren", "Paula Hawkins", "PlanetaLibros", 700, 250);
		Libro libro4 = new Libro("Los cuatro acuerdos", "Miguel Ruíz", "Urano", 160, 450.00);
		Libro libro5 = new Libro("12 años de esclavo","paulos","rose", 750,375.70);
		Libro libro6 = new Libro("Cartas de amor a los muertos", "Ava Dellaira", "Farrar", 336, 300);
		
		//objecto auxiliar: 
		Libro libro= null;
		
		//mandar a llamar a la clase de implementacion para poder ocupar sus metodos
		Implementacion imp = new Implementacion();
		
		//agregar datos a la lista
		
		imp.guardar(libro1);
		imp.guardar(libro2);
		imp.guardar(libro3);
		imp.guardar(libro4);
		imp.guardar(libro5);
		imp.guardar(libro6);
		
		/*
		//usando metodo mostra
		imp.mostar();
		
		//buscar
		libro = imp.buscar(2);
		System.out.println("Elemento encontrado: " + libro);
		
		//editar
		libro = imp.buscar(0);
		libro.setAutor("Aline");
		libro.setPrecio(2.1);
		imp.editar(0, libro);
		imp.mostar();
		
		//eliminar
		imp.eliminar(5);
		imp.mostar();
		
		//contar
		imp.contar();
		*/
		
		//Menu interativo
		//usando manejo de excpeciones o errores: try cach:si lega a ocurrir un error dentro
		//de la ejecucion que detenga el flujo de la aplicacion, ocurre la excepcion y maneja de forma
		//adecuada el error y le manda un mensaje al usuario
		
		Scanner datos = new Scanner(System.in);
		int menuP = 0, menuS = 0, indice =0;
		//variables locales
		String nombre, autor, editorial;
		int noPaginas;
		double precio;
		
		do {
			System.out.println("** MENU **");
			System.out.println("1.- ALTA");
			System.out.println("2.- BUSCAR");
			System.out.println("3.- EDITAR");
			System.out.println("4.- ELIMINAR");
			System.out.println("5.- MOSTRAR");
			System.out.println("6.- CONTAR");
			System.out.println("7.- SALIR");
			System.out.println("---- ELIGUE UNA OPCCION ---");
			
			try {
				menuP = datos.nextInt();
				datos.nextLine();
				switch(menuP) {
				case 1:
				 System.out.println("<<<< ALTA >>>");
				 System.out.println("Llene los siguientes datos sobre el libro");
				
				 System.out.println("NOMBRE");
				 nombre = datos.nextLine();
				 
				 System.out.println("Autor");
				 autor = datos.nextLine();
				 
				 System.out.println("Editorial");
				 editorial = datos.nextLine();
				 
				 System.out.println("Numero de Paginas");
				 noPaginas = datos.nextInt();
				 datos.nextLine();
				 
				 System.out.println("Precio");
				 precio = datos.nextDouble();
				 datos.nextLine();
				 
				 //instanciamos
				 libro = new Libro(nombre, autor, editorial, noPaginas, precio);
				 imp.guardar(libro);
				 System.out.println("Guardo exitosamente el libro: " + libro.getNombre());
				 break;
				
				case 2:
					System.out.println("<<<< BUSCAR >>>>");
					imprimirDatos(imp);
					if(imp.lista.size() >0) {
						System.out.println("Indica el indice para mostrar la informacion");
						indice = datos.nextInt();
						datos.nextLine();
						if(indice >= 0 && indice < imp.lista.size()) {
							libro = imp.buscar(indice);
							System.out.println("Esta es la informacion completa del libro:\n" + libro);
						}else{
							System.out.println("indice fuera del rando intenta con uno del menu");
						}
					}
					break;
					
				case 3:
					System.out.println("<<< ESDITAR >>>");
					imprimirDatos(imp);
					
					if(imp.lista.size() >0) {
						System.out.println("Indica el indice que desea editar");
						indice = datos.nextInt();
						datos.nextLine();
						
						if(indice >= 0 && indice < imp.lista.size()) {
							do {
								System.out.println("** MENU EDITAR **");
								System.out.println("1.- EDITAR NOMBRE");
								System.out.println("2.- EDITAR AUTOR");
								System.out.println("3.- EDITAR EDITORIAL");
								System.out.println("4.- EDITAR NUMERO DE PAGINAS");
								System.out.println("5.- EDITAR PRECIO");
								System.out.println("6.- REGRESAR AL MENU PRINCIPAL");
								System.out.println("7.- ELIGE UNA OPCCION");
								
								menuS = datos.nextInt();
								datos.nextLine();
								libro = imp.buscar(indice);
								
								switch(menuS) {
								  
								case 1:
									System.out.println("Ingrese el nuevo nombre");
									nombre = datos.nextLine();
									libro.setNombre(nombre);
									break;
								case 2:
									System.out.println("Ingrese el nuevo autor");
									autor = datos.nextLine();
									libro.setAutor(autor);
									break;
								case 3:
									System.out.println("Ingrese la nueva editorial");
									editorial = datos.nextLine();
									libro.setEditorial(editorial);
									break;
								case 4:
									System.out.println("Ingrese el nuevo Numero Paginas");
									noPaginas = datos.nextInt();
									libro.setNoPaginas(noPaginas);
									break;
								case 5:
									System.out.println("Ingrese el nuevo precio");
									precio = datos.nextDouble();
									libro.setPrecio(precio);
									break;
								case 6:
									System.out.println("Regresando al menu principal");
									break;
									default:
										System.out.println("indice no valido");
										break;
								}
								System.out.println("Edicion  EXITOSA !!");
							}while (menuS !=6);
						}else {
							System.out.println("Indice fuera del rango, intente con uno del menu");
						}		
					}
					break;
				
				case 4:
					System.out.println("<<<< ELIMINAR >>>>");
					imprimirDatos(imp);
					
					if(imp.lista.size() >0) {
						System.out.println("Indica el indice que desea eliminar");
						indice = datos.nextInt();
						datos.nextLine();
						if(indice >= 0 && indice < imp.lista.size()){
							imp.eliminar(indice);
							System.out.println("El libro se elimino");
						}else {
							System.out.println("Indice fuera de rango");
						}			
					}
					break;
					
				case 5:
					System.out.println("<<<<< MOSTRAR >>>>>");

					if(imp.lista.size() >0) {
						imp.mostar();
					}else {
						System.out.println("No hay registros en esta lista");
					}
					break;
					
				case 6:
					System.out.println("<<<<< CONTAR >>>>>");
					imp.contar();
					break;
					
				case 7:
					System.out.println("Saliendo del menu... Vuelve pronto");
					break;
					default:
						System.out.println("Indice fuera de rango, intenta con uno valido!");
						break;
				}
				
			}catch (InputMismatchException e) {
				System.out.println("Entrada invalida. por favor ingresa un numero");
				datos.nextLine();
			
			}catch(Exception e) {
				
				System.out.println("Ocurrio un error inesperado" + e.getMessage());
			}
		} while(menuP !=7);

	}// termina mi metodo main
	
	//crear metodo estatico
	public static void imprimirDatos(Implementacion imp) {
		System.out.println("<<Libros Registrados>>");
		if(imp.lista.size() >0) {
			for(int i = 0; i < imp.lista.size(); i ++) {
				System.out.println("El libro[" + i + "] de nombre: " + imp.lista.get(i).getNombre());
			}
		}else {
			System.out.println("No hay libros ragistrados en la lista");
		}
	}

}//termina mi clase
