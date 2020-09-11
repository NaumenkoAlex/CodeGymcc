package com.codegym.task.task18.task1817;

/* 
Spaces

*/

import java.io.FileInputStream;
import java.io.IOException;


public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int n1 = 0;
        int n2 = 0;
        byte[] buffer = null;

        if (fileInputStream.available() > 0) {
            buffer = new byte[fileInputStream.available()];
            int data = fileInputStream.read(buffer);
        }
        fileInputStream.close();

        n1 = buffer.length;
        for (int i = 0; i < buffer.length; i++) {
            if (buffer[i] == 32)
                n2++;
        }

        double result = n2 * 1.0 / n1 * 100;
        System.out.printf("%.2f", result);

    }
}
