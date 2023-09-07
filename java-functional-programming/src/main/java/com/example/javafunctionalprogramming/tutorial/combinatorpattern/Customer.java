package com.example.javafunctionalprogramming.tutorial.combinatorpattern;

import java.time.LocalDate;

public class Customer {
    private final String name;
    private final String phoneNumber;
    private final String email;
    private final LocalDate dob;

    public Customer(String name, String phoneNumber, String email, LocalDate dob) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.dob = dob;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
