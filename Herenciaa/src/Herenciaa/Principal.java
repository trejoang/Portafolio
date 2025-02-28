package Herenciaa;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hija hj = new Hija("Pamela", "Ortis", "Chef", 2500, "CDMX", "Rubio");
		
		System.out.println(hj);
		
		hj.setApellido("mendez");
		hj.setSueldo(30);
		System.out.println(hj);
		
		hj.mensj();

	}

}
