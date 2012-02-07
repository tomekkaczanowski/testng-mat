package pl.kaczanowscy.tomek;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Sample code for Methods And Tools article about TestNG.
 * Tomasz Kaczanowski
 * http://kaczanowscy.pl/tomek
 * 2/7/12, 5:25 PM
 */
public class FileUtilsTest {

    @DataProvider
    private static final Object[][] filePaths(){
        return new Object[][] {
                {"file.txt", "file.txt"},
                {"/absolute/path/somefile.csv", "somefile.csv"},
                {"relative/path/myfile.zip", "myfile.zip"}};
    }

    @Test(dataProvider = "filePaths")
    public void shouldExtractFileFromPath(String path, String expectedFileName) {
        assertEquals(FileUtils.extractFilename(path), expectedFileName);
    }
}
