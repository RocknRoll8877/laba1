package test.java.demo.parallel;

import demo.parallel.Complex;
import org.junit.Test;
import static org.junit.Assert.*;

public class ComplexTest {

    @Test
    public void testSquare() {
        Complex c = new Complex(1, 2);
        Complex result = c.square();
        assertEquals(-3.0, result.getRe(), 1e-9);
        assertEquals(4.0, result.getIm(), 1e-9);
    }

    @Test
    public void testConjugate() {
        Complex c = new Complex(3, -4);
        Complex result = c.conjugate();
        assertEquals(3.0, result.getRe(), 1e-9);
        assertEquals(4.0, result.getIm(), 1e-9);
    }

    @Test
    public void testDivide() {
        Complex c1 = new Complex(4, 2);
        Complex c2 = new Complex(1, -1);
        Complex result = c1.divide(c2);
        assertEquals(1.0, result.getRe(), 1e-9);
        assertEquals(3.0, result.getIm(), 1e-9);
    }
}