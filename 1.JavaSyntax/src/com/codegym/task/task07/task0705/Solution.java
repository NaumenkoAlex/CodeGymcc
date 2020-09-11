package com.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
One large array and two small ones

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        int[] firstHalf = new int[10];
        int[] secondHalf = new int[10];

        for (int i = 0; i < 10; i++) {
            firstHalf[i] = arr[i];
            secondHalf[i] = arr[10 + i];
            System.out.println(secondHalf[i]);
        }
    }
}
