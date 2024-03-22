package org.example.features.records;

public record PersonRecord(String name, int age) {
    //And that's it!
    //If you want to implement Builder class
    public static class PersonBuilder {
        private String name;
        private int age;

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PersonRecord build() {
            return new PersonRecord(name, age);
        }
    }

}