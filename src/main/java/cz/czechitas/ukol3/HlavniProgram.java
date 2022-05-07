package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");

        Pocitac katcinPocitac = new Pocitac();


        Procesor katcinProcesor = new Procesor();
        katcinProcesor.setVyrobce("Ryzen");
        katcinProcesor.setRychlostProcesoru(2_900_000_000_000L);

        Pamet katcinaPamet = new Pamet();
        katcinaPamet.setKapacitaPameti(16_000_000_000L);

        Disk katcinDisk = new Disk();
        katcinDisk.setKapacitaDisku(212_000_000_000L);

        katcinPocitac.setCpu(katcinProcesor);
        katcinPocitac.setRam(katcinaPamet);
        katcinPocitac.setPevnyDisk(katcinDisk);

        System.out.println(katcinPocitac.toString());

    }

}
