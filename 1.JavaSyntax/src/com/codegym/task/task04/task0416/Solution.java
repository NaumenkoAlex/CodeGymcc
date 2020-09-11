package com.codegym.task.task04.task0416;

/* 
Crossing the road blindly

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        float time = scanner.nextFloat();
        scanner.close();

        if (0 <= time % 5 && time % 5 < 3)
            System.out.println("green");
        else if (3 <= time % 5 && time % 5 < 4)
            System.out.println("yellow");
        else
            System.out.println("red");


    }
}