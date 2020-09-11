package com.codegym.task.task19.task1926;

/* 
Mirror image

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        BufferedReader reader1 = new BufferedReader(new FileReader(fileName));

        while (reader1.ready()){
            StringBuilder sb = new StringBuilder();
            sb.append(reader1.readLine());
            String result = sb.reverse().toString();
            System.out.println(result);
        }

        reader1.close();
    }
}
