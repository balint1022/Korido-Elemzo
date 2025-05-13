package seged;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.File;
import java.io.IOException;

/**
 * Segédosztály fájlműveletek végrehajtására.
 * Lehetővé teszi objektumok mentését JSON és XML formátumban.
 */

public class FileKezelo {
    /** ObjectMapper a JSON műveletek végrehajtásához */
    private static final ObjectMapper jsonMapper = new ObjectMapper();
    /** XmlMapper az XML műveletek végrehajtásához */
    private static final XmlMapper xmlMapper = new XmlMapper();

    /**
     * Objektum mentése JSON formátumban.
     *
     * @param fajlNev A létrehozandó fájl neve
     * @param objektum A mentendő objektum
     * @throws IOException Ha a fájlműveletek során hiba lép fel
     */
    public static void mentJSON(String fajlNev, Object objektum) throws IOException {
        jsonMapper.writeValue(new File(fajlNev), objektum);
    }

    /**
     * Objektum mentése XML formátumban.
     *
     * @param fajlNev A létrehozandó fájl neve
     * @param objektum A mentendő objektum
     * @throws IOException Ha a fájlműveletek során hiba lép fel
     */
    public static void mentXML(String fajlNev, Object objektum) throws IOException {
        xmlMapper.writeValue(new File(fajlNev), objektum);
    }
}