package com.codegym.task.task18.task1801;

import java.io.FileInputStream;
import java.util.Scanner;

/* 
Maximum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        scanner.close();

        FileInputStream fis = new FileInputStream(filename);
        byte max = 0;
        if (fis.available() != 0)
            max = (byte) fis.read();

        while (fis.available() > 0){
            byte data = (byte) fis.read();
            if (data > max)
                max = data;
        }

        System.out.println(max);
        fis.close();
    }
}
