package com.mx.Eletrodomestico;

public class Principal {

	public static void main(String[] args) {
		
		//instanciar objetos
		Electrodomestico el1 = new Electrodomestico(1, "Refrigerador", "Linea blanca", "gris", "Samsung", 17320.70);
		Electrodomestico el2 = new Electrodomestico(2, "Plancha", "Linea blanca", "Azul", "oster", 3000);
		Electrodomestico el3 = new Electrodomestico(3, "Lavadora", "Linea Blanca", "Blanco", "LG", 4500);
		Electrodomestico el4= new Electrodomestico (4,"lavadora","linea blanca", "rojo", "mitage", 20353.70);
		Electrodomestico el5 = new Electrodomestico(5,"lavadora","Linea Blanca","Blanco","LG",19360.76);
		Electrodomestico el6 = new Electrodomestico(6,"Pantalla","Tecnología","Negro","LG",10530.23);
		Electrodomestico el7 = new Electrodomestico(7, "Secadora", "Linea blanca", "negro", " Atvio", 2000);
		
		//objeto auxiliar
		Electrodomestico elec = null;
		
		//implementacion
		Implementacion imp = new Implementacion();
		
		//guardar
		imp.guardar(el1);
		imp.guardar(el2);
		imp.guardar(el3);
		imp.guardar(el4);
		imp.guardar(el5);
		imp.guardar(el6);
		imp.guardar(el7);
		
		//mostrar
		imp.mostrar();
		
		//buscar
		elec = new Electrodomestico(4);
		elec = imp.buscar(elec);
		System.out.println("Encontrado: " + elec);
		
		//editar
		elec= new Electrodomestico(2);
		elec = imp.buscar(elec);
		elec.setColor("morado");
		elec.setMarca("mabe");
		imp.editar(elec);
		imp.mostrar();
		
		//eliminar
		elec = new Electrodomestico(3);
		elec = imp.buscar(elec);
		imp.eliminar(elec);
		imp.mostrar();
		
		//contar
		imp.contar();

	}

}
