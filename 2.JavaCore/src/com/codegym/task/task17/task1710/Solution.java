package com.codegym.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD

*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    public static void main(String[] args) throws ParseException {
        // Start here
        if(args[0].equals("-c"))
        {
            Date date1 = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH).parse(args[3]);
            if(args[2].equals("m")){
                allPeople.add(Person.createMale(args[1],date1));
                System.out.println(allPeople.size() - 1);}
            else{
                allPeople.add(Person.createFemale(args[1],date1));
                System.out.println(allPeople.size() - 1);
            }
        }
        if(args[0].equals("-u"))
        {
            Date date2 = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH).parse(args[4]);
            for(int i = 0; i < allPeople.size();i++)
            {
                if(i == Integer.parseInt(args[1]))
                {
                    allPeople.get(i).setName(args[2]);
                    allPeople.get(i).setBirthDate(date2);
                    if (args[3].equals("m")) {
                        allPeople.get(i).setSex(Sex.MALE);
                    }
                    else
                        allPeople.get(i).setSex(Sex.FEMALE);
                }
            }
        }
        if(args[0].equals("-d"))
        {
            for(int i = 0; i < allPeople.size();i++)
            {
                if(i == Integer.parseInt(args[1]))
                {
                    allPeople.get(i).setSex(null);
                    allPeople.get(i).setBirthDate(null);
                    allPeople.get(i).setName(null);
                }
            }
        }
        if(args[0].equals("-i"))
        {
            for(int i = 0; i < allPeople.size();i++)
            {
                if(i == Integer.parseInt(args[1]))
                {
                    System.out.print(allPeople.get(i).getName()+" ");
                    if(allPeople.get(i).getSex().equals(Sex.MALE))
                        System.out.print("m" + " ");
                    else
                        System.out.print("f" + " ");
                    SimpleDateFormat date3 = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
                    System.out.print(date3.format(allPeople.get(i).getBirthDate()));
                }

            }
        }

    }
}
