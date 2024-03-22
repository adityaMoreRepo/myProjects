package com.example.springbootdemo.properties;

public class Main {
    public static void main(String[] args) {
        PropertiesDemo propertiesDemo = new PropertiesDemo();
        propertiesDemo.loadProperties();
        // Get the value of the "user.home" system property
        String userHome = System.getProperty("user.home");

        // Print the result
        System.out.println("User Home Directory: " + userHome);
    }
}
