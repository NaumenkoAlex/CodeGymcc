package com.codegym.task.task04.task0443;


/* 
A name is a name

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        System.out.printf("My name is %s.\n" + "I was born on %d/%d/%d", name, month, day, year);


    }
}
