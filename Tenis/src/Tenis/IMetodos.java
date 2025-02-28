package Tenis;

public interface IMetodos {
	
	public void guardar(Tenis tenis);
	public void editar(int indice, Tenis tenis);
	public void mostra();
	//public void mostraalf();
	//public void mostrape();
	public void eliminar(int indice);
	public Tenis buscar(int indice);

}
