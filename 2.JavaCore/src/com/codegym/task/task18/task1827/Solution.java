package com.codegym.task.task18.task1827;

/* 
Prices

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        if (args.length == 4) {
            BufferedReader reader1 = new BufferedReader(new FileReader(fileName));
            int id;
            int maxId = 0;
            while (reader1.ready()) {
                id = Integer.parseInt(reader1.readLine().substring(0, 8).trim());
                if (id > maxId) {
                    maxId = id;
                }
            }
            reader1.close();
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.newLine();
            writer.write(String.format("%-8d%-30s%-8s%-4s", maxId + 1, args[1], args[2], args[3]));
            writer.close();
        }
    }
}
