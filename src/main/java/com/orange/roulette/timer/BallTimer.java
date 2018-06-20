package com.orange.roulette.timer;

import com.orange.roulette.domain.Ball;

public class BallTimer implements Ball {
    private final long rollDurationMillis;

    public BallTimer(long rollDurationMillis) {
        this.rollDurationMillis = rollDurationMillis;
    }

    @Override
    public void roll() {
        try {
            Thread.sleep(rollDurationMillis);
        } catch (InterruptedException e) {
        }
    }
}
