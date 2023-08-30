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

        // VERIFY
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15),  five.times(3));
    }

    @Test
    public void testEquality() {

        // VERIFY
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}