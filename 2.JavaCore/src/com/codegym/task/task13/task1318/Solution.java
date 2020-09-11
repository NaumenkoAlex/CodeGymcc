package com.codegym.task.task13.task1318;

import java.awt.*;
import java.io.*;
import java.util.Scanner;

/* 
Reading a file

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        InputStream inStream = new FileInputStream(fileName);

        try {
            while (inStream.available() > 0 ) {
                int data = inStream.read(); //read one byte from the input stream
                System.out.print((char)data);
            }

            inStream.close(); //close the streams
        }
        catch(Exception e){
            System.out.println(e);
        }

        finally {
            // releases all system resources from the streams
            inStream.close();
            }

        }
}