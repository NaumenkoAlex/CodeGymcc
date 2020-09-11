package com.codegym.task.task18.task1808;

/* 
Splitting a file

*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String filename1 = sc.nextLine();
        String filename2 = sc.nextLine();
        String filename3 = sc.nextLine();
        sc.close();
        FileInputStream fIs = new FileInputStream(filename1);
        FileOutputStream fOs1 = new FileOutputStream(filename2);
        FileOutputStream fOs2 = new FileOutputStream(filename3);


        if (fIs.available() > 0) {
            byte[] buff = new byte[fIs.available()];
            int count = fIs.read(buff);
            if (count % 2 == 0){
                fOs1.write(buff, 0, count / 2);
                fOs2.write(buff, count / 2, count / 2);
            }
            else{
                fOs1.write(buff, 0, count / 2 + 1);
                fOs2.write(buff, count / 2 + 1, count / 2);
            }
        }

        fIs.close();
        fOs1.close();
        fOs2.close();
    }
}
