package com.codegym.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* 
Shuffled just in time

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        int max;
        int min;
        if (N >= M) {
            max = N;
            min = M;
        }
        else{
            max = M;
            min = N;
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            list.add(reader.readLine());
        }
        reader.close();

        for (int i = 0; i < min; i++) {
            list.add(list.get(i));
        }
        String range = list.get(min);

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            if (s.equals(range))
                break;

            iterator.remove();
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
