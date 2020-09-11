package com.codegym.task.task19.task1909;

/* 
Changing punctuation marks

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader1.readLine();
        String filename2 = reader1.readLine();
        reader1.close();
        BufferedReader reader = new BufferedReader(new FileReader(filename1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename2));

        while (reader.ready()){
            String data = reader.readLine();
            String output = data.replaceAll("\\.", "!");
            writer.write(output);
        }

        reader.close();
        writer.close();
    }
}
