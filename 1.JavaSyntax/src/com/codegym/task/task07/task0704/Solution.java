package com.codegym.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Flip the array

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] revArr = new int[arr.length];
        for (int i = 0; i < revArr.length; i++) {
            revArr[i] = arr [9 - i];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = revArr[i];
            System.out.println(arr[i]);
        }


    }
}

