package org.example.features.records;

public class RecordsExample {
    public static void main(String[] args) {
        //Records is a Data class, which holds data.
        //It doesn't contain any logic but just data.
        //As before we were using lots of boilerplate code.
        //then we used lombok for reducing boilerplate code.

        //Now let's create old java object
        Person John = new Person("John", 18);
        //Let's use the record
        PersonRecord Aditya = new PersonRecord("Aditya", 26);
        //How to access the members
        System.out.println(John.getName());
        System.out.println(Aditya.name());
        //Using builder pattern
        PersonRecord Vedant = new PersonRecord
                .PersonBuilder()
                .age(18)
                .name("Vedant")
                .build();
        System.out.println(Vedant.name());
    }
}
