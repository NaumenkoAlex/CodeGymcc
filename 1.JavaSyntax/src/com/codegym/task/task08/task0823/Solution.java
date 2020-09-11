package com.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Going national

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] words =  s.trim().split("\\s+");
        for (int i = 0; i < words.length; i++) {
            String tmp = words[i];
            String res = tmp.substring(0, 1).toUpperCase() + tmp.substring(1);
            words[i] = res;
        }

        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
    }
}
