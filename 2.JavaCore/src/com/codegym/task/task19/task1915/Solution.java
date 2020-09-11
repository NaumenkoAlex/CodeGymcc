package com.codegym.task.task19.task1915;

/* 
Duplicate text

*/

import java.io.*;


public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        testString.printSomething();
        System.setOut(consoleStream);

        String text = outputStream.toString();
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        fileOutputStream.write(outputStream.toByteArray());

        System.out.println(text);

        fileOutputStream.close();


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("This is text for testing");
        }
    }
}

