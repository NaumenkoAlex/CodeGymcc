package com.codegym.task.task05.task0504;


/* 
The Three "Muscateers"

*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("lol", 2 , 2 ,2);
        Cat cat2 = new Cat("dol", 3 , 3 ,3);
        Cat cat3 = new Cat("uol", 4 , 4 ,4);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}