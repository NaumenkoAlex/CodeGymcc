package com.codegym.task.task05.task0532;

import java.io.*;
import java.util.Scanner;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 0) {
            int maximum = scanner.nextInt();

            for (int i = 0; i < n - 1; i++) {
                int number = scanner.nextInt();
                maximum = number > maximum ? number : maximum;
            }

            System.out.println(maximum);
        }
    }
}
