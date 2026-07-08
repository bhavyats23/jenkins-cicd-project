package com.demo;
import org.junit.Test;
import static org.junit.Assert.*;
public class AppTest {
    @Test
    public void testGreet() {
        assertEquals("Hello and welcome, Jenkins CI/CD!", App.greet("Jenkins CI/CD"));
    }
}
