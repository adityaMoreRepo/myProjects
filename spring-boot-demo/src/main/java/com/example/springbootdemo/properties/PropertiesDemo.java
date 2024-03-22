package com.example.springbootdemo.properties;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesDemo {
    void loadProperties() {
        //get file path
        String filePath = "src/main/resources/app.properties";
        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        //load file in properties
        try {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(filePath);
            properties.load(fileInputStream);
            //get properties
            String appVersion = System.getProperty("version");
            String name = properties.getProperty("name");
            String date = properties.getProperty("date");
            System.out.println(appVersion);
            System.out.println(name);
            System.out.println(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
