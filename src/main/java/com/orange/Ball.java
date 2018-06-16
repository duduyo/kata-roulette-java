package com.orange;

public class Ball {
    private final long rollDurationMillis;

    public Ball(long rollDurationMillis) {
        this.rollDurationMillis = rollDurationMillis;
    }

    public void roll() {
        try {
            Thread.sleep(rollDurationMillis);
        } catch (InterruptedException e) {
        }
    }
}
