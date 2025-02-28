package com.mx.Botellas;


public class Principal {

	public static void main(String[] args) {
		
		Botellas bo1 = new Botellas(1, "jose cuervo", "tequila", "jc reposado", 300);
		Botellas bo2 = new Botellas(2, "mallacan", "whisjy", "etiqueta roja", 350);
		Botellas bo3 = new Botellas(3, "ballantines", "licor", "cereza", 267.89);
		Botellas bo4 = new Botellas(4, "jony", "whisjy", "etiqueta roja", 350.60);
		Botellas bo5 = new Botellas(5, "grisli", "whisky", "numero 7", 500);
		
		Botellas bot = null;
		
		Implementacion imp = new Implementacion();
		//agregar
		imp.guardar(bo1);
		imp.guardar(bo2);
		imp.guardar(bo3);
		imp.guardar(bo4);
		imp.guardar(bo5);
		
		//mostar
		imp.mostrar();
		
		//buscar
		bot = new Botellas(3);
		bot = imp.buscar(bot);
		System.out.println("encontrado" + bot);
		
		//editar
		bot= new Botellas(2);
		bot = imp.buscar(bot);
		bot.setMarca("zebra");
		bot.setCategoria("vodka");
		imp.editar(bot);
		imp.mostrar();
		
		//eliminar
		bot = new Botellas(4);
		bot = imp.buscar(bot);
		imp.eliminar(bot);
		imp.mostrar();
				
		//contar
		imp.contar();
		
		//ordenados por marca
		imp.mostrama();
		
		//ordenados por precio
		imp.mostrapre();


	}

}
