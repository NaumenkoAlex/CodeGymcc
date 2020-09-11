package com.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Lonely arrays interact

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] sarr = new String[10];
        int[] narr = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < sarr.length; i++) {
            sarr[i] = reader.readLine();
            narr[i] = sarr[i].length();
        }

        reader.close();

        for (int i = 0; i < narr.length; i++) {
            System.out.println(narr[i]);
        }
    }
}
