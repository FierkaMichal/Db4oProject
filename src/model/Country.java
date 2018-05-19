package model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by Michał on 2018-05-19.
 */
public enum Country {
    Polska,
    Anglia,
    Francja,
    Hiszpania,
    Niemcy;

    private static final List<Country> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Country getRandomCountry() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
