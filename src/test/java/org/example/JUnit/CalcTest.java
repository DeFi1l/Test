package org.example.JUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    private static Calc calc;

    @BeforeAll
    public static void setUp() {
        calc = new Calc();
    }

    @org.junit.jupiter.api.Test
    void add() {
        int expected = 15;
        int result = calc.add(10, 5);
        assertEquals(expected, result);

        int expected1 = 150;
        int result1 = calc.add(100, 50);
        assertEquals(expected1, result1);
    }

    @Test
    void minus() {
        int expected = 10;
        int result = calc.minus(15, 5);
        assertEquals(expected, result);
    }

    @Test
    void multiply() {
        double expected = 75;
        double result = calc.multiply(15, 5);
        assertEquals(expected, result, 0.001);
    }

    @Test
    void divide() {
        double expected = 3;
        double result = calc.divide(15, 5);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void addString() {
        double expected = 15;
        double result = calc.add("10", "5");
        assertEquals(expected, result, 0.001);
    }

//    @Test()
//    public void addWrongValueToStringThenException() {
//        Throwable exception = assertThrows(NumberFormatException.class, this::addWrongValueToStringThenException);
//        calc.add("aaasd", "5");
//        assertEquals("Format", exception.getMessage());
//    }

    @AfterAll
    public static void close() {
        calc = null;
    }
}