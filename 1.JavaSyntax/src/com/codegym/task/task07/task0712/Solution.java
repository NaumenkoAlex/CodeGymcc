package com.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Shortest or longest

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }
        reader.close();

        int minLength = strings.get(0).length();
        for (int i = 1; i < strings.size(); i++) {
            minLength = Math.min(minLength, strings.get(i).length());
        }

        int min = 0;
        for (int i = 0; i < strings.size(); i++) {
            if (minLength == strings.get(i).length()) {
                min = i;
                break;
            }
        }

        int maxLength = strings.get(0).length();
        for (int i = 1; i < strings.size(); i++) {
            maxLength = Math.max(maxLength, strings.get(i).length());
        }

        int max = 0;
        for (int i = 0; i < strings.size(); i++) {
            if (maxLength == strings.get(i).length()) {
                max = i;
                break;
            }
        }

        String s = max > min ? strings.get(min) : strings.get(max);
        //System.out.println(strings.get(Math.min(min, max))); - another way to sout

        System.out.println(s);
    }
}
