package com.codegym.task.task18.task1826;

/* 
Encryption

*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[1]);
        FileOutputStream outputStream = new FileOutputStream(args[2]);
        int result = 0;

        while (inputStream.available() > 0){
            int data = inputStream.read();
            if(args[0].equals("-e"))
                result = data + 1;
            else if (args[0].equals("-d"))
                result = data - 1;

            outputStream.write(result);
        }

        inputStream.close();
        outputStream.close();
    }

}
