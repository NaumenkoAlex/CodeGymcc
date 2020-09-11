package com.codegym.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Even and odd digits

*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sN = reader.readLine();
        int n = Integer.parseInt(sN);
        for (int i = 0; i < sN.length(); i++) {
            if (n % 2 == 0)
                even++;
            else
                odd++;

            n /= 10;
        }

        System.out.printf("Even: %d Odd: %d", even, odd);
    }
}
