package com.example.javafunctionalprogramming.tutorial.funcationinterfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        //Consumer
        Consumer<Person> personConsumer = person -> System.out.println(
                person.getName() + " " + person.getGender()
        );
        personConsumer.accept(new Person("Vishal", Gender.MALE));

        BiConsumer<Person, Boolean> personBiConsumer = (person, showGender) -> System.out.println(
                person.getName() + " " + (showGender ? person.getGender(): "******")
        );
        personBiConsumer.accept(new Person("Ajay", Gender.MALE), false);
    }
}
