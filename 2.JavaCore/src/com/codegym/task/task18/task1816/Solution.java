package com.codegym.task.task18.task1816;

/* 
ABCs

*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        int countEnglishLetters = 0;

        while (inputStream.available() > 0){
            int data = inputStream.read();
            if((65 <= data && data <= 90) || (97 <= data && data <= 122))
                countEnglishLetters++;
        }

        System.out.println(countEnglishLetters);
        inputStream.close();


    }
}
