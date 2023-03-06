package org.example.features.nullpointerEx;

import org.example.features.records.Person;

public class NullPointerException {

    public static void main(String[] args) {
        //Earlier we will get null pointer exception is any field or reference is not
        //pointing to any valid resource, but it was not specific.
//        Person person = new Person("Aditya", 1);
//        System.out.println(person.getName().toLowerCase());
        //If we make name as null
        //Now we have specific null pointer exception which says name is null
//        Person person = new Person(null, 1);
//        System.out.println(person.getName().toLowerCase());

        //Here it specifically says person is null in the exception.
        Person person = null;
        System.out.println(person.getName().toLowerCase());

    }
}
