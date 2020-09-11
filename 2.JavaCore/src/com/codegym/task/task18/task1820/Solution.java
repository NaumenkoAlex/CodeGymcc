package com.codegym.task.task18.task1820;

/* 
Rounding numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName1 = scanner.nextLine();
        String fileName2 = scanner.nextLine();
        BufferedReader reader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2));

        String line;

        while((line = reader.readLine()) != null) {
            String[] numbers = line.split(" ");

            for(String num : numbers) {
                try {
                    double wholeDouble = Math.round(Double.parseDouble(num));
                    int realDouble = (int) wholeDouble;
                    double fractional = wholeDouble - realDouble;
                    int res;
                    if (fractional < 0.5 || fractional < -0.5)
                        res = (int) Math.floor(wholeDouble);
                    else
                        res = (int) Math.ceil(wholeDouble);

                    writer.write(res + " ");
                }
                catch(NumberFormatException e) {
                    System.out.println(e);
                }
            }
        }

        reader.close();
        writer.close();

    }
}
