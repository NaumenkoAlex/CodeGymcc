package com.codegym.task.task18.task1809;

/* 
Reversing a file

*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String filename1 = sc.nextLine();
        String filename2 = sc.nextLine();
        FileInputStream fIs = new FileInputStream(filename1);
        FileOutputStream fOs = new FileOutputStream(filename2);

        while (fIs.available() > 0){
            byte[] buffer = new byte[fIs.available()];
            int count = fIs.read(buffer);
            for (int i = 0; i < buffer.length / 2; i++) {
                byte tmp = buffer[i];
                buffer[i] = buffer[buffer.length - i - 1];
                buffer[buffer.length - i - 1] = tmp;
            }
            fOs.write(buffer, 0, count);

        }

        fIs.close();
        fOs.close();

    }
}
