package Principal;

import Entidades.MedioTiempo;
import Entidades.TiempoCompleto;

public class Principal {

	public static void main(String[] args) {
		
		TiempoCompleto tc = new TiempoCompleto("uriel", "programador", 200, 3, "noche", 1);
		System.out.println(tc);
		tc.calcularSalario(tc.getNombre(), tc.getSalario());
		
		//Medio
		MedioTiempo mt = new MedioTiempo("hasan", "analista", 432, 5, "Tlane");
		System.out.println(mt);
		mt.calcularSalario(mt.getNombre(), mt.getSalario());

	}

}
