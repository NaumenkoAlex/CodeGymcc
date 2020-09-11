package com.codegym.task.task05.task0502;

/* 
Implement the fight method

*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int cat1Count = 0;
        int cat2Count = 0;

        if (this.age > anotherCat.age)
            cat1Count++;
        else if (this.age < anotherCat.age)
            cat2Count++;
        else if (this.age == anotherCat.age) {
            cat1Count++;
            cat2Count++;
        }


        if (this.weight > anotherCat.weight)
            cat1Count++;
        else if (this.weight  < anotherCat.weight)
            cat2Count++;
        else if (this.weight == anotherCat.weight) {
            cat1Count++;
            cat2Count++;
        }

        if (this.strength > anotherCat.strength)
            cat1Count++;
        else if (this.strength < anotherCat.strength)
            cat2Count++;
        else if (this.strength == anotherCat.strength) {
            cat1Count++;
            cat2Count++;
        }

        return cat1Count > cat2Count;
    }

    public static void main(String[] args) {

    }
}
