package com.codegym.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    public static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run(){
        for (int i = 1; i <= 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void move(){
        for (int i = 0; i < getHorses().size() ; i++) {
            getHorses().get(i).move();
        }
    }

    public void print(){
        for (int i = 0; i < getHorses().size() ; i++) {
            getHorses().get(i).print();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }
    }

    public Horse getWinner(){
        double maxDistance = 0;
        Horse winner = null;
        for (int i = 0; i < getHorses().size() ; i++) {
            if (getHorses().get(i).distance > maxDistance) {
                maxDistance = getHorses().get(i).distance;
                winner = getHorses().get(i);
            }
        }

        return winner;
    }

    public void printWinner(){
        System.out.printf("The winner is %s!", getWinner().name);
    }


    public static void main(String[] args) {
        ArrayList<Horse> horses = new ArrayList<>();

        //for (int i = 0; i < 3; i++) {
        //    Horse horse = new Horse(String.valueOf(i), 3,0);
        //    horses.add(horse);
        //}

        Horse horse1 = new Horse("Торнадо", 3,0);
        Horse horse2 = new Horse("Снежок", 3,0);
        Horse horse3 = new Horse("Помойка", 3,0);

        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);

        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }
}
