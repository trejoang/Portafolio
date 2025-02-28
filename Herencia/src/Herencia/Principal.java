package Herencia;

public class Principal {

	public static void main(String[] args) {
		// instanciar
		Hijo hijo1 = new Hijo("Gerardo", "Morales", 12, 1.60, "Mexico", "Cafe", "Delgada");
		
		System.out.println(hijo1);
		
		hijo1.setEdad(21);
		hijo1.setAltura(1.90);
		System.out.println(hijo1);
		
		hijo1.trabajar();

	}

}
