package com.orange.roulette.timer;

import static java.lang.System.currentTimeMillis;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BallTimerITest {

    private static final long ROLL_DURATION_MILLIS = 100L;

    private final BallTimer ballTimer = new BallTimer(ROLL_DURATION_MILLIS);

    @Test
    public void should_roll_during_expected_duration() {
        // given
        long startTimeMillis = currentTimeMillis();
        // when
        ballTimer.roll();
        long durationMillis = currentTimeMillis() - startTimeMillis;
        // then
        assertThat(durationMillis).isBetween(ROLL_DURATION_MILLIS, ROLL_DURATION_MILLIS + 10);
    }

}