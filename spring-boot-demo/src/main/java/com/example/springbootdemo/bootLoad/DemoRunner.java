package com.example.springbootdemo.bootLoad;

import com.example.springbootdemo.demoClass.ValueAnnotationTesting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoRunner implements CommandLineRunner {
    @Autowired
    private ValueAnnotationTesting valueAnnotationTesting;
    @Override
    public void run(String... args) throws Exception {
        System.out.println(valueAnnotationTesting.getTestString());
    }
}
