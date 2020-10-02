package com.company.lecture8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTests {
    private Calculator calc = new Calculator();

    @Test
    void addition() {
        assertEquals(3, calc.add(1,2));
    }
}
