package com.codegym.task.task04.task0427;

/* 
Describing numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (1 <= n && n <= 999 ) {
            if (n % 2 == 0)
                System.out.print("even ");
            else
                System.out.print("odd ");


            String s = "" + n;

            if (s.length() == 1)
                System.out.println("single-digit number");
            else if (s.length() == 2)
                System.out.println("two-digit number");
            else if (s.length() == 3)
                System.out.println("three-digit number");
        }

    }
}
