package com.codegym.task.task05.task0507;

/* 
Arithmetic mean

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            int n = scanner.nextInt();
            if (n == -1)
                break;
            sum += n;
            count++;

        }

        System.out.println(sum / 1.f / count);
    }
}

