package com.codegym.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()){
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        int num = 0;
        int indexNum = 0;
        int num2 = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (isNumber(array[j]) && num == 0) {
                    num = Integer.parseInt(array[j]);
                    indexNum = j;
                }
                else if (isNumber(array[j]) && num != 0) {
                    num2 = Integer.parseInt(array[j]);
                    if (num2 > num) {
                        String tmp = array[j];
                        array[j] = array[indexNum];
                        array[indexNum] = tmp;
                    }
                    else {
                        num = num2;
                        indexNum = j;
                    }
                }
            }

            num = 0;
            indexNum = 0;
        }

        String s = null;
        int indexOfS = 0;
        String s2;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(!isNumber(array[j]) && s == null){
                    s = array[j];
                    indexOfS = j;
                }
                else if(!isNumber(array[j]) && s != null){
                    s2 = array[j];
                    if (isGreaterThan(s, s2)){
                        String tmp = array[j];
                        array[j] = array[indexOfS];
                        array[indexOfS] = tmp;
                    }
                    else{
                        s = s2;
                        indexOfS = j;
                    }
                }
            }
            s = null;
            indexOfS = 0;
        }
    }

    // String comparison method: 'a' is greater than 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Is the passed string a number?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // The string contains a hyphen
                    || (!Character.isDigit(c) && c != '-') // or is not a number and doesn't start with a hyphen
                    || (i == 0 && c == '-' && chars.length == 1)) // or is a single hyphen
            {
                return false;
            }
        }
        return true;
    }
}
