package com.aditya.language_app;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class SayHelloTest {

    @Test
    void main() throws IOException {
        SayHello.main(new String[]{"en"});
    }
}