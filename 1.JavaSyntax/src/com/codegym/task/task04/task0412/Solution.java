package com.codegym.task.task04.task0412;

/* 
Positive and negative numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n >= 0)
            n *= 2;
        else
            n += 1;

        System.out.println(n);

    }

}