package at.fhj.msd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    @Test
    void add() {
        Assertions.assertEquals(9.0, Calculator.add(4.0, 5.0));
        Assertions.assertEquals(-8.0, Calculator.add(-3.0, -5.0));
        Assertions.assertEquals(1.6, Calculator.add(0.8, 0.8));
    }

    @Test
    void minus() {
        Assertions.assertEquals(2.0, Calculator.minus(10.0, 8.0));
        Assertions.assertEquals(4.0, Calculator.minus(-4.0, -8.0));
        Assertions.assertEquals(5.5, Calculator.minus(6.0, 0.5));
    }


    @Test
    void divide() {
        Assertions.assertEquals(2.0, Calculator.divide(16.0, 8.0));
        Assertions.assertEquals(10.0, Calculator.divide(-100.0, -10.0));

        assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(1.0, 0);
        });
    }

    @Test
    void multiply() {
        Assertions.assertEquals(25, Calculator.multiply(5, 5));
        Assertions.assertEquals(54.0, Calculator.multiply(-9.0, -6.0));
        Assertions.assertEquals(32.8, Calculator.multiply(4.0, 8.2));
    }

    @Test
    void testFactorial() {
        Assertions.assertEquals(2, Calculator.factorial(2));
        Assertions.assertEquals(120, Calculator.factorial(5));
        Assertions.assertEquals(0, Calculator.factorial(-4));
    }

}
