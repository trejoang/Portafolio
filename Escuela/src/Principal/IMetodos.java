package Principal;

public interface IMetodos {
	
	void guardar(Object key, Object value);
	void editar(Object key, Object value);
	void eliminar(Object key);
	Object buscar(Object key);
	void mostrar();

}
