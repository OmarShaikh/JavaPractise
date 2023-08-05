package com.tdd.Stack;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

class StackTest {
    private final Object object1 = new Object();
    private final Object object2 = new Object();

    private Stack stack;

    @BeforeEach
    public void init() {
        stack = new Stack();
    }

    @Test
    public void testPushItemToStack(){
        stack.push(object1);
        assertEquals(object1, stack.peek());
    }

    @Test
    public void testStackFullWhilePushingNewItemToStack(){

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
        assertEquals("Stack is full", thrown.getMessage());
    }

    @Test
    public void testPopItemWhenStackEmpty() {
        Stack emptyStack = new Stack();
        assertThrows(EmptyStackException.class, emptyStack::pop);
    }

    @Test
    public void testPopLastItemPushed() {
        stack.push(object1);
        assertEquals(object1, stack.pop());
    }

    @Test
    public void testPopLastTwoItemsPushed()
    {
        stack.push(object1);
        stack.push(object2);

        assertEquals(object2, stack.pop());
        assertEquals(object1, stack.pop());
    }
}