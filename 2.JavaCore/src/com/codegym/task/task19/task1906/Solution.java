package com.codegym.task.task19.task1906;

/* 
Even characters

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader1.readLine();
        String filename2 = reader1.readLine();
        int count = 1;
        FileReader reader = new FileReader(filename1);
        FileWriter writer = new FileWriter(filename2);

        while (reader.ready()){
            int data = reader.read();
            if (count % 2 == 0){
                writer.write(data);
            }

            count++;
        }

        reader1.close();
        reader.close();
        writer.close();
    }
}
