package com.codegym.task.task18.task1818;

/* 
Two in one

*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName1 = scanner.nextLine();
        String fileName2 = scanner.nextLine();
        String fileName3 = scanner.nextLine();
        scanner.close();
        FileOutputStream fileOutputStream = new FileOutputStream(fileName1);
        FileInputStream fileInputStream2 = new FileInputStream(fileName2);
        FileInputStream fileInputStream3 = new FileInputStream(fileName3);

        byte[] buffer = new byte[1000];
        while (fileInputStream2.available() > 0){
            int count = fileInputStream2.read(buffer);
            fileOutputStream.write(buffer, 0 , count);
        }
        fileInputStream2.close();

        while (fileInputStream3.available() > 0){
            int count = fileInputStream3.read(buffer);
            fileOutputStream.write(buffer, 0 , count);
        }

        fileInputStream3.close();
        fileOutputStream.close();
    }
}
