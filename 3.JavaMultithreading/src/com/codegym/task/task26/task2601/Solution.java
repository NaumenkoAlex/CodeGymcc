package com.codegym.task.task26.task2601;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
Read online about the median of a sample

*/
public class Solution {

    public static void main(String[] args) {

    }

    public static Integer[] sort(Integer[] array) {
        // Implement the logic here
        Integer[] copy = array.clone();
        Arrays.sort(copy);
        double median ;

        if (copy.length % 2 != 0)
            median = copy[copy.length / 2];
        else
            median = (copy[copy.length / 2] + copy[copy.length / 2 - 1]) * 0.5;

        System.out.println("The median is " + median);

        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                double result = Math.abs(median - o1) - Math.abs(median - o2);
                if (Math.abs(median - o1) == Math.abs(median - o2)) return o1.compareTo(o2);
                return (int) Math.round(result * 100);
            }
        };

        Collections.sort(Arrays.asList(array), comp) ;

        return array;
    }
}
