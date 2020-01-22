package com.orange.roulette.domain;

import static com.orange.roulette.domain.RouletteColor.RED;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class RouletteUTest {

    private final RandomGenerator randomGenerator = mock(RandomGenerator.class);
    private final Ball ball = mock(Ball.class);
    private Roulette roulette = new Roulette(ball, randomGenerator);

    @Test
    public void should_roll_the_ball() throws InterruptedException {
        roulette.play();
        verify(ball).roll();
    }

    @Test
    public void should_return_the_result_from_random_generator() throws InterruptedException {
        when(randomGenerator.generate()).thenReturn(36);
        RouletteResult rouletteResult = roulette.play();
        assertThat(rouletteResult.number).isEqualTo("36");
        assertThat(rouletteResult.color).isEqualTo(RED);
    }


}