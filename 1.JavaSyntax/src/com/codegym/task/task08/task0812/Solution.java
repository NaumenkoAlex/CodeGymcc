package com.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Longest sequence

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextInt());
        }
        scanner.close();

        int maxSequence = 1;
        int currentSequence = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if(list.get(i).equals(list.get(i + 1))) {
                currentSequence++;
                if (currentSequence > maxSequence)
                    maxSequence = currentSequence;
            }
            else
                currentSequence = 1;
        }

        System.out.println(maxSequence);

    }
}