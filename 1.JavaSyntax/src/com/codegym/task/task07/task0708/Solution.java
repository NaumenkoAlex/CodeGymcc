package com.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Longest string

*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        reader.close();

        int maxLength = strings.get(0).length();
        for (int i = 1; i < strings.size(); i++) {
            maxLength = Math.max(maxLength, strings.get(i).length());
        }

        for (int i = 0; i < strings.size(); i++) {
            if (maxLength == strings.get(i).length())
                System.out.println(strings.get(i));
        }
    }
}
