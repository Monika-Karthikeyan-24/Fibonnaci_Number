
package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    App app = new App();

    @Test
    public void testFibonacciSeries() {
        assertArrayEquals(
            new int[]{0, 1, 1, 2, 3},
            app.fibonacci(5)
        );
    }

    @Test
    public void testEmptySeries() {
        assertArrayEquals(new int[]{}, app.fibonacci(0));
    }

    @Test
    public void testNegativeNumber() {
        try {
            app.fibonacci(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }
}
