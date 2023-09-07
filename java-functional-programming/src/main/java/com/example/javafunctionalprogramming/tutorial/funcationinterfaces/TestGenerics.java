package com.example.javafunctionalprogramming.tutorial.funcationinterfaces;

import java.util.List;
import java.util.stream.Stream;

import static com.example.javafunctionalprogramming.tutorial.funcationinterfaces.Gender.FEMALE;
import static com.example.javafunctionalprogramming.tutorial.funcationinterfaces.Gender.MALE;

public class TestGenerics {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Alisha", FEMALE),
                new Person("Vikas", MALE),
                new Person("Omkar", MALE),
                new Person("Nisha", FEMALE)
        );

        int noOfFemale = people.stream()
                .filter(p -> p.getGender().equals(FEMALE)).toList().size();
        System.out.println(noOfFemale);

//        List<String> list = people.stream()
//                .flatMap(person -> Stream.of(person.getName())).toList();
        people.stream()
                .flatMap(person -> Stream.of(person.getName())).forEach(System.out::println);
        people.stream()
                .map(Person::getName)
                .mapToInt(String::length)
                .forEach(System.out::println);

        Boolean containsOnlyFemale = people.stream()
                .allMatch(person -> FEMALE.equals(person.getGender()));
        System.out.println(containsOnlyFemale);
        Boolean containsAtLeastOneFemale = people.stream()
                .anyMatch(person -> FEMALE.equals(person.getGender()));
        System.out.println(containsAtLeastOneFemale);
    }
}
