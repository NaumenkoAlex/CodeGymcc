package com.codegym.task.task25.task2502;

import java.util.*;

/* 
Don't take the car to the shop!

*/
public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() {
            // Init wheels here
            String[] arr = loadWheelNamesFromDB();
            if(arr.length != 4)
                throw new NullPointerException();

            wheels = new ArrayList<>();
            for(String s : arr) {
                if(s.equals(Wheel.FRONT_RIGHT.toString()) || s.equals(Wheel.FRONT_LEFT.toString()) || s.equals(Wheel.BACK_RIGHT.toString()) || s.equals(Wheel.BACK_LEFT.toString()))
                    wheels.add(Wheel.valueOf(s));
                else
                    throw new IllegalArgumentException();
            }
        }


        protected String[] loadWheelNamesFromDB() {
            // This method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) {
    }
}
