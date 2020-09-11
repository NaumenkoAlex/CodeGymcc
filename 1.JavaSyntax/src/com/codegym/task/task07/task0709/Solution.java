package com.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Expressing ourselves more concisely

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        reader.close();

        int minLength = strings.get(0).length();
        for (int i = 1; i < strings.size(); i++) {
            minLength = Math.min(minLength, strings.get(i).length());
        }

        for (int i = 0; i < strings.size(); i++) {
            if (minLength == strings.get(i).length())
                System.out.println(strings.get(i));
        }
    }
}
