package com.codegym.task.task04.task0414;

/* 
Number of days in the year

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();

        if (year % 4 == 0){
            if (year % 100 != 0)
                System.out.println("Number of days in the year: 366");
            else if (year % 400 == 0 && year % 100 == 0)
                System.out.println("Number of days in the year: 366");
            else
                System.out.println("Number of days in the year: 365");
        }
        else
            System.out.println("Number of days in the year: 365");
    }
}