package Principal;

import Entidades.Alimento;
import Entidades.Electronico;
import Implementacion.Implementa;

public class Principal {

	public static void main(String[] args) {
		//Alimento
		
		Alimento al1 = new Alimento(123, "temporada", "pequeño", "amarillo", 27);
		Alimento al2 = new Alimento(345, "todo tiempo", "grande", "verde", 30);
		Alimento al3 = new Alimento(67, "nacional", "mediano", "naranja", 1.5);
		Alimento al4 = new Alimento(143, "importada", "normal", "morado", 227);
		
		Alimento alim= null;
		Implementa impa = new Implementa();
		//guardar
		impa.guardar(al1.getCodigo(), al1);
		impa.guardar(al2.getCodigo(), al2);
		impa.guardar(al3.getCodigo(), al3);
		impa.guardar(al4.getCodigo(), al4);
		
		//Mostar
		impa.mostrar();
		
		//buscar
		alim = (Alimento) impa.buscar(al1.getCodigo());
		System.out.println("Encontrada " + alim);
		
		//editar
		alim = (Alimento) impa.buscar(al1.getCodigo());
		alim.setColor("dorado");
		impa.editar(al1.getCodigo(), alim);
		System.out.println("producto editado");
		
		//borarar
		alim=(Alimento) impa.buscar(al4.getCodigo());
		impa.eliminar(al4.getCodigo());
		impa.mostrar();
		// ///////////////////  Electronico
		
		Electronico el1 = new Electronico(00, "ulimninacion", "pequeño", "foco", 5.4);
		Electronico el2 = new Electronico(746, "ropa", "mediano", "chamarra", 2134);
		Electronico el3 = new Electronico(430, "jujuetes", "pequeño", "carro", 70);
		Electronico el4 = new Electronico(8985, "decoracion", "mediano", "espejo", 225);

		Electronico elec= null;
		Implementa impe = new Implementa();
		//guardar
		impe.guardar(el1.getCodigo(), el1);
		impe.guardar(el2.getCodigo(), el2);
		impe.guardar(el3.getCodigo(), el3);
		impe.guardar(el4.getCodigo(), el4);
		//Mostar
		impe.mostrar();
		//buscar
		elec = (Electronico) impe.buscar(el1.getCodigo());
		System.out.println("Encontrada " + elec);
				
		//editar
		elec = (Electronico) impe.buscar(el1.getCodigo());
		elec.setNombre("Pantalla");
		impe.editar(al1.getCodigo(), elec);
		System.out.println("producto editado");
		//borarar
		elec=(Electronico) impe.buscar(el4.getCodigo());
		impe.eliminar(al4.getCodigo());
		impe.mostrar();

	}

}
