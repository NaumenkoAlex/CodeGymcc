package com.codegym.task.task03.task0322;


/* 
Deep and pure love

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();
        System.out.printf("%s + %s + %s = Pure love. Ooo la-la!", name1 , name2, name3);
    }
}