package Curso;


public interface EstudianteService {
	
	public void guardar(Estudiante estudiante);
	public void editar(int indice, Estudiante estudiante);
	public void mostra();
	public void eliminar(int indice);
	public Estudiante buscar(int indice);
	

}
