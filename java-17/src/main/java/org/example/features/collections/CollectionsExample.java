package org.example.features.collections;

import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
//        List<String> list = List.of("aditya", "More");
//        list.add("anything");//We can't add as list initialized above is immutable
//        list.forEach(System.out::println);
        //Now another method was to use old method
//        List<String> list2 = Arrays.asList("1", "2");
        //To make arrays mutable
        List<String> list = new ArrayList<>(List.of("Aditya", "More"));
        list.add("Kishor");
        list.forEach(System.out::println);

        //similarly we can have same implementation for Set and Maps
        Set<String> names = Set.of("Lata", "Veena", "Jaya");
        Map<Integer, String> map = Map.of(1, "One", 2, "Two");

    }
}
