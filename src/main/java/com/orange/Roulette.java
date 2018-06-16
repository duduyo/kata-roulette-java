package com.orange;

public class Roulette {

    private final Ball ball;
    private final RandomGenerator randomGenerator;

    public Roulette(Ball ball, RandomGenerator randomGenerator) {
        this.ball = ball;
        this.randomGenerator = randomGenerator;
    }

    public RouletteResult play() {
        ball.roll();
        RouletteResult rouletteResult = new RouletteResult(randomGenerator.generate());
        return rouletteResult;
    }

}
