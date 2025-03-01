package Principal;

import Entidadees.Serie;
import Entidadees.VideoJuego;

public class Princial {

	public static void main(String[] args) {
		
		//Series
		Serie[] se= new Serie[5];
		se[0] = new Serie("GOT", 4,  "Aventura", "gregori");
		se[1] = new Serie("TLFU", 1,  "Suspenso", "sony");
		se[2] = new Serie("Como conoci a tu mama", 10,  "Vida real", "james");
		se[3] = new Serie("True Blob", 6,  "Misterio", "Alfonso");
		se[4] = new Serie("The strain", 4,  "Suspenso", "guillermo del toro");
		
		//juegos
		VideoJuego[] vj= new VideoJuego[5];
		vj[0] = new VideoJuego("Fifa", 10, "Deporte", "ea sport");
		vj[1] = new VideoJuego("Gog Of War", 60, "Accion", "sony");
		vj[2] = new VideoJuego("Sony", 28,  "Diversion", "sega");
		vj[3] = new VideoJuego("TheLFU", 50,  "Suspenso", "sony");
		vj[4] = new VideoJuego("Horizon", 4200,  "Accion", "guerrilla");
		
		//entregas
		se[1].entregar();
		se[3].entregar();
		vj[0].entregar();
		vj[2].entregar();
		vj[4].entregar();
		
		
		//Contar series
		int SeEn = 0;
		
        for (Serie s : se) {
            if (s.isEntregado()) {
                SeEn++;
            }
        }
        
        System.out.println("Número de series entregadas: " + SeEn);
        
      //Contar juegos
              int ViEn = 0;
      		
              for (VideoJuego s : vj) {
                  if (s.isEntregado()) {
                      ViEn++;
                  }
              }
		
              
              System.out.println("Número de videojuegos entregados: " + ViEn);
		
        //Serie con mas temporadas
              
              Serie sM = se[0];
              for (Serie s : se) {
                  if (s.getNuTemporadas() > sM.getNuTemporadas()) {
                	  sM = s;
                  }
              }
         //Juego con mas horas
              
              VideoJuego vM = vj[0];
             for (VideoJuego v : vj) {
                  if (v.getHorasEstimaadas() > vM.getHorasEstimaadas()) {
                	  vM = v;
                  }
              }
         
          //Impresion de serie
              System.out.println("\nLa serie con más temporadas es:");
              System.out.println(sM.toString());
              
              
            //Impresion de juego
              System.out.println("\nEl videojuego con más horas estimadas es:");
              System.out.println(vM);
	}

}
