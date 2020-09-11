package com.codegym.task.task19.task1922;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Searching for the right lines

*/

public class Solution {
    public static List<String> words = new ArrayList<>();

    static {
        words.add("file");
        words.add("view");
        words.add("In");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        BufferedReader reader1 = new BufferedReader(new FileReader(fileName));

        while (reader1.ready()){
            String s = reader1.readLine();
            int count = 0;
            for (int i = 0; i < words.size(); i++) {
                if(s.contains(words.get(i)))
                    count++;
            }

            if(count == 2)
                System.out.println(s);
        }

        reader1.close();
    }
}
