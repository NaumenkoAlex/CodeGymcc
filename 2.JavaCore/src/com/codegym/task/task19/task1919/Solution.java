package com.codegym.task.task19.task1919;

/* 
Calculating salaries

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        TreeMap<String, Double> map = new TreeMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        while (reader.ready()){
            String s = reader.readLine();
            String[] arr = s.split(" ");
            String key = arr[0];
            Double value = Double.parseDouble(arr[1]);
            map.putIfAbsent(key, 0.0);
            map.put(key, map.get(key) + value);
        }

        for (Map.Entry<String, Double> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

        reader.close();
    }
}
