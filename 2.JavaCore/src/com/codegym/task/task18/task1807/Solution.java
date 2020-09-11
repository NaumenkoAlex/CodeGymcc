package com.codegym.task.task18.task1807;

/* 
Counting commas

*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        scanner.close();

        FileInputStream fis = new FileInputStream(filename);
        byte[] buffer = new byte[fis.available()];
        if (fis.available() > 0) {
            int count = fis.read(buffer);
        }

        int numberOfCommas = 0;
        for (int i = 0; i < buffer.length; i++) {
            if (buffer[i] == 44)
                numberOfCommas++;
        }

        System.out.println(numberOfCommas);
        fis.close();
    }
}
