package com.codegym.task.task24.task2408;

import java.text.SimpleDateFormat;
import java.util.Locale;

public abstract class SuperDog {
    protected String getSuperQuotes() {
        // Add some logic here
        return " *** ";
    }

    protected SimpleDateFormat formatter = new SimpleDateFormat("EEE, dd-MMM-yyyy", Locale.ENGLISH);
}
