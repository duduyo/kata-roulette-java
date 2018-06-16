package com.orange;

import org.junit.jupiter.api.Test;

import static com.orange.Roulette.ROLLING_DURATION_MILLIS;
import static java.lang.System.currentTimeMillis;
import static org.assertj.core.api.Assertions.assertThat;

public class RouletteTest {


    private final RandomGenerator from0To36RandomGenerator = new From0To36RandomGenerator();
    private Roulette roulette = new Roulette(from0To36RandomGenerator);

    @Test
    public void should_roll_during_20s_and_return_a_result() throws InterruptedException {
        // given
        long startTimeMillis = currentTimeMillis();
        // when
        int result = roulette.roll();
        long durationMillis = currentTimeMillis() - startTimeMillis;
        // then
        assertThat(durationMillis).isBetween(ROLLING_DURATION_MILLIS, ROLLING_DURATION_MILLIS + 100);
        assertThat(result).isBetween(0, 36);
    }

}