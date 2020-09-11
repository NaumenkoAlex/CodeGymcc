package com.codegym.task.task18.task1805;

import java.io.FileInputStream;
import java.util.*;

/* 
Sorting bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        scanner.close();

        FileInputStream fis = new FileInputStream(filename);
        ArrayList<Byte> list = new ArrayList<>();
        while (fis.available() > 0){
            byte data = (byte) fis.read();
            list.add(data);
        }
        fis.close();

        List<Byte> result = new ArrayList<>(new TreeSet<>(list));

        for (Byte b : result) {
            System.out.print(b + " ");
        }

    }
}
