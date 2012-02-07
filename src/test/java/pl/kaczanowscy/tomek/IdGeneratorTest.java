package pl.kaczanowscy.tomek;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

import static org.testng.Assert.*;

/**
 * Sample code for Methods And Tools article about TestNG.
 * Tomasz Kaczanowski
 * http://kaczanowscy.pl/tomek
 * 2/7/12, 5:25 PM
 */
@Test
public class IdGeneratorTest {
        private IdGenerator idGen = new IdGenerator();
        private Set<Long> ids = new HashSet<Long>(100);

        @Test(threadPoolSize = 7, invocationCount = 100)
        public void idsAreUnique() {
            assertTrue(ids.add(idGen.nextId()));
        }
    }