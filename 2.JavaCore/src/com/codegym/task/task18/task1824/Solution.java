package com.codegym.task.task18.task1824;

/* 
Files and exceptions

*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<FileInputStream> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        while(true){
            fileName = reader.readLine();
            try {
                FileInputStream inputStream = new FileInputStream(fileName);
                list.add(inputStream);
            }
            catch (FileNotFoundException e) {
                System.out.println(fileName);
                break;
            }
        }

        for (FileInputStream fis : list) {
            fis.close();
        }
    }
}
