package com.codegym.task.task17.task1711;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2

*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<>();
    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd yyyy");

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    public static void main(String[] args) throws ParseException {
        switch (args[0]){
            case "-c" :
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i = i + 3) {
                        Date date = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH).parse(args[i + 2]);
                        if (args[i + 1].equals("m")) {
                            allPeople.add(Person.createMale(args[i], date));
                            System.out.println(allPeople.size() - 1);
                        } else {
                            allPeople.add(Person.createFemale(args[i], date));
                            System.out.println(allPeople.size() - 1);
                        }
                    }
                    break;
                }
            case "-u" :
                synchronized (allPeople) {
                    int idIndex = 1;

                    while (idIndex < args.length) {
                        Person person;
                        int index = Integer.parseInt(args[idIndex]);

                        if (args[idIndex + 2].equals("m")) person = Person.createMale(args[idIndex + 1],
                                simpleDateFormat.parse(args[idIndex + 3]));
                        else person = Person.createFemale(args[idIndex + 1], simpleDateFormat.parse(args[idIndex + 3]));

                        allPeople.set(index, person);

                        idIndex += 4;
                    }
                    break;
                }
            case "-d" :
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        for (int j = 0; j < allPeople.size(); j++) {
                            if (j == Integer.parseInt(args[i])) {
                                allPeople.get(j).setSex(null);
                                allPeople.get(j).setBirthDate(null);
                                allPeople.get(j).setName(null);
                            }
                        }
                    }
                    break;
                }
            case "-i" :
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        for (int j = 0; j < allPeople.size(); j++) {
                            if (j == Integer.parseInt(args[i])) {
                                System.out.print(allPeople.get(j).getName() + " ");
                                if (allPeople.get(j).getSex().equals(Sex.MALE))
                                    System.out.print("m" + " ");
                                else
                                    System.out.print("f" + " ");

                                SimpleDateFormat date3 = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
                                System.out.print(date3.format(allPeople.get(j).getBirthDate()));
                            }

                        }
                        System.out.println("");
                    }
                    break;
                }

        }

    }
}
