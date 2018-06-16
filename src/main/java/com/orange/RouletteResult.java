package com.orange;

import static java.lang.String.valueOf;

public class RouletteResult {
    public final String number;

    public RouletteResult(int number) {
        this.number = valueOf(number);
    }
}
