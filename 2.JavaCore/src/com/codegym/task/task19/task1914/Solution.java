package com.codegym.task.task19.task1914;

/* 
Problem solving

*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws Exception{
        PrintStream out = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream output = new PrintStream(outputStream);
        System.setOut(output);

        testString.printSomething();

        String ourTestString = outputStream.toString();
        System.setOut(out);

        String[] str = ourTestString.split(" ");

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[2]);
        int c = 0;
        switch (str[1]){
            case "+":
                c = a + b;
                break;
            case "-":
                c = a - b;
                break;
            case "*":
                c = a * b;
                break;
        }
        str[4] = String.valueOf(c);

        String s = Arrays.toString(str).replaceAll("[\\[\\],]", "");
        System.out.println(s);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

