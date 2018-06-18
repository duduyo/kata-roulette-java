package com.orange;

import org.junit.jupiter.api.Test;

import static com.orange.RouletteColor.RED;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class RouletteUT {

    private final RandomGenerator from0To36RandomGenerator = mock(RandomGenerator.class);
    private final Ball ball = mock(Ball.class);
    private Roulette roulette = new Roulette(ball, from0To36RandomGenerator);

    @Test
    public void should_roll_the_ball() throws InterruptedException {
        roulette.play();
        verify(ball).roll();
    }

    @Test
    public void should_return_the_result_from_random_generator() throws InterruptedException {
        when(from0To36RandomGenerator.generate()).thenReturn(36);
        RouletteResult rouletteResult = roulette.play();
        assertThat(rouletteResult.number).isEqualTo("36");
        assertThat(rouletteResult.color).isEqualTo(RED);
    }


}