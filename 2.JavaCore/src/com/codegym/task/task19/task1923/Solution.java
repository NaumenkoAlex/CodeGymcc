package com.codegym.task.task19.task1923;

/* 
Words with numbers

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        StringBuilder res = new StringBuilder();
        FileReader fr = new FileReader(args[0]);
        BufferedReader reader = new BufferedReader(fr);

        while (reader.ready()) {
            String[] s = reader.readLine().trim().split(" ");

            for (String word : s) {
                if (!word.matches("\\D+")) {
                    res.append(word).append(" ");
                }
            }
        }
        fr.close();
        reader.close();

        FileWriter writer = new FileWriter(args[1]);
        writer.write(res.toString());
        writer.close();
    }
}
