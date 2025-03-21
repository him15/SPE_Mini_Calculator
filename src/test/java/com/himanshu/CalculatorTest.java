package com.himanshu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    public Calculator  calc = new Calculator();

    @Test
    public void test_sqrt_positive() {
        double x = 4.0;
        double expectedResult = 2.0;
        Assertions.assertEquals(expectedResult, calc.sqrt(x), 0.001);
    }


    @Test
    public void test_sqrt_negative() {
        double x = -4.0;
        double expectedResult = Double.NaN;
        Assertions.assertEquals(expectedResult, calc.sqrt(x), 0.001);
    }

    @Test
    public void test_factorial_positive() {
        int x = 5;
        long expectedResult = 120;
        Assertions.assertEquals(expectedResult, calc.fact(x));
    }

    @Test
    public void test_factorial_negative() {
        int x = -4;
        long expectedResult = -1;
        Assertions.assertEquals(expectedResult, calc.fact(x));
    }

    @Test
    public void test_factorial_zero(){
        int x = 0;
        long expectedResult = 1;
        Assertions.assertEquals(expectedResult, calc.fact(x));
    }

    @Test
    public void test_ln_positive() {
        double x = Math.E;
        double expectedResult = 1.0;  // ln(e) = 1
        Assertions.assertEquals(expectedResult, calc.ln(x), 0.001);
    }

    @Test
    public void test_ln_zero() {
        double x = 0.0;
        double expectedResult = Double.NaN;  // ln(0) is undefined
        Assertions.assertEquals(expectedResult, calc.ln(x), 0.001);
    }

    @Test
    public void test_ln_negative_input() {
        double x = -2.0;
        double expectedResult = Double.NaN;  // ln of negative number is undefined
        Assertions.assertEquals(expectedResult, calc.ln(x), 0.001);
    }

    @Test
    public void test_power_positive() {
        double x = 2.0;
        double y = 4.0;
        double expectedResult = 16.0;
        Assertions.assertEquals(expectedResult, calc.power(x, y), 0.001);
    }

    @Test
    public void test_power_zero_exponent() {
        double x = 5.0;
        double y = 0.0;
        double expectedResult = 1.0;  // Any number to the power of 0 is 1
        Assertions.assertEquals(expectedResult, calc.power(x, y), 0.001);
    }

    @Test
    public void test_power_negative_exponent() {
        double x = 2.0;
        double y = -2.0;
        double expectedResult = 0.25;  // 2^-2 = 1/4
        Assertions.assertEquals(expectedResult, calc.power(x, y), 0.001);
    }
}