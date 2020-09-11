package com.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Streets and houses

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[15];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        int evenSum = arr[0];
        int oddSum = 0;

        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0)
                evenSum += arr[i];
            else
                oddSum += arr[i];
        }

        String res = evenSum > oddSum ? "Even-numbered houses have more residents." : "Odd-numbered houses have more residents.";
        System.out.println(res);
    }
}
