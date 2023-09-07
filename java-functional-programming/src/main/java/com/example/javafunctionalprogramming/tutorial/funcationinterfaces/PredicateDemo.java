package com.example.javafunctionalprogramming.tutorial.funcationinterfaces;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09009877300"));
        System.out.println(isPhoneNumberValidPredicate.test("0900987730"));
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;
}
