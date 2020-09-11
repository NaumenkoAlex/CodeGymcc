package com.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Kind Emma and the summer holidays

*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Alex", df.parse("JULY 1 1980"));
        map.put("Dimon", df.parse("AUGUST 1 1980"));
        map.put("Marina", df.parse("SEPTEMBER 1 1980"));
        map.put("Alan", df.parse("OCTOBER 1 1980"));
        map.put("Daniil", df.parse("NOVEMBER 1 1980"));
        map.put("Kolya", df.parse("DECEMBER 1 1980"));
        map.put("Jhon", df.parse("JANUARY 1 1980"));
        map.put("Margo", df.parse("FEBRUARY 1 1980"));
        map.put("Nick", df.parse("MARCH 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Calendar calendar = Calendar.getInstance(); // Date.getMonth is deprecated, we use Calendar;

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();//create and intialize a initiator
        while(iterator.hasNext())// check if there is a next element
        {
            Map.Entry<String, Date> entry = iterator.next();

            calendar.setTime(entry.getValue());
            int month = calendar.get(Calendar.MONTH);  // Month from 0 to 11, still clueless
            if (month >= 5 && month < 8)
                iterator.remove();
        }

    }

    public static void main(String[] args) throws ParseException {

    }
}
