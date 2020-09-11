package com.codegym.task.task08.task0815;

import java.util.*;

/* 
Census

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Tom");
        map.put("Dog", "Dog");
        map.put("Eat", "Tom");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        return map;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        Collection<String> collection = map.values();
        int count = 0;
        for (String s : collection) {
            if (s.equals(name))
                count++;
        }

        return count;
    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        Set<String> set = map.keySet();
        int count = 0;
        for (String s : set) {
            if (s.equals(lastName))
                count++;
        }

        return count;

    }

    public static void main(String[] args) {

    }
}
