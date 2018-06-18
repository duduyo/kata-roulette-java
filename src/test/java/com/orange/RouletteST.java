package com.orange;

import org.junit.jupiter.api.Test;

import static com.orange.RouletteColor.BLACK;
import static com.orange.RouletteColor.GREEN;
import static java.lang.System.currentTimeMillis;
import static org.assertj.core.api.Assertions.assertThat;

public class RouletteST {


    private static final long ROLL_DURATION_MILLIS = 100L;

    private final RandomGenerator from0To36RandomGenerator = new FromMinus1To36RandomGenerator();
    private final Ball ball = new Ball(ROLL_DURATION_MILLIS);
    private Roulette roulette = new Roulette(ball, from0To36RandomGenerator);

    @Test
    public void should_roll_during_20s_and_return_a_result() {
        // given
        long startTimeMillis = currentTimeMillis();
        // when
        RouletteResult result = roulette.play();
        long durationMillis = currentTimeMillis() - startTimeMillis;
        // then
        assertThat(durationMillis).isBetween(ROLL_DURATION_MILLIS, ROLL_DURATION_MILLIS + 100);
        assertThat(result.number).matches("00|[0-9]|1[0-9]|2[0-9]|3[0-6]");
        assertThat(result.color).isBetween(GREEN, BLACK);
    }

}