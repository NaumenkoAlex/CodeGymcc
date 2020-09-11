package com.codegym.task.task18.task1802;

import java.io.FileInputStream;
import java.util.Scanner;

/* 
Minimum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        scanner.close();

        FileInputStream fis = new FileInputStream(filename);
        byte min = 0;
        if (fis.available() != 0)
            min = (byte) fis.read();

        while(fis.available() > 0){
            byte data = (byte) fis.read();
            if (data < min)
                min = data;
        }
        fis.close();

        System.out.println(min);
    }
}
