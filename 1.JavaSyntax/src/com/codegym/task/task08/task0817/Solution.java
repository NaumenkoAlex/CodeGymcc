package com.codegym.task.task08.task0817;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
We don't need repeats

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

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код

        HashMap<String, String> copy = new HashMap<String, String>(map); // создаём копию массива
        for (Map.Entry<String, String> pair : copy.entrySet()){          // итератор ?
            int freqeuncy = Collections.frequency(copy.values(), pair.getValue());  // применяем метод Collections.frequency, находит повторения в виде числа > 1
            if (freqeuncy > 1){
                removeItemFromMapByValue(map, pair.getValue()); // если такие имеются то передаём в метод для удаления.
            }

        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
