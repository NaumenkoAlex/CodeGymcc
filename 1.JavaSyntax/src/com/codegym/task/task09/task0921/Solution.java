package com.codegym.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/* 
Method in a try-catch

*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        try {
            while (scanner.hasNext()) {
                list.add(scanner.nextInt());
            }
        }
        catch (InputMismatchException e){
            scanner.close();
            for (Integer n : list) {
                System.out.println(n);
            }
        }
    }
}
