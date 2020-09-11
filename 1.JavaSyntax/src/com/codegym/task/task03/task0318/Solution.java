package com.codegym.task.task03.task0318;

/* 
Plan to conquer the world

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(reader.readLine());
        String name = reader.readLine();
        System.out.printf("%s will take over the world in %d years. Mwa-ha-ha!", name, age);
    }
}
