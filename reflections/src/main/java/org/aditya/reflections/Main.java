package org.aditya.reflections;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//Reflections are used to peek into the structure of the Cat class
public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Cat myCat = new Cat("Stella", 6);
        //If you want to get something for that class fist get the class object of that class
        //getClass is window to all the reflections java offer
        //Reflections are very powerful tool. We should handle them carefully.

        // == Fields ==
//        Field[] catFields = myCat.getClass().getDeclaredFields();
        /*A field is a class, interface, or enum with an associated value. Methods in the java. lang. reflect.
        Field class can retrieve information about the field, such as its name, type, modifiers, and annotations.
         */
//        for(Field field : catFields){
//            System.out.println(field.getName());
//        }
        //Now here is the catch we can get the names of fields, but we have private fields who are only
        //be accessible by accessor and mutator methods i.e. getter and setter.
        //but name is final hence it is only allows to get not set. It's only going to set during initialization.
        //We have absolutely no way to change final fields, but with reflections we can force change these fields.
//        for(Field field : catFields){
//            if(field.getName().equals("name")){
//                field.setAccessible(true);//we can set private and final fields accessible
//                field.set(myCat, "Jimmy");//this is forcing to change the name of myCat which is private and final
//            }
//        }
//        System.out.println(myCat.getName());

        //== Methods ==

        // private method
        Method[] catMethods = myCat.getClass().getDeclaredMethods();
//        for(Method method : catMethods){
//            method.setAccessible(true);
//            //use reflection to trigger private method that we don't have access for
//            if(method.getName().equals("heyThis IsPrivate")){
//                method.invoke(myCat);//if method had paras then : method.invoke(object, para1, para2, ..)
//            }
//        }

        // public static methods
        for(Method method : catMethods){
            method.setAccessible(true);
            if(method.getName().equals("thisIsPublicStaticMethod")){
                method.invoke(null);//for public static method no objects is needed.
            }
        }
        //similar for private and static

        //This is great! and kind of gives a birds eye view about our program and classes and objects.
        //But, it kind of leaves a question Why would you use this?
        //Reflections give meta level abilities :). It sort of changes classes at the runtime.
        //It is heavily used in frameworks like spring.
        //It has to be compatible with the code that hasn't been created yet.
        //A basic use case would be : Let's say we have a private method that tinkers around the
        //others methods and fields in the class. If we want to test this method then we can make use of reflections. 😊


        //Downside of the Reflections:
        //It can easily break the code.
        //Can cause lots of bugs
        //Because it uses runtime it causes sluggishness in the code.

    }

}
