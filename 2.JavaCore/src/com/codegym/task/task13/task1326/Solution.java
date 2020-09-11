package com.codegym.task.task13.task1326;

/* 
Sorting even numbers from a file

*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream fIS = new FileInputStream(fileName);
        BufferedReader bR1 = new BufferedReader(new InputStreamReader(fIS));

        //Scanner scanner = new Scanner(fileName);
        ArrayList<Integer> list = new ArrayList<>();

        String s;
        while ((s = bR1.readLine())!=null) {
            if (Integer.parseInt(s) % 2 == 0)
                list.add(Integer.parseInt(s));
        }


        //while (scanner.hasNext()){
        //    int data = scanner.nextInt();
        //    if (data % 2 == 0)
        //        list.add(data);
        //}

        Collections.sort(list);
        for (Integer i : list) {
            System.out.println(i);
        }

        fIS.close();
        bR1.close();
        reader.close();


    }
}
