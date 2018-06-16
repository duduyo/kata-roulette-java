package com.orange;

public class Roulette {

    public static final long ROLLING_DURATION_MILLIS = 20000L;
    private final RandomGenerator randomGenerator;

    public Roulette(RandomGenerator randomGenerator) {
        this.randomGenerator = randomGenerator;
    }

    public int roll() throws InterruptedException {
        Thread.sleep(ROLLING_DURATION_MILLIS);
        return randomGenerator.generate();
    }

}
