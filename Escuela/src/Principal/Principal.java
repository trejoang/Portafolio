package Principal;

import Entidades.Alumno;
import Entidades.Empleado;
import Entidades.Profesor;
import Implementacion.ImpAlumno;
import Implementacion.ImpEmpleado;


public class Principal {

	public static void main(String[] args) {
		
		//Alumnos
		Alumno al1 = new Alumno(1, "pepito", "ese", "yes", "mate");
		Alumno al2 = new Alumno(2, "fulanito", "tamal", "atol", "geo");
		Alumno al3 = new Alumno(3, "fulanita", "torta", "chila", "ingle");
		Alumno al4 = new Alumno(4, "grillo", "perez", "rosa", "poo");
		Alumno al5 = new Alumno(4, "aleja", "delgadillo", "cielo", "espan");
		Alumno al6 = new Alumno(4, "eric", "matinez", "aul", "ciencias");
		
		Alumno alumno= null;
		ImpAlumno impa= new ImpAlumno();
		//agregar
		impa.guardar(al1.getNombre(), al1);
		impa.guardar(al2.getNombre(), al2);
		impa.guardar(al3.getNombre(), al3);
		impa.guardar(al4.getNombre(), al4);
		impa.guardar(al5.getNombre(), al5);
		impa.guardar(al6.getNombre(), al6);
		
		//mostrar
		impa.mostrar();
		
		//buscar
		//casteo: cambio de datos
		alumno = (Alumno) impa.buscar(al1.getNombre());
		System.out.println("Encontrado " + alumno);
		
		//editar
		alumno = (Alumno) impa.buscar(al3.getNombre());
		alumno.setApellidop("ramirez");
		impa.editar(al1.getNombre(), alumno);
		System.out.println("Alumno editado ");
		
		//eliminar
		alumno=(Alumno) impa.buscar(al4.getNombre());
		impa.eliminar(al4.getNombre());
		impa.mostrar();
		
		//contar
		impa.contar();
		System.out.println("\n");
		
		//*********************
		
		//Empleado
				Empleado em1 = new Empleado("asd21", "jorge", "simon", "A", 1500);
				Empleado em2 = new Empleado("jd45jd", "bren", "star", "B", 23.45);
				Empleado em3 = new Empleado("lf8447", "john", "siemp", "B", 123.21);
				Empleado em4 = new Empleado("54djd", "ingri", "salva", "C", 624.10);
				Empleado em5 = new Empleado("og900", "mari", "estrada", "H", 300);
				Empleado em6 = new Empleado("132fd", "ramon", "peralta", "E", 4123);
				
				Empleado empleado= null;
				ImpEmpleado impe= new ImpEmpleado();
				//agregar
				impe.guardar(em1.getNombre(), em1);
				impe.guardar(em2.getNombre(), em2);
				impe.guardar(em3.getNombre(), em3);
				impe.guardar(em4.getNombre(), em4);
				impe.guardar(em5.getNombre(), em5);
				impe.guardar(em6.getNombre(), em6);
				
				//mostrar
				impe.mostrar();
				
				//buscar
				//casteo: cambio de datos
				empleado = (Empleado) impe.buscar(em1.getNombre());
				System.out.println("Encontrado " + empleado);
				
				//editar
				empleado = (Empleado) impe.buscar(em3.getNombre());
				empleado.setApellidop("noche");
				impa.editar(em1.getNombre(), empleado);
				System.out.println("Empleado editado ");
				
				//eliminar
				empleado=(Empleado) impe.buscar(em4.getNombre());
				impe.eliminar(al4.getNombre());
				impe.mostrar();
				
				//contar
				impe.contar();
				System.out.println("\n");
				
				//*********************
				
				//Empleado
						Profesor po1 = new Profesor(21, "raul", "norte", 5, 5925);
						Profesor po2 = new Profesor(45, "fernando", "paqui", 7, 5673.45);
						Profesor po3 = new Profesor(8447, "karla", "terjo", 9, 987.21);
						Profesor po4 = new Profesor(54, "estefania", "pineda", 4, 2474.10);
						Profesor po5 = new Profesor(900, "berenice", "olmos", 7, 5820);
						Profesor po6 = new Profesor(132, "edgar", "frank", 12, 2213);
						
						Profesor profesor= null;
						ImpEmpleado impp= new ImpEmpleado();
						//agregar
						impp.guardar(po1.getNombre(), po1);
						impp.guardar(po2.getNombre(), po2);
						impp.guardar(po3.getNombre(), po3);
						impp.guardar(po4.getNombre(), po4);
						impp.guardar(po5.getNombre(), po5);
						impp.guardar(po6.getNombre(), po6);
						
						//mostrar
						impp.mostrar();
						
						//buscar
						//casteo: cambio de datos
						profesor = (Profesor) impp.buscar(po1.getNombre());
						System.out.println("Encontrado " + profesor);
						
						//editar
						profesor = (Profesor) impp.buscar(po3.getNombre());
						profesor.setApellido("mar");
						impp.editar(em1.getNombre(), profesor);
						System.out.println("Profesor editado ");
						
						//eliminar
						profesor=(Profesor) impp.buscar(po4.getNombre());
						impp.eliminar(po4.getNombre());
						impp.mostrar();
						
						//contar
						impp.contar();


	}

}
