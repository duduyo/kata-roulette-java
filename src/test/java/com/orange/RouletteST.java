package com.orange;

import org.junit.jupiter.api.Test;

import static java.lang.System.currentTimeMillis;
import static org.assertj.core.api.Assertions.assertThat;

public class RouletteST {


    private static final long ROLL_DURATION_MILLIS = 100L;

    private final RandomGenerator from0To36RandomGenerator = new From0To36RandomGenerator();
    private final Ball ball = new Ball(ROLL_DURATION_MILLIS);
    private Roulette roulette = new Roulette(ball, from0To36RandomGenerator);

    @Test
    public void should_roll_during_20s_and_return_a_result() {
        // given
        long startTimeMillis = currentTimeMillis();
        // when
        int result = roulette.play();
        long durationMillis = currentTimeMillis() - startTimeMillis;
        // then
        assertThat(durationMillis).isBetween(ROLL_DURATION_MILLIS, ROLL_DURATION_MILLIS + 100);
        assertThat(result).isBetween(0, 36);
    }

}