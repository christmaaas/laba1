package test.demo.parallel;

import static org.junit.jupiter.api.Assertions.*;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

class ComplexTest {

    @Test
    public void testMinus() {
        Complex a = new Complex(5, 3); // 5 + 3i
        Complex b = new Complex(2, 1); // 2 + 1i
        Complex result = a.minus(b);   // Should be 3 + 2i

        assertEquals(3, result.getRe(), 0.0001);
        assertEquals(2, result.getIm(), 0.0001);
    }

    @Test
    void testDivide() {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(1, -1);
        Complex result = c1.divide(c2);

        assertEquals(-0.5, result.getRe(), 1e-9);
        assertEquals(2.5, result.getIm(), 1e-9);
    }
}

