package com.example.javafunctionalprogramming.tutorial.combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {
    private boolean isEmailValid(String email) {
        return email.contains("@");
    }

    private boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.length() == 12 && phoneNumber.startsWith("91");
    }

    private boolean isAdult(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears() > 18;
    }

    public boolean isValid(Customer customer) {
        return isPhoneNumberValid(customer.getPhoneNumber()) &&
                isEmailValid(customer.getEmail()) &&
                isAdult(customer.getDob());
    }
}
