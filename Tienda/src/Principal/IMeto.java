package Principal;

public interface IMeto {
	void guardar(Object key, Object value);
	void editar(Object key, Object value);
	void eliminar(Object key);
	Object buscar(Object key);
	void mostrar();

}
