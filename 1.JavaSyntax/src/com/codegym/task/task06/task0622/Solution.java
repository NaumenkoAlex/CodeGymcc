package com.codegym.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Ascending numbers

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (list.get(i) < list.get(j)){
                    int min = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, min);

                }
            }
        }

        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
