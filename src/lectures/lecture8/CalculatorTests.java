package lectures.lecture8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Testing Calculator")
public class CalculatorTests {


    @Test
    @DisplayName("Testing that addition works")
    void add() {
        assertEquals(3, Calculator.add(1,2));
        assertEquals(5, Calculator.add(-5,10));
        assertEquals(140000, Calculator.add(70000, 70000));
        assertEquals(1400000, Calculator.add(700000, 700000));
    }

    @Test
    @DisplayName("Testing subtraction")
    void sub() {
        assertEquals(1, Calculator.sub(3,2));
        assertEquals(5, Calculator.sub(10,5));
        assertEquals(10, Calculator.sub(20,10));
        assertEquals(-1000000, Calculator.sub(1000000,2000000));
    }

    @Test
    @DisplayName("Testing multiplication")
    void multiply() {
        assertEquals(5, Calculator.multiply(1,5));
        assertEquals(100, Calculator.multiply(5,20));
        assertEquals(500, Calculator.multiply(100,5));
        assertEquals(5000000, Calculator.multiply(1000000,5));
    }

    @Test
    @DisplayName("Testing division")
    void div() {
        assertEquals(5, Calculator.div(10,2));
        assertEquals(-5, Calculator.div(10,-2));
        assertEquals(200, Calculator.div(400, 2));
    }

    @Test
    @DisplayName("Testing modulo")
    void modulo() {
        assertEquals(0, Calculator.modulo(10, 10));
        assertEquals(1, Calculator.modulo(10,3));
        assertEquals(2, Calculator.modulo(10,8));
    }

    @Test
    @DisplayName("Testing max value")
    void max() {
        assertEquals(2, Calculator.max(0,2));
        assertEquals(5, Calculator.max(4,5));
        assertEquals(100, Calculator.max(-100,100));
    }

    @Test
    @DisplayName("Testing √, sqrt")
    void Sqrt() {
        assertEquals(4, Calculator.sqrt(16, 4));
        assertEquals(5, Calculator.sqrt(25, 5));
        assertEquals(10, Calculator.sqrt(100, 10));
    }

    @Test
    @DisplayName("Testing that an exception is thrown")
    void throwException() {
        Calculator calc = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calc.throwException());
    }
}