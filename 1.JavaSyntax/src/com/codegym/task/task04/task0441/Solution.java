package com.codegym.task.task04.task0441;


/* 
Somehow average

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

        int min = Math.min(Math.min(a, b) ,c);
        int max = Math.max(Math.max(a, b) ,c);
        int mid ;

        if ((min == a && max == c) || (min == c && max == a))
            mid = b;
        else if ((min == a && max == b) || (min == b && max == a))
            mid = c;
        else
            mid = a;

        System.out.println(mid);


    }
}
