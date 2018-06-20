package com.orange.roulette.domain;

public class Roulette {

    private final Ball ball;
    private final RandomGenerator randomGenerator;

    public Roulette(Ball ball, RandomGenerator randomGenerator) {
        this.ball = ball;
        this.randomGenerator = randomGenerator;
    }

    public RouletteResult play() {
        ball.roll();
        return new RouletteResult(randomGenerator.generate());
    }

}
