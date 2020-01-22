package com.orange.roulette.domain;

import static com.orange.roulette.domain.RouletteColor.BLACK;
import static com.orange.roulette.domain.RouletteColor.GREEN;
import static com.orange.roulette.domain.RouletteColor.RED;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class RouletteResultUTest {

    private static RouletteColor[] colors = {
            GREEN,
            RED, BLACK, RED, BLACK, RED, BLACK, RED, BLACK, RED, BLACK,
            BLACK, RED, BLACK, RED, BLACK, RED, BLACK, RED,
            RED, BLACK, RED, BLACK, RED, BLACK, RED, BLACK, RED, BLACK,
            BLACK, RED, BLACK, RED, BLACK, RED, BLACK, RED
    };

    @Test
    void should_return_result_for_00() {
        RouletteResult rouletteResult = new RouletteResult(-1);
        assertThat(rouletteResult.number).isEqualTo("00");
        assertThat(rouletteResult.color).isEqualTo(GREEN);
    }

    @Test
    void should_return_result_for_0() {
        RouletteResult rouletteResult = new RouletteResult(0);
        assertThat(rouletteResult.number).isEqualTo("0");
        assertThat(rouletteResult.color).isEqualTo(GREEN);
    }

    @Test
    void should_return_result_for_black_and_red_numbers() {
        for (int currentNumber = 1; currentNumber <= 36; currentNumber++) {
            assertRouletteResultForNumber(currentNumber);
        }
    }

    private void assertRouletteResultForNumber(int currentNumber) {
        RouletteResult rouletteResult = new RouletteResult(currentNumber);
        assertThat(rouletteResult.number).isEqualTo(String.valueOf(currentNumber));
        assertThat(rouletteResult.color).isEqualTo(colors[currentNumber]);
    }
}