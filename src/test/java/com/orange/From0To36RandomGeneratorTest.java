package com.orange;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.orange.From0To36RandomGenerator.RANDOM_MAX_VALUE;
import static com.orange.From0To36RandomGenerator.RANDOM_MIN_VALUE;
import static org.assertj.core.api.Assertions.assertThat;

class From0To36RandomGeneratorTest {

    @Test
    void should_generate_numbers_between_0_and_36() {
        From0To36RandomGenerator from0To36RandomGenerator = new From0To36RandomGenerator();

        Boolean[] results = new Boolean[RANDOM_MAX_VALUE + 1];
        for (int i = 0; i < 500; i++) {
            int result = from0To36RandomGenerator.generate();
            assertThat(result).isBetween(RANDOM_MIN_VALUE, RANDOM_MAX_VALUE);
            results[result] = Boolean.TRUE;
        }
        assertThat(Arrays.stream(results).allMatch(res -> res == Boolean.TRUE)).isTrue();
    }
}