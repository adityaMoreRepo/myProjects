package com.example.javafunctionalprogramming.tutorial.callbacks;

import org.springframework.util.ObjectUtils;
import java.util.function.Consumer;

public class CallbackTest {
    public static void main(String[] args) {
        String firstName = "Aditya";
        String lastName = "More";
        hello(firstName, lastName, System.out::println);
    }

    static void hello(String firstName, String lastName, Consumer<String> myCallback) {
        System.out.println(firstName);
        if(!ObjectUtils.isEmpty(lastName)) {
            System.out.println(lastName);
        } else myCallback.accept("Last name is missing!");
    }
}

