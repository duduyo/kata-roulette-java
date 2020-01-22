package com.orange.roulette.random;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

class FromMinus1To36RandomGeneratorITest {

    private final FromMinus1To36RandomGenerator fromMinus1To36RandomGenerator = new FromMinus1To36RandomGenerator();

    @Test
    void should_generate_numbers_inside_bounds() {
        assertThat(generateResults().min().getAsInt()).isEqualTo(-1);
        assertThat(generateResults().max().getAsInt()).isEqualTo(36);
    }

    @Test
    void should_generate_all_numbers_between_bounds() {
        assertThat(generateResults().distinct().count()).isEqualTo(38);
    }

    private IntStream generateResults() {
        return IntStream.range(0, 1000).map(i -> fromMinus1To36RandomGenerator.generate());
    }
}