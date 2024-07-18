package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class SimpleTestTest {

    @Test
    public void multest() {
        SimpleTest st = new SimpleTest();
        assertEquals(25, st.multiple(5, 5));
    }

    @Test
    public void divtest() {
        SimpleTest st = new SimpleTest();
        assertEquals(5.0, st.divide(25.0, 5.0), 0.1);
    }

    @Test
    public void divzerotest() {
        SimpleTest st = new SimpleTest();
        assertEquals(0, st.divide(25.0, 0), 0.1);
    }

    @Test
    public void facttest() {
        SimpleTest st = new SimpleTest();
        assertEquals(120, st.factorial(5));
    }
}
