package com.fizzbuzz.divisor;

import com.fizzbuzz.model.Pair;

@FunctionalInterface
public interface IDivisible {
    Pair<Boolean, String> representationFor(Integer number);
}
