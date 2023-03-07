package com.aditya.language_app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class SayHello {
    public static void main(String[] args) throws IOException {
        String language = args[0];
        //get the particular language.txt file from java classpath
        //src/main/resources
        InputStream inputStream = SayHello.class
                .getClassLoader().getResourceAsStream(language + ".txt");
        //Assert if true
        assert inputStream !=null;
        //read the file
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        System.out.println(bufferedReader.readLine());
    }
}
