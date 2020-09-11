package com.codegym.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/* 
John Johnson

*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        while (reader.ready()) {
            String line = reader.readLine();
            String name = line.replaceAll("[0-9]","").trim();
            String date = line.replaceAll("[^0-9 ]","").trim();
            PEOPLE.add(new Person(name,new SimpleDateFormat("MM dd yyyy").parse(date)));
        }
        reader.close();
    }
}
