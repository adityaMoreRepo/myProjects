package com.example.springbootdemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootDemoApplicationTests {

	@Test
	void contextLoads() {
	}

    @ParameterizedTest
    @ValueSource(strings = {"test", "testString", "testString:default"})
    void testValueAnnotationTesting(String testString) {
        System.out.println(testString);

    }

    @Test
    void testValueAnnotationTesting() {
        System.out.println("testString:default");
    }



}
