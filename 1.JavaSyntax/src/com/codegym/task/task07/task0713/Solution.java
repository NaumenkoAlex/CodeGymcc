package com.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Playing Javarella

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> divisibleBy3 = new ArrayList<>();
        ArrayList<Integer> divisibleBy2 = new ArrayList<>();
        ArrayList<Integer> divisibleByNone = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(scanner.nextInt());
        }
        scanner.close();

        for (int i = 0; i < list.size(); i++) {
            Integer n = list.get(i);
            if (n % 3 == 0)
                divisibleBy3.add(n);

            if (n % 2 == 0)
                divisibleBy2.add(n);

            if (n % 2 != 0 && n % 3 != 0)
                divisibleByNone.add(n);
        }

        printList(divisibleBy3);
        printList(divisibleBy2);
        printList(divisibleByNone);
    }

    public static void printList(List<Integer> list) {
        for (Integer n : list) {
            System.out.println(n);
        }
    }
}
