package com.demo;
import org.junit.Test;
import static org.junit.Assert.*;
public class AppTest {
    @Test
    public void testGreet() {
        assertEquals("Hello! Welcome to Jenkins CI/CD!", App.greet("Jenkins CI/CD"));
    }
}
