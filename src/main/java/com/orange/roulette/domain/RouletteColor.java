package com.orange.roulette.domain;

public enum RouletteColor {
    GREEN, RED, BLACK;

    private static RouletteColor[] colors = {
            GREEN,
            RED, BLACK, RED, BLACK, RED, BLACK, RED, BLACK, RED, BLACK,
            BLACK, RED, BLACK, RED, BLACK, RED, BLACK, RED,
            RED, BLACK, RED, BLACK, RED, BLACK, RED, BLACK, RED, BLACK,
            BLACK, RED, BLACK, RED, BLACK, RED, BLACK, RED
    };

    public static RouletteColor fromNumber(int inputNumber) {
        return colors[inputNumber];
    }
}
