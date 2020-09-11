package com.codegym.task.task04.task0433;


/* 
Seeing dollars in your future

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int i = 1;
        int j = 1;
        while (i <= 10) {
            while (j <= 10){
                System.out.print("$");
                j++;
            }
            System.out.println("");
            j = 1;
            i++;
        }

    }
}
