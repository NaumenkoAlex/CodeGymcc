package com.codegym.task.task22.task2202;

/*
Find a substring

*/
public class Solution {
    public static void main(String[] args) throws StringTooShortException {
        System.out.println(getPartOfString("CodeGym is the best place to learn Java."));
    }

    public static String getPartOfString(String string) throws StringTooShortException {
        try{
            int indexOfTab = string.indexOf(" ");
            string = string.substring(indexOfTab + 1);
            String[] arr = string.split(" ");
            String lastWord = arr[3];
            int indexOfLast = string.indexOf(lastWord);
            string = string.substring(0, indexOfLast + lastWord.length());
            //indexOfTab = string.lastIndexOf(" ");
            //string = string.substring(0, indexOfTab);
        }
        catch (Exception e){
            throw new StringTooShortException();
        }
        return string;

    }

    public static class StringTooShortException extends RuntimeException {
    }
}