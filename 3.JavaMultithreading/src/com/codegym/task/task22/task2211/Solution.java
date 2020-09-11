package com.codegym.task.task22.task2211;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* 
Changing the encoding

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        String inputFileName = args[0];
        String outputFileName = args[1];
        FileInputStream inputStream = new FileInputStream(inputFileName);
        FileOutputStream outputStream = new FileOutputStream(outputFileName);

        Charset windows1251 = Charset.forName("Windows-1251");
        Charset utf8 = StandardCharsets.UTF_8;

        byte[] buffer = new byte[inputStream.available()];
        if(inputStream.available() > 0){
            inputStream.read(buffer);
            String s = new String(buffer, windows1251);
            buffer = s.getBytes(utf8);
            outputStream.write(buffer);
        }

        inputStream.close();
        outputStream.close();

    }
}
