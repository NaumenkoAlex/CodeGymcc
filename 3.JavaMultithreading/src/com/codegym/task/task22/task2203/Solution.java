package com.codegym.task.task22.task2203;

/* 
Between tabs

*/
public class Solution {
    public static String getPartOfString(String string) throws StringTooShortException {
        try{
            int indexOfTab = string.indexOf("\t");
            string = string.substring(indexOfTab + 1);
            indexOfTab = string.indexOf("\t");
            string = string.substring(0, indexOfTab);
        }
        catch (Exception e){
            throw new StringTooShortException();
        }

        return string;
    }

    public static class StringTooShortException extends Exception {
    }

    public static void main(String[] args) throws StringTooShortException {
        System.out.println(getPartOfString("\tCodeGym is the best place \tto learn Java\t."));
    }
}