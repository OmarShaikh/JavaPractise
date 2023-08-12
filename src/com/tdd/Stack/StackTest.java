package com.tdd.Stack;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

class StackTest {

    // SETUP
    // EXERCISE
    // VERIFY
    // TEARDOWN

    private final Object object1 = new Object();
    private final Object object2 = new Object();
    private Stack stack;

    @BeforeEach
    public void init() {
        stack = new Stack();
    }

    @Test
    public void testPushItemToStack(){
        // SETUP
        stack.push(object1);

        // VERIFY
        assertEquals(object1, stack.peek());
    }

    @Test
    public void testStackFullWhilePushingNewItemToStack(){
        // SETUP
        RuntimeException thrown = assertThrows(RuntimeException.class, () -> {
            stack.push(object1);
            stack.push(object1);
            stack.push(object1);
            stack.push(object1);
            stack.push(object1);
            stack.push(object1);
            stack.push(object1);
            stack.push(object1);
            stack.push(object1);
            stack.push(object1);
            stack.push(object1);
        });

        // VERIFY
        assertEquals("Stack is full", thrown.getMessage());
    }

    @Test
    public void testPopItemWhenStackEmpty() {
        // SETUP
        Stack emptyStack = new Stack();

        // VERIFY
        assertThrows(EmptyStackException.class, emptyStack::pop);
    }

    @Test
    public void testPopLastItemPushed() {
        // SETUP
        stack.push(object1);

        // VERIFY
        assertEquals(object1, stack.pop());
    }

    @Test
    public void testPopLastTwoItemsPushed() {
        // SETUP
        stack.push(object1);
        stack.push(object2);

        // VERIFY
        assertEquals(object2, stack.pop());
        assertEquals(object1, stack.pop());
    }
}