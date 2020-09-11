package com.codegym.task.task10.task1003;

/* 
Task No. 3 about integer type conversions

*/

public class Solution {
    public static void main(String[] args) {
        float f = (float) 128.50;
        int i = (int) f;
        int b = (int) (i + (byte) f);

        System.out.println(b);
    }
}
