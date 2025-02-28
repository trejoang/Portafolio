package Curso;

import java.util.ArrayList;
import java.util.List;

public class EstudianteServiceImpl implements EstudianteService{
	
	List<Estudiante> list = new ArrayList<Estudiante>();

	@Override
	public void guardar(Estudiante estudiante) {
		
		list.add(estudiante);
		
	}

	@Override
	public void editar(int indice, Estudiante estudiante) {
		list.set(indice, estudiante);
		
	}

	@Override
	public void mostra() {
		
		System.out.println(list);
		
	}

	@Override
	public void eliminar(int indice) {
		list.remove(indice);
		
	}

	@Override
	public Estudiante buscar(int indice) {
		
		return list.get(indice);
	}
	
	

}
