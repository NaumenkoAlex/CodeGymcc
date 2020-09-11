package com.codegym.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/* 
Factorial

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        BigInteger factorial = BigInteger.ONE;

        if(n < 0 || n > 150)
            factorial = BigInteger.ZERO;
        else {
            for (int i = 1; i < n + 1; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
        }

        return "" + factorial;
    }
}
