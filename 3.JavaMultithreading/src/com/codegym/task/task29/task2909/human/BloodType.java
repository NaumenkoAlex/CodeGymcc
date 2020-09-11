package com.codegym.task.task29.task2909.human;

public class BloodType {
    private final int code;

    public int getCode() {
        return code;
    }

    private BloodType(int code) {
        this.code = code;
    }

    public static final BloodType first(){
        return new BloodType(1);
    }

    public static final BloodType second(){
        return new BloodType(2);
    }

    public static final BloodType third(){
        return new BloodType(3);
    }

    public static final BloodType fourth(){
        return new BloodType(4);
    }
}
