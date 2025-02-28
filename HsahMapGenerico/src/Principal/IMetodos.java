package Principal;
//clase object es la clase raiz de todas las clases
//si se usa en un HsahMap o una lista (ejemplo: HashMap<Object, Object> estamos diciendo que tanto la clave
//como el valor puede ser cualquier tipo de dato o valor.)
public interface IMetodos {
	
	void guardar(Object key, Object value);
	void editar(Object key, Object value);
	void eliminar(Object key);
	Object buscar(Object key);
	void mostrar();

}
