package com.codegym.task.task19.task1907;

/* 
Counting words

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader1.readLine();
        reader1.close();
        BufferedReader reader = new BufferedReader(new FileReader(filename1));
        int count = 0;

        while (reader.ready()){
            String data = reader.readLine();;
            String[] output = data.replaceAll("[^a-zA-Z ]", "").split("\\s+");
            for (String s : output) {
                if (s.equals("world"))
                    count++;
            }
        }

        System.out.println(count);
        reader.close();
    }
}
