package Curso;

public class Main {

	public static void main(String[] args) {
		
		Estudiante cu1 = new Estudiante(1, "angel", 22);
		Estudiante cu2 = new Estudiante(2, "erick", 19);
		Estudiante cu3 = new Estudiante(3, "bertin", 2);
		Estudiante cu4 = new Estudiante(4, "isa", 11);
		Estudiante cu5 = new Estudiante(5, "hasan", 62);
		Estudiante cu6 = new Estudiante(6, "uriel", 34);
		Estudiante cu7 = new Estudiante(7, "rick", 21);
		
		Estudiante estudiante = null;
		
		EstudianteServiceImpl imp = new EstudianteServiceImpl();
		
		//agregar
		
		imp.guardar(cu1);
		imp.guardar(cu2);
		imp.guardar(cu3);
		imp.guardar(cu4);
		imp.guardar(cu5);
		imp.guardar(cu6);
		imp.guardar(cu7);
		
		//mostrar
		imp.mostra();
		
		//buscar
		estudiante = imp.buscar(2);
		System.out.println("Elemento encontrado: " + estudiante);
		
		//editar
		
		estudiante = imp.buscar(0);
		estudiante.setNombre("patito");
		estudiante.setEdad(300);
		imp.editar(0, estudiante);
		imp.mostra();
		
		//eliminar
		imp.eliminar(2);
		imp.mostra();

	}

}
