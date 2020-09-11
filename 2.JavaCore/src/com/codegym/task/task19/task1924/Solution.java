package com.codegym.task.task19.task1924;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Replacing numbers

*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static {
        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(12, "twelve");
    }


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        while (br.ready()) {
            String[] str = br.readLine().split(" ");
            for (String s: str) {
                try {
                    if (map.containsKey(Integer.parseInt(s))) {
                        s = map.get(Integer.parseInt(s));
                    }
                } catch (NumberFormatException e) { }
                System.out.print(s + " ");
            }
            System.out.println("");
        }
        br.close();
    }
}
