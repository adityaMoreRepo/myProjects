package com.example.javafunctionalprogramming.tutorial.funcationinterfaces;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrlSupplier.get());
    }

    static Supplier<String> getDBConnectionUrlSupplier = () -> "jdbc://localhost:5432/users";
}
