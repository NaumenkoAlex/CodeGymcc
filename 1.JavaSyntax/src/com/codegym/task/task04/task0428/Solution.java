package com.codegym.task.task04.task0428;

/* 
Positive number

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        int count = 0;
        if (a > 0)
            count++;

        if (b > 0)
            count++;

        if (c > 0)
            count++;

        System.out.println(count);

    }
}
