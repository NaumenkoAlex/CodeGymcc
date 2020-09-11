package com.codegym.task.task10.task1013;

/* 
Human class constructors

*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
       private String name;
       private int age;
       private boolean sex;
       private String address;
       private int weight;
       private int height;


        public Human(String name) {
            this.name = name;
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age, boolean sex, String address) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.address = address;
        }

        public Human(String name, int age, boolean sex, String address, int weight) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.address = address;
            this.weight = weight;
        }

        public Human(String name, int age, boolean sex, String address, int weight, int height) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.address = address;
            this.weight = weight;
            this.height = height;
        }

        public Human(int age, boolean sex) {
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int weight, int height) {
            this.name = name;
            this.weight = weight;
            this.height = height;
        }

        public Human(boolean sex, String address) {
            this.sex = sex;
            this.address = address;
        }
    }
}
