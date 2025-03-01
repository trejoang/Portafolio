package Libro;

public interface IMetodos {
	//void: es un tipo de valor de retorno
		public void guardar(Libro libro);
		public void editar(int indice, Libro libro);
		public void mostar();
		public void eliminar(int indice);
		public Libro buscar(int indice);


}
