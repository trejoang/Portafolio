package Principal;

import Entidades.Abogado;
import Entidades.Medico;

public class Principal {

	public static void main(String[] args) {
		//instanciar abogado
		Abogado abogado = new Abogado("Raul", "Mendoza", 28, 8666668, "UNAM", 5, "Fiscal", "Bufete hermanos Mendoza", 1550);
		System.out.println(abogado);
		abogado.trabajar();
		abogado.cobrar(abogado.getTipo(), abogado.getHonorarios());
		
		//medico
		Medico medico = new Medico("Ricardo", "Martinez", 23, 54615547, "UNAM", 10, "Medico Familiar", "Imss", 400);
		System.out.println(medico);
		medico.trabajar();
		medico.cobrar(medico.getEspecialidad(), medico.getCostoConsulta());
		
		

	}

}
