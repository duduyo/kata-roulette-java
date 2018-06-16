package com.orange;

import java.util.concurrent.ThreadLocalRandom;

public class From0To36RandomGenerator implements RandomGenerator {

    public static final int RANDOM_MIN_VALUE = 0;
    public static final int RANDOM_MAX_VALUE = 36;

    @Override
    public int generate() {
        return ThreadLocalRandom.current().nextInt(RANDOM_MIN_VALUE, RANDOM_MAX_VALUE + 1);
    }
}
