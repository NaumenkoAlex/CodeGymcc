package com.codegym.task.task04.task0429;

/* 
Positive and negative numbers

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

        int countPositive = 0;
        int countNegative = 0;
        if (a > 0)
            countPositive++;
        else if (a < 0)
            countNegative++;

        if (b > 0)
            countPositive++;
        else if (b < 0)
            countNegative++;

        if (c > 0)
            countPositive++;
        else if (c < 0)
            countNegative++;

        System.out.println("Number of negative numbers: " + countNegative);
        System.out.println("Number of positive numbers: " + countPositive);

    }
}
