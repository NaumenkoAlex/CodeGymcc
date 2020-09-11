package com.codegym.task.task04.task0424;

/* 
Three numbers

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

        if (a == b)
            System.out.println(3);
        else if (a == c)
            System.out.println(2);
        else if (b == c)
            System.out.println(1);
    }
}
