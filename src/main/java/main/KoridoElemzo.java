package main;

import modellek.Pilota;
import modellek.Versenypalya;
import modellek.PalyaTipus;
import seged.FileKezelo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A program fő osztálya, amely demonstrálja a köridők mérését és tárolását.
 * Pilótákat és versenypályát hoz létre, majd köridőket rögzít és menti azokat.
 */
public class KoridoElemzo {
    /**
     * A program belépési pontja.
     *
     */
    public static void main(String[] args) {
        // Versenyzők létrehozása
        Pilota pilota1 = new Pilota("Takumi Fujiwara");
        Pilota pilota2 = new Pilota("Keisuke Takahashi");
        Pilota pilota3 = new Pilota("Ryosuke Takahashi");

        // Versenypálya létrehozása
        Versenypalya palya = new Versenypalya("Akina", PalyaTipus.ASZFALT);

        pilota1.idoMero(1, 81.5);
        pilota1.idoMero(2, 82.2);
        pilota1.idoMero(3, 80.8);
        pilota1.idoMero(4, 79.9);
        pilota1.idoMero(5, 83.3);
        pilota1.idoMero(6, 90.0);  // Hibás idő

        pilota2.idoMero(1, 76.5);
        pilota2.idoMero(2, 77.2);
        pilota2.idoMero(3, 75.8);
        pilota2.idoMero(4, 74.9);
        pilota2.idoMero(5, 78.0);

        pilota3.idoMero(1, 85.0);
        pilota3.idoMero(2, 86.2);
        pilota3.idoMero(3, 84.5);
        pilota3.idoMero(4, 83.4);
        pilota3.idoMero(5, 87.0);

        // Pilóták listája
        List<Pilota> pilotak = new ArrayList<>();
        pilotak.add(pilota1);
        pilotak.add(pilota2);
        pilotak.add(pilota3);

        for (Pilota pilota : pilotak) {
            pilota.koridoRanglista();
        }

        // Köridők mentése fájlba
        try {
            FileKezelo.mentJSON("pilotakoridok.json", pilota1.getKoridok());
            System.out.println("Köridők sikeresen mentve a pilotakoridok.json fájlba.");
        } catch (IOException e) {
            System.out.println("Hiba a fájlmentés során: " + e.getMessage());
        }
    }
}
