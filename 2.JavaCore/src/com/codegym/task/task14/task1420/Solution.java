package com.codegym.task.task14.task1420;

/* 
GCD

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        if(a <=0 || b <= 0){
            System.out.println("Please input positive numbers!");
            throw new IllegalArgumentException();
        }

        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);


        System.out.println(gcd.intValue());
    }
}
