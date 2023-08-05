package com.tdd.Stack;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack {
    private final ArrayList<Object> stack;
    final int maxStackSize = 10;

    public Stack() {
        stack = new ArrayList<>();
    }

    public int getSize() {
        return stack.size();
    }

    public Object pop() {
        if(stack.isEmpty()) {
            throw new EmptyStackException();
        }
        var lastElement = stack.get(stack.size() - 1);
        stack.remove(lastElement);

        return lastElement;
    }

    public void push(Object element) {
        if(stack.size() < maxStackSize ) {
            stack.add(element);
        } else {
            throw new RuntimeException("Stack is full");
        }

    }

    public Object peek(){
        return stack.get(stack.size() - 1);
    }


}