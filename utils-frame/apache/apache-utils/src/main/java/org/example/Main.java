package org.example;

import java.util.function.IntFunction;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.range(0,10).filter((num)->num>5).flatMap(new IntFunction<IntStream>() {
            @Override
            public IntStream apply(int value) {
                return IntStream.range(1,10);
            }
        }).forEach(System.out::println);
    }

}