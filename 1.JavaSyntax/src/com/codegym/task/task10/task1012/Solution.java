package com.codegym.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Number of letters

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alphabet
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (char letter : abcArray) {
            alphabet.add(letter);
        }

        // Read in strings
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        reader.close();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < alphabet.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                for (int k = 0; k < list.get(j).length(); k++) {
                    if (alphabet.get(i).equals(list.get(j).charAt(k)))
                        count++;
                }
            }
            map.put(alphabet.get(i), count);
        }

        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }





    }

}
