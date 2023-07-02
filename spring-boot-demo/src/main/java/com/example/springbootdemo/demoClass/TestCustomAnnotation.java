package com.example.springbootdemo.demoClass;

import com.example.springbootdemo.annotations.MyAnno;

@MyAnno(city = "Pune", name = "Tejas", value = 12)
public class TestCustomAnnotation {
    //At run time we can process this annotations using reflection
}
