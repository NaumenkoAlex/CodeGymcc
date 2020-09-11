package com.codegym.task.task14.task1419;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Exception invasion

*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   // The first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new ClassNotFoundException());
        exceptions.add(new FileNotFoundException());
        exceptions.add(new IOException());
        exceptions.add(new InterruptedException());
        exceptions.add(new NumberFormatException());
        exceptions.add(new RuntimeException());
        exceptions.add(new StringIndexOutOfBoundsException());
        exceptions.add(new NullPointerException());

    }
}
