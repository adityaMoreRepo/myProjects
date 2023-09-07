package org.example.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TrialErrorTests {
    public static void main(String[] args) {
        //System.out.println(trial(1, 2, 3, 5, 8, 10));
//        int a[] = {1, 2, 3};
        //List<int[]> num = new ArrayList<>(List.of(a));
        //System.out.println(num.size());
//        List<Integer> list = Arrays.stream(a).boxed().toList();
//        for (Integer integer : list) {
//            System.out.println(integer);
//        }
        String[] array = {"Geeks", "forGeeks", "A computer Portal"};
        int n = Arrays.binarySearch(array, "Geeks");
        System.out.println("Index of Geeks is " + n);
    }

    public static List<Integer> trial(Integer... a) {
        return Arrays.asList(a).stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
    }

    public static <T> List<T> convertArrayToList(T array[]) {

        // Create the List by passing the Array
        // as parameter in the constructor
        List<T> list = Arrays.asList(array);

        // Return the converted List
        return list;
    }
}
