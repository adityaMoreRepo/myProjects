package com.example.springbootdemo.main;

import com.example.springbootdemo.annotations.MyAnno;
import com.example.springbootdemo.demoClass.TestCustomAnnotation;

public class mainDemo {
    public static void main(String[] args) {
        TestCustomAnnotation demo = new TestCustomAnnotation();
        Class<? extends TestCustomAnnotation> aClass = demo.getClass();
        MyAnno annotation = aClass.getAnnotation(MyAnno.class);
        String city = annotation.city();
        System.out.println(city);
    }
}
