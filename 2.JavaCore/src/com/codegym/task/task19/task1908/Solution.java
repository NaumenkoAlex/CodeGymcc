package com.codegym.task.task19.task1908;

/* 
Picking out numbers

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
            String data = reader.readLine();;
            System.out.println(data);
            String[] output = data.split(" ");
            for (String s : output) {
                if (s.matches( "\\d+"))
                    writer.write(s + " ");
            }
        }

        reader.close();
        writer.close();
    }
}
