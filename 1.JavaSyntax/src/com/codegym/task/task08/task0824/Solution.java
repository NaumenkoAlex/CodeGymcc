package com.codegym.task.task08.task0824;

/* 
Make a family

*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //ArrayList<Human> list = new ArrayList<>();
        Human child1 = new Human("Alex", true, 23);
        Human child2 = new Human("Dimon", true, 23);
        Human child3 = new Human("Marina", false, 23);

        ArrayList<Human> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        children.add(child3);

        Human mother = new Human("Ira", false,  60, children);
        Human father = new Human("Sasha", true,  59, children);

        ArrayList<Human> children2 = new ArrayList<>();
        ArrayList<Human> children3 = new ArrayList<>();
        children2.add(mother);
        children3.add(father);

        Human grandmother1 = new Human("Nina", false, 89, children2);
        Human grandfather1 = new Human("Pavlo", true, 70, children2);
        Human grandmother2 = new Human("Kate", false, 80, children3);
        Human grandfather2 = new Human("Vova", true, 87, children3);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(grandmother1);
        System.out.println(grandfather1);
        System.out.println(grandmother2);
        System.out.println(grandfather2);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
