package com.orange;

import org.junit.jupiter.api.Test;

import static java.lang.System.currentTimeMillis;
import static org.assertj.core.api.Assertions.assertThat;

class BallIT {

    private static final long ROLL_DURATION_MILLIS = 100L;

    private final Ball ball = new Ball(ROLL_DURATION_MILLIS);

    @Test
    public void should_roll_during_expected_duration() {
        // given
        long startTimeMillis = currentTimeMillis();
        // when
        ball.roll();
        long durationMillis = currentTimeMillis() - startTimeMillis;
        // then
        assertThat(durationMillis).isBetween(ROLL_DURATION_MILLIS, ROLL_DURATION_MILLIS + 10);
    }

}