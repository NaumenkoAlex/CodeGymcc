package com.codegym.task.task04.task0417;

/* 
Do we have a pair?

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

        if (a == b && b == c)
            System.out.println(a + " " + b + " " + c);
        else if (a == b && b != c)
            System.out.println(a + " " + b);
        else if (a == c && b != c)
            System.out.println(a + " " + c);
        else if (c == b && a != c)
            System.out.println(c + " " + b);
    }
}