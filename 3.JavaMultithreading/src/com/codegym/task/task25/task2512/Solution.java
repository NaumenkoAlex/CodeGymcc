package com.codegym.task.task25.task2512;

import java.util.Stack;

/*
Charting our own course

*/
public class Solution implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        t.interrupt();

        Stack<Throwable> stack= new Stack<>();
        stack.push(e);
        Throwable throwable = e.getCause();
        while(throwable != null) {
            stack.push(throwable);
            throwable = throwable.getCause();
        }
        while(!stack.isEmpty()) {
            Throwable currentThrowable = stack.pop();
            System.out.println(currentThrowable.getClass().getName() + ": " + currentThrowable.getMessage());
        }
    }

    public static void main(String[] args) {

    }
}
