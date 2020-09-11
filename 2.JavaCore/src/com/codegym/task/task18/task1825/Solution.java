package com.codegym.task.task18.task1825;


import java.io.*;
import java.util.*;

/* 
Building a file

*/

public class Solution {
    public static void main(String[] args) throws IOException{
        TreeMap<Integer,String> counter = new TreeMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[1];
        String fileName;
        BufferedReader file;
        BufferedWriter fine;
        int count;

        while (true) {
            fileName = reader.readLine();
            if (fileName.contains("end")) break;
            arr = fileName.split(".part");
            count = Integer.parseInt(arr[1]);
            counter.put(count,fileName);
        }
        fine = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(arr[0])));
        reader.close();
        for(Map.Entry<Integer,String> k :counter.entrySet()) {
            file = new BufferedReader(new InputStreamReader(new FileInputStream(k.getValue())));
            while (file.ready()){
                count = file.read();
                fine.write(count);
            }

            file.close();
        }

        fine.close();
    }
}
