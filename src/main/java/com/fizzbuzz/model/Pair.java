package com.fizzbuzz.model;

public final class Pair<A, B> {
    public final A a;
    public final B result;

    public Pair(final A a, final B result) {
        this.a = a;
        this.result = result;
    }

    public static <A> Pair<A, String> Left(final A a) {
        return new Pair<>(a, "No Result");
    }

    public static <B> Pair<Boolean, B> Right(final B b) {
        return new Pair<>(false, b);
    }
}