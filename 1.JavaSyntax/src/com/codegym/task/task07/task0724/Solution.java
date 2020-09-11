package com.codegym.task.task07.task0724;

/* 
Family census

*/

public class Solution {
    public static void main(String[] args) {
        Human grandfather1 = new Human("Pavel", true, 75);
        Human grandmother1 = new Human("Nina", false, 85);
        Human grandfather2 = new Human("Volodya", true, 87);
        Human grandmother2 = new Human("Kate", false, 80);
        Human father = new Human("Sanya", true, 59, grandfather2, grandmother2);
        Human mother = new Human("Ira", false, 60, grandfather1, grandmother1);
        Human child1 = new Human("Alex", true, 22, father, mother);
        Human child2 = new Human("Sasha", false, 23, father, mother);
        Human child3 = new Human("Marina", false, 24, father, mother);

        System.out.println(grandfather1);
        System.out.println(grandmother1);
        System.out.println(grandfather2);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null)
                text += ", father: " + this.father.name;

            if (this.mother != null)
                text += ", mother: " + this.mother.name;

            return text;
        }
    }
}