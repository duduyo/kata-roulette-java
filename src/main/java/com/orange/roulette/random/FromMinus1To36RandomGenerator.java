package com.orange.roulette.random;

import com.orange.roulette.domain.RandomGenerator;

import java.util.concurrent.ThreadLocalRandom;

public class FromMinus1To36RandomGenerator implements RandomGenerator {

    public static final int RANDOM_MIN_VALUE = -1;
    public static final int RANDOM_MAX_VALUE = 36;

    @Override
    public int generate() {
        return ThreadLocalRandom.current().nextInt(RANDOM_MIN_VALUE, RANDOM_MAX_VALUE + 1);
    }
}
