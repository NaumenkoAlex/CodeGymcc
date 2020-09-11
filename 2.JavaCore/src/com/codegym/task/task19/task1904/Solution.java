package com.codegym.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
Yet another adapter

*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private final Scanner fileScanner;
        public Person person;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String firstName = fileScanner.next();
            String middleName = fileScanner.next();
            String lastName = fileScanner.next();
            SimpleDateFormat formatter = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);

            String dateInString = fileScanner.nextLine();
            try {
                Date date = formatter.parse(dateInString);
                person = new Person(lastName, firstName, middleName, date);
            }
            catch (ParseException e) {
                e.printStackTrace();
            }

            return person;
        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }
    }
}
