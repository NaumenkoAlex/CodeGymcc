package com.codegym.task.task16.task1618;

/* 
Another interruption

*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread testThread = new TestThread();
        testThread.start();
        Thread.sleep(1000);
        testThread.interrupt();
    }

    //write your code here
    public static class TestThread extends Thread{

    }
}