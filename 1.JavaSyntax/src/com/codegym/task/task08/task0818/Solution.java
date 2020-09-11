package com.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Only for the rich

*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Sim", 300);
        map.put("Tom", 600);
        map.put("Arbus", 5000);
        map.put("Baby", 250);
        map.put("Cat", 788);
        map.put("Dog", 45);
        map.put("Eat", 123);
        map.put("Food", 555);
        map.put("Gevey", 666);
        map.put("Hugs", 228);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> pair = iterator.next();
            int salary = pair.getValue();
            if (salary < 500)
                iterator.remove();
        }
    }

    public static void main(String[] args) {

    }
}