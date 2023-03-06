package org.example.features.varExample;

import java.util.function.Consumer;

public class VarExample {
//    var something; //It won't work
//    var str = "something";//This also won't work
    public static void main(String[] args) {
        //Everytime we initialized a var we must declare its type
        //But in Java 10 a new feature call type inference was used.
        int a =10;
        String name = "Something";
        //Now using var, we can infer the type automatically
        var name1 = "Aditya";
        //We need to initialize the variable
        //var name3; won't work
        //Also only local declarations work and not fields

    }

}
