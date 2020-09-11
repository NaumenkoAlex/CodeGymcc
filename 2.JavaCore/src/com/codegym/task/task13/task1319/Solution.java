package com.codegym.task.task13.task1319;

import java.io.*;

/* 
Writing to a file from the console

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        while (true){
            String data = reader.readLine();
            writer.write(data);
            writer.newLine();
            if (data.equals("exit"))
                break;


        }

        reader.close();
        writer.close();
    }
}
