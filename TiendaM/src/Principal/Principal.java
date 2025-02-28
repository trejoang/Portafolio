package Principal;

import Entidades.Ave;
import Entidades.Canino;

public class Principal {

	public static void main(String[] args) {
		// Canino
		Canino ca = new Canino("Firulaiss", "eduardo", 5, "CDMX", "Bull Terrier", "Mediano", 24.30);
		System.out.println(ca);
		ca.acion();
		ca.ser(ca.getNomre(), ca.getDueno());
		System.out.println("\n");
		
		//Ave
		Ave a = new Ave("Blue", "Rita", 2, "Brasil", "Azul", "pequeño", 1.20);
		System.out.println(a);
		a.acion();
		a.ser(a.getNomre(), a.getDueno());

	}

}

/*
 * Ejercicio 1
 * crea una clase abstracta Trasnporte con metodos abstractos como inciarRuta().
 * implementa sublcases Autos Y Metro con su propia logica ruta
 * usa una lista de transporte y llama iniciarRuta() en cada uno
 * 
 *  Ejercicio 2
 *  Crea una clase abstracta Empleado con metodos como calcularSalario()
implementa suvclases TiempoCompleto yMedioTiempo, cada una con su propiocalculo de salario
usa una lista para almacenar empleados y calcular la nomina total 
*/


