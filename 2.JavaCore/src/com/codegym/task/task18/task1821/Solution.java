package com.codegym.task.task18.task1821;

/* 
Symbol frequency

*/


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String filename = args[0];
        FileInputStream inputStream = new FileInputStream(filename);

        TreeMap<Integer,Integer> frequencyMap = new TreeMap<>();
        int key;
        while (inputStream.available() > 0) {
            key = inputStream.read();
            frequencyMap.putIfAbsent(key, 0);
            frequencyMap.put(key, frequencyMap.get(key) + 1);
        }

        for (Map.Entry<Integer, Integer> result : frequencyMap.entrySet()) {
            String str = String.valueOf(Character.toChars(result.getKey()));
            int freq = result.getValue();
            System.out.println(str + " " + freq);
        }

        inputStream.close();

    }
}
