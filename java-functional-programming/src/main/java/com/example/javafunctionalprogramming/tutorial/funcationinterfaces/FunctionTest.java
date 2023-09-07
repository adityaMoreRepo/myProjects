package com.example.javafunctionalprogramming.tutorial.funcationinterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        //Function
//        int increment = incrementByOneFunction.apply(0);
//        System.out.println(increment);
//        int incrementAndMultiply = incrementByOneFunction.andThen(multiplyBy10Function).apply(1);
//        System.out.println(incrementAndMultiply);
//        System.out.println(incrementByOneFunction.andThen(multiplyBy10Function).apply(1));
//        System.out.println(incrementByOneFunction.compose(multiplyBy10Function).apply(1));
//        System.out.println(incrementByOneFunction.andThen(multiplyBy10Function).andThen(incrementByOneFunction).apply(5));

        //BiFunction
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 100));
        System.out.println(incrementByOneAndMultiplyBiFunction.andThen(incrementByOneFunction).apply(4, 100));
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction = (numberToIncrementByOne, numberToMultiplyBy)
            -> (numberToIncrementByOne + 1) * numberToMultiplyBy;
}
