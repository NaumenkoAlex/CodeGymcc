package com.codegym.task.task15.task1517;

/* 
Static modifiers and exceptions

*/

import java.io.IOException;

public class Solution {
    public static int A = 0;

    static {
        if(true)
            throw new RuntimeException();// Throw an exception here
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
