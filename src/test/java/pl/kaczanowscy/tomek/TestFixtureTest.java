package pl.kaczanowscy.tomek;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Sample code for Methods And Tools article about TestNG.
 * Tomasz Kaczanowski
 * http://kaczanowscy.pl/tomek
 * 2/7/12, 5:25 PM
 */
@Test
public class TestFixtureTest {
    
    private Server server;
    @BeforeSuite(timeOut = 1000)
    public void setUpServer() {
        server = new Server();
        server.start();
        System.out.println("server start");
    }
    
    @BeforeMethod
    public void setUpClient() {
        Client client = new Client();
        System.out.println("new client created");
    }
    
    public void testA() {
        System.out.println("test A");
    }
    
    public void testB() {
        System.out.println("test B");
    }
    
    @AfterSuite
    public void shutDownServer() {
        server.stop();
        System.out.println("server stop");
    }
}
