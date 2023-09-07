package com.example.javafunctionalprogramming.tutorial.combinatorpattern;

import java.time.LocalDate;

public class CombinatorPatternTest {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "912957385929",
                "someting@foo.com",
                LocalDate.of(2000, 1, 1)
        );
        Customer customer1 = new Customer(
                "Vikas",
                "334485",
                "invalid",
                LocalDate.of(2022, 1, 1)
        );

        //By Imperative Approach
        System.out.println(new CustomerValidatorService().isValid(customer));

        //By Declarative Approach
        System.out.println(CustomerRegistrationValidator.isEmailValid().and(
                CustomerRegistrationValidator.isPhoneNumberValid()).apply(customer1));
        System.out.println(CustomerRegistrationValidator.isEmailValid().and(
                CustomerRegistrationValidator.isPhoneNumberValid())
                .and(CustomerRegistrationValidator.isAdult()).apply(customer));

        //Note ** None of this is evoked if we don't apply(). Hence, combinator is lazy by default.
    }
}
