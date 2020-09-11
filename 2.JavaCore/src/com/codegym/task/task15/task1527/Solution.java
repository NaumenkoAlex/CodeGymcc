package com.codegym.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Request parser

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();

        int n = s.indexOf("?");
        String s1 = s.substring(n + 1);
        String[] list = s1.split("&");

        ArrayList<String> numbers = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            if(list[i].contains("=")){
               int num = list[i].indexOf("=");
               String name = list[i].substring(0, num);
               if (name.equals("obj")){
                   numbers.add(list[i].substring(num + 1));
               }

                System.out.print(name + " ");
            }
            else
                System.out.print(list[i] + " ");
        }

        System.out.println("");

        for (String o : numbers) {
            try {
                alert(Double.parseDouble(o));
            }
            catch (NumberFormatException e){
                alert(o);
            }
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
