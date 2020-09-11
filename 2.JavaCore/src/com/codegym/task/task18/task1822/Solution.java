package com.codegym.task.task18.task1822;

/* 
Finding data inside a file

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        int neededId = Integer.parseInt(args[0]);
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        scanner.close();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String line;
        while ((line = reader.readLine()) != null){
            String[] numbers = line.split(" ");
            if(neededId == Integer.parseInt(numbers[0])){
                System.out.println(line);
                break;
            }
        }

        reader.close();

    }
}
