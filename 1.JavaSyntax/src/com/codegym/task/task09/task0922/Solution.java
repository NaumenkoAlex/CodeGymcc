package com.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
What's today's date?

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String date = reader.readLine();
        SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date ConvertedDate = DateFormat.parse(date);
        DateFormat = new SimpleDateFormat("MMM dd, YYYY");
        System.out.println(DateFormat.format(ConvertedDate).toUpperCase());
    }
}
