package org.example.features.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestForStreams {

    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>(List.of("1", "2", "3", "4", "5", "6"));
        List<Integer> integerList = numbers.stream()
                .map(s -> Integer.valueOf(s))
                .collect(Collectors.toList());
        integerList.forEach(i -> System.out.println(i));
//        for (Integer integer : integerList) {
//            System.out.println(integer);
//        }
    }

}
