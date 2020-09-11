package com.codegym.task.task18.task1810;

/* 
DownloadException

*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String file = sc.nextLine();
            FileInputStream inputStream = new FileInputStream(file);
            if (inputStream.available() < 1000) {
                inputStream.close();
                throw new DownloadException();
            } else {
                while (inputStream.available() > 0) {
                    int data = inputStream.read();
                }
                inputStream.close();
                //  throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
