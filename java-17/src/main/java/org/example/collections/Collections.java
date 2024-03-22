package org.example.collections;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collections {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(List.of(
                new Student(2, "sam"),
                new Student(2, "john"),
                new Student(4, "john"),
                new Student(4, "Lilly"),
                new Student(5, "mason")
        ));

        Map<Integer, List<Student>> groupedStudents = studentList.stream()
                .collect(Collectors.groupingBy(Student::grade));
        //how to print the map
        groupedStudents.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
