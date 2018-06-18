package com.orange;

import static com.orange.RouletteColor.GREEN;
import static java.lang.String.valueOf;

public class RouletteResult {
    public final String number;
    public final RouletteColor color;

    public RouletteResult(int inputNumber) {

        this.number = calculateNumber(inputNumber);
        this.color = calculateColor(inputNumber);
    }

    private String calculateNumber(int inputNumber) {
        return inputNumber == -1 ? "00" : valueOf(inputNumber);
    }

    private RouletteColor calculateColor(int inputNumber) {
        return inputNumber == -1 ? GREEN : RouletteColor.fromNumber(inputNumber);
    }
}
