package Principal;

import Entidades.Fruta;
import Entidades.Juguete;
import Entidades.VideoJuego;
import Implementacion.ImpFruta;

public class Principal {

	public static void main(String[] args) {
		// instanciar frutas
		Fruta fr1 = new Fruta("mango", "amarillo", 24.50, 1.5, "verano");
		Fruta fr2 = new Fruta("tuna", "verde", 57.10, 2.3, "otoño");
		Fruta fr3 = new Fruta("Mora","Azul",25,10.5,"Otoño");
		Fruta fr4 = new Fruta("guayaba", "amarillo", 32.50, 2.5,"otoño" );
		Fruta fr5 = new Fruta("Mandarina", "Naranja", 30.80,2.5,"Invierno");
		Fruta fr6 = new Fruta("Manzana", "Roja", 15.00, 1.5, "verano") ;
		Fruta fr7 = new Fruta("Zanairia", "Naranja", 28, 2.0, "Verano");
		
		//objeto auxiliar
		Fruta fruta= null;
		ImpFruta impF = new ImpFruta();
		
		//Guarddar
		impF.guardar(fr1.getNombre(), fr1);
		impF.guardar(fr2.getNombre(), fr2);
		impF.guardar(fr3.getNombre(), fr3);
		impF.guardar(fr4.getNombre(), fr4);
		impF.guardar(fr5.getNombre(), fr5);
		impF.guardar(fr6.getNombre(), fr6);
		impF.guardar(fr7.getNombre(), fr7);
		
		//mostrar
		impF.mostrar();
		
		//buscar
		//casteo: cambio de datos
		fruta = (Fruta) impF.buscar(fr1.getNombre());
		System.out.println("Encontrada " + fruta);
		
		//editar
		fruta = (Fruta) impF.buscar(fr7.getNombre());
		fruta.setColor("azul");
		impF.editar(fr1.getNombre(), fruta);
		System.out.println("Editada fruta");
		
		//eliminar
		fruta=(Fruta) impF.buscar(fr6.getNombre());
		impF.eliminar(fr6.getNombre());
		impF.mostrar();
		
		//contar
		impF.contar();
		
		
		//juguetes
		Juguete toy1 = new Juguete(12324, "Barbie", "4-12", 550.70, "MATTEL", "munenica", "rosa");
		Juguete toy2 = new Juguete(12325, "Max Steel", "6-12", 700.70, "MATTEL", "muneco", "carne");
		Juguete toy3 = new Juguete(12121, "Triciclo", "5-8", 2500.50, "Sport", "montable", "azul");
		Juguete toy4 = new Juguete(31234,"Lego","10-20",980.75, "Lego","construccion", "diversos");
		Juguete toy5 = new Juguete(12235, "Carro", "4-12", 40, "SEGA", "Motorizado", "Rojo");
		Juguete toy6 = new Juguete(12357, "Dentista", "7-16", 345, "Mattel", "plastilina", "carne") ;
		Juguete toy7 = new Juguete(12353,"carros", "4-12", 170.5,"maTTEL", "carritos", "azul");
		
		
		//Videojuego
		VideoJuego vj1 = new VideoJuego("Mario Bros", "infantil", "NIMTENDO", 1900, 780.30, "AA");
		VideoJuego vj2 = new VideoJuego("The Last Of Us", "Adultos", "Sony", 2020, 1599.90, "C");
		VideoJuego vj3 = new VideoJuego("OUTLAST", "ADULTO", "ROCKET", 2011, 1000, "AA");
		VideoJuego vj4 = new VideoJuego("Crash Bandicoot", "Infantil","Nauting Dogs", 1999, 880.50,"AA");
		VideoJuego vj5 = new VideoJuego("Minecraft", "general", "Mojang Studios", 2009, 1200.50, "AA");
		VideoJuego vj6 = new VideoJuego ("the king of figthers", "infantil", "natgeo", 1992, 832.01, "AC");
		VideoJuego vj7 = new VideoJuego("Call of Duty", "general", "Gray Matter", 2024, 390, "B") ;
		
		
		

	}

}
