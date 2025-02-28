package Tenis;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {

	public static void main(String[] args) {
		
		Tenis tenis1 = new Tenis("adidas", "jordan", "blanco-azul", 7, 350.50);
		Tenis tenis2 =new Tenis("nike", "forum mind", "rojo-negro", 6, 730.60);
		Tenis tenis3 = new Tenis("puma", "sude class", "azules", 5, 250);
		Tenis tenis4 = new Tenis("panam", "coyote", "blanco", 5, 450.00);
		Tenis tenis5 = new Tenis("vans","old scholl","negro", 4, 375.70);
		
		Tenis tenis= null;
		
		Implementacion imp = new Implementacion();
		
		
		//agregar
		imp.guardar(tenis1);
		imp.guardar(tenis2);
		imp.guardar(tenis3);
		imp.guardar(tenis4);
		imp.guardar(tenis5);
		/*
		//usando metodo mostra
		//imp.mostra();
				
		//buscar
		tenis = imp.buscar(2);
			System.out.println("Elemento encontrado: " + tenis);
			
		//editar
		tenis = imp.buscar(0);
		tenis.setMarca("patito");
		tenis.setPrecio(2.1);
		imp.editar(0, tenis);
		imp.mostra();
			
		//eliminar
		imp.eliminar(2);
		imp.mostra();
			
		//contar
		imp.contar();
		
		//ordenar alfabeticamente
		imp.mostraalf();
		
		//ordenar por precio
				imp.mostrape();*/
		
		Scanner datos = new Scanner(System.in);
		int menuP = 0, menuS = 0, indice =0;
		String marca, modelo, color;
		int talla;
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
				//Agregar
				case 1:
				 System.out.println("<<<< ALTA >>>");
				 System.out.println("Llene los siguientes datos sobre para los tenis");
				
				 System.out.println("MARCA");
				 marca = datos.nextLine();
				 
				 System.out.println("MODELO");
				 modelo = datos.nextLine();
				 
				 System.out.println("COLOR");
				 color = datos.nextLine();
				 
				 System.out.println("TALLA");
				 talla = datos.nextInt();
				 datos.nextLine();
				 
				 System.out.println("PRECIO");
				 precio = datos.nextDouble();
				 datos.nextLine();
				 
				 
				 
				 tenis = new Tenis(marca, modelo, color, talla, precio);
				 imp.guardar(tenis);
				 //System.out.println("Tenis agregado exitosamente : " + tenis.getModelo());
				
				 break;
				 //Buscar
				case 2:
					System.out.println("<<<< BUSCAR >>>>");
					imprimirDatos(imp);
					if(imp.lista.size() >0) {
						System.out.println("Indica el indice para mostrar la informacion");
						indice = datos.nextInt();
						datos.nextLine();
						if(indice >= 0 && indice < imp.lista.size()) {
							tenis = imp.buscar(indice);
							System.out.println("Esta es la informacion completa del tenis:\n" + tenis);
						}else{
							System.out.println("El elemento no existe");
						}
					}
					break;
					//Editar
				case 3:
					System.out.println("<<< EDITAR >>>");
					imprimirDatos(imp);
					
					if(imp.lista.size() >0) {
						System.out.println("Indica el indice que desea editar");
						indice = datos.nextInt();
						datos.nextLine();
						
						if(indice >= 0 && indice < imp.lista.size()) {
							do {
								System.out.println("** MENU EDITAR **");
								System.out.println("1.- EDITAR MARCA");
								System.out.println("2.- EDITAR MODELO");
								System.out.println("3.- EDITAR COLOR");
								System.out.println("4.- EDITAR TALLA");
								System.out.println("5.- EDITAR PRECIO");
								System.out.println("6.- REGRESAR AL MENU PRINCIPAL");
								System.out.println("7.- ELIGE UNA OPCCION");
								
								menuS = datos.nextInt();
								datos.nextLine();
								tenis = imp.buscar(indice);
								
								switch(menuS) {
								  
								case 1:
									System.out.println("Ingrese la nueva marca");
									marca = datos.nextLine();
									tenis.setMarca(marca);
									break;
								case 2:
									System.out.println("Ingrese el nuevo modelo");
									modelo = datos.nextLine();
									tenis.setModelo(modelo);
									break;
								case 3:
									System.out.println("Ingrese el nuevo color");
									color = datos.nextLine();
									tenis.setColor(color);
									break;
								case 4:
									System.out.println("Ingrese la nueva talla");
									talla = datos.nextInt();
									tenis.setTalla(talla);
									break;
								case 5:
									System.out.println("Ingrese el nuevo precio");
									precio = datos.nextDouble();
									tenis.setPrecio(precio);
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
					//Eliminar
				case 4:
					System.out.println("<<<< ELIMINAR >>>>");
					imprimirDatos(imp);
					
					if(imp.lista.size() >0) {
						System.out.println("Indica el indice que desea eliminar");
						indice = datos.nextInt();
						datos.nextLine();
						//if(indice != imp.lista.size()) {
						if(indice >= 0 && indice < imp.lista.size()){
							imp.eliminar(indice);
							System.out.println("El tenis fue elimino");
						}else {
							System.out.println("El elemento no existe");
						}
						}
				//}
					break;
					//Mostrar
				case 5:
					System.out.println("<<<<< MOSTRAR >>>>>");

					if(imp.lista.size() >0) {
						imp.mostra();
					}else {
						System.out.println("No hay registros en esta lista");
					}
					break;
					//Contar
				case 6:
					System.out.println("<<<<< CONTAR >>>>>");
					imp.contar();
					break;
					//Salir
				case 7:
					System.out.println("Saliendo del menu... Vuelve pronto");
					break;
					default:
						System.out.println("Indice fuera de rango, intenta con uno valido!");
						break;
				}
				
			}catch (InputMismatchException e){
				System.out.println("Entrada invalida. por favor ingresa un numero");
				datos.nextLine();
			}catch(Exception e) {
				
				System.out.println("Ocurrio un error inesperado" + e.getMessage());
			}
		}while(menuP !=7);

	}
		
		public static void imprimirDatos(Implementacion imp) {
			System.out.println("<< Tenis Registrados >>");
			if(imp.lista.size() >0) {
				for(int i = 0; i < imp.lista.size(); i ++) {
					System.out.println("El tenis[" + i + "] con modelo: " + imp.lista.get(i).getModelo());
				}
			}else {
				System.out.println("No hay tenis registrados en la lista");
			}
		}
}
