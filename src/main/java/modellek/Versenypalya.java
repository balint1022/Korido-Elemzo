package modellek;

/**
 * A versenypályát reprezentáló osztály.
 * Tárolja a pálya nevét és típusát.
 */

public class Versenypalya {
    private String nev;
    private PalyaTipus tipus;

    /**
     * Versenypálya létrehozása a megadott névvel és típussal.
     *
     * @param nev A versenypálya neve
     * @param tipus A versenypálya típusa (enum)
     */

    public Versenypalya(String nev, PalyaTipus tipus) {
        this.nev = nev;
        this.tipus = tipus;
    }

    public String getNev() {
        return nev;
    }
}
