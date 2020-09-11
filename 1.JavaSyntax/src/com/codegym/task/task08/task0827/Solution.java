package com.codegym.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* 
Working with dates

*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
        System.out.println(isDateOdd("JANUARY 1 2000"));
        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        Date input = new Date(date);
        /*int year = input.getYear();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(input);
        int year = calendar.get
        System.out.println(year);
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd yyyy");
        String startDate = "JAN 01 " + year;
        Date strtDate = sdf.parse(startDate);
        Date endDate = sdf.parse(date);
        long days = (endDate.getTime() - strtDate.getTime())/(60*60*24*1000);
        return days / 2 != 0;

         */

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(input);
        int day = calendar.get(calendar.DAY_OF_YEAR);
        System.out.println(day);
        return day % 2 != 0;

    }
}
