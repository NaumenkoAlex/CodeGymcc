package com.codegym.task.task03.task0325;

import java.io.*;
import java.util.Scanner;

/* 
Financial expectations

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.printf("I will earn $%d per hour", n);
        scanner.close();
    }
}
