package com.fizzbuzz.divisor;

import com.fizzbuzz.model.Pair;

import static com.fizzbuzz.model.Pair.Left;

public enum Divisor {
    ;
    public static final IDivisible FIZZ = (number) -> isDivisible(number, 3) ? new Pair<>(true, "fizz") : Left(false);

    public static final IDivisible BUZZ = (number) -> isDivisible(number, 5) ? new Pair<>(true, "buzz") : Left(false);

    public static final IDivisible FIZZ_BUZZ = (number) -> isDivisible(number, 5) && isDivisible(number, 3) ? new Pair<>(true, "fizzbuzz") : Left(false);

    private static boolean isDivisible(Integer number, Integer divisor) {
        return number % divisor == 0;
    }
}
