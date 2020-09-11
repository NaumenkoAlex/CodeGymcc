package com.codegym.task.task21.task2106;

import java.util.Date;
import java.util.Objects;

/* 
Bug in equals/hashCode

*/
public class Solution {
    private int anInt;
    private String string;
    private double aDouble;
    private Date date;
    private Solution solution;

    public Solution(int anInt, String string, double aDouble, Date date, Solution solution) {
        this.anInt = anInt;
        this.string = string;
        this.aDouble = aDouble;
        this.date = date;
        this.solution = solution;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (!(o instanceof Solution)) {
            return false;
        }
        Solution n = (Solution) o;
        return Objects.equals(anInt, n.anInt) && Objects.equals(string, n.string) && Objects.equals(aDouble, n.aDouble)
                && Objects.equals(date, n.date) && Objects.equals(solution, n.solution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anInt, string, aDouble, date, solution);
    }

    public static void main(String[] args) {

    }
}
