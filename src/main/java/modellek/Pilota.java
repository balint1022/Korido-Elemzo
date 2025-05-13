package modellek;

import interfacek.Idomero;
import kivetel.ErvenytelenKoridoException;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

/**
 * A pilótát reprezentáló osztály, amely köridőket tud mérni és tárolni.
 * Implementálja az Idomero interfészt, így képes időadatok kezelésére.
 */
public class Pilota implements Idomero {
    private String nev;
    private Map<Integer, Double> koridok;

    /**
     * Pilóta létrehozása a megadott névvel.
     *
     * @param nev A pilóta neve
     */
    public Pilota(String nev) {
        this.nev = nev;
        this.koridok = new HashMap<>();
    }

    /**
     * Új köridőt rögzít a megadott körszámhoz.
     * Ha az idő nem pozitív, kivételt dob és az adatot nem menti el.
     *
     * @param korSzam A kör sorszáma
     * @param ido A mért idő másodpercben
     */
    @Override
    public void idoMero(int korSzam, double ido) {
        try {
            if (ido <= 0) {
                throw new ErvenytelenKoridoException("Érvénytelen köridő: " + ido);
            }
            koridok.put(korSzam, ido);
        } catch (ErvenytelenKoridoException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Visszaadja a pilóta által teljesített körök idejeit.
     *
     * @return A köridők Map objektuma, ahol a kulcs a körszám, az érték pedig az idő
     */
    public Map<Integer, Double> getKoridok() {
        return koridok;
    }

    /**
     * Visszaadja a pilóta nevét.
     *
     * @return A pilóta neve
     */
    public String getNev() {
        return nev;
    }

    /**
     * Kiírja a köridőket ranglista formájában, a leggyorsabbtól a leglassabbig rendezve.
     */
    public void koridoRanglista() {
        List<Map.Entry<Integer, Double>> ranglistaLista = new ArrayList<>(koridok.entrySet());

        // Rendezés idő szerint növekvő sorrendbe (leggyorsabb először)
        Collections.sort(ranglistaLista, new Comparator<Map.Entry<Integer, Double>>() {
            @Override
            public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        System.out.println("\n--- " + nev + " köridő ranglista ---");
        System.out.println("-\tKör\t\tIdő (mp)");

        int helyezes = 1;
        for (Map.Entry<Integer, Double> entry : ranglistaLista) {
            System.out.printf("%d.\t\t%d\t\t%.2f\n", helyezes, entry.getKey(), entry.getValue());
            helyezes++;
        }

        System.out.println("-----------------------------");
    }
}