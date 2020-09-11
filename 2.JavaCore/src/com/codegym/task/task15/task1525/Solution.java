package com.codegym.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
File in a static block

*/

public class Solution {
    public static List<String> lines = new ArrayList<>();

    static {
        try{
            String s;
            FileReader fr = new FileReader(Statics.FILE_NAME);
            BufferedReader reader = new BufferedReader(fr);

            while (reader.ready()){
                s = reader.readLine();
                lines.add(s);
            }

            reader.close();
            fr.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        System.out.println(lines);
    }
}
