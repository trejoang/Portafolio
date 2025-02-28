package Principal;

import Entidades.Autobus;
import Entidades.Metro;

public class Principal {

	public static void main(String[] args) {
		//auto
		Autobus au = new Autobus("juanitoss", 50, "Edo mex", "blaco/rayas verde", "heroes - indios verdes");
		System.out.println(au);
		au.iniciarRuta();
		System.out.println("\n");
		
		//metro
		Metro mt = new Metro("gobierno", 300, "CDMX", "Naranja", "Linea b");
		System.out.println(mt);
		mt.iniciarRuta();
		
	}

}
