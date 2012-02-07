package pl.kaczanowscy.tomek;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Sample code for Methods And Tools article about TestNG.
 * Tomasz Kaczanowski
 * http://kaczanowscy.pl/tomek
 * 2/7/12, 5:25 PM
 */
public class IdGenerator {
    private static final AtomicLong nextId = new AtomicLong(System
            .currentTimeMillis());

    public Long nextId() {
        return nextId.getAndIncrement();
    }
}
