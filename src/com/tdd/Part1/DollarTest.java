package com.tdd.Part1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DollarTest {

    // SETUP
    // EXERCISE
    // VERIFY
    // TEARDOWN
    @Test
    public void testMulitplication() {

        // SETUP
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);

        // VERIFY
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15,product.amount);
    }

    @Test
    public void testEquality() {

        // VERIFY
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}