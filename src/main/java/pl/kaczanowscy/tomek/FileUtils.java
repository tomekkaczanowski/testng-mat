package pl.kaczanowscy.tomek;

/**
 * Sample code for Methods And Tools article about TestNG.
 * Tomasz Kaczanowski
 * http://kaczanowscy.pl/tomek
 * 2/7/12, 5:25 PM
 */
public class FileUtils {
    public static String extractFilename(String path) {
            return path.substring(path.lastIndexOf("/") + 1);
    }
}
