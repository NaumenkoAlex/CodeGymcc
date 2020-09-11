package com.codegym.task.task21.task2107;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Deep cloning of a map

*/
public class Solution implements Cloneable{

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone = null;
        try {
            clone = (Solution) solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }

    protected Map<String, User> users = new LinkedHashMap();

    @Override
    public Object clone() throws CloneNotSupportedException {
        Solution solution1 = (Solution) super.clone();
        Map<String,User> mapClone = new LinkedHashMap<>();
        solution1.users = mapClone;

        Iterator<Map.Entry<String,User>> linkedHashMapIterator = users.entrySet().iterator();
        while(linkedHashMapIterator.hasNext()) {
            Map.Entry<String,User> entry = linkedHashMapIterator.next();
            mapClone.put(entry.getKey(),entry.getValue());
        }
        return solution1;

    }

    public static class User implements Cloneable{
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return new User(this.age, this.name);
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }
    }
}
