package com.codegym.task.task22.task2212;

/* 
Phone number verification

*/
public class Solution {
    public static boolean checkPhoneNumber(String phoneNumber) {
        if (phoneNumber == null)
            return false;
        else{
            return phoneNumber.matches(
                    "^([+][0-9]{12})|"
                            + "([+][0-9]{2}([(]([0-9]{3})[)][0-9]{7}))|"
                            + "([+][0-9]{8}(-[0-9]{2}){2})|"
                            + "(([0-9]{6})-[0-9]{4})|"
                            + "([0-9]{10})$"
            );
        }
        
    }

    public static void main(String[] args) {

    }
}
