package com.codegym.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Vowels and consonants

*/

public class Solution {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();

        char[] array = s.replaceAll(" ", "").toCharArray();
        ArrayList<Character> voWels = new ArrayList<>();
        ArrayList<Character> consonants = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if(isVowel(array[i]))
                voWels.add(array[i]);
            else
                consonants.add(array[i]);
        }

        for (Character c : voWels) {
            System.out.print(c + " ");
        }

        System.out.println("");

        for (Character c : consonants) {
            System.out.print(c + " ");
        }

    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // Convert to lowercase

        for (char d : vowels)   // Look for vowels in the array
        {
            if (c == d)
                return true;
        }
        return false;
    }
}