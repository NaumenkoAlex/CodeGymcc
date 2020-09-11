package com.codegym.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Th1());
        threads.add(new Th2());
        threads.add(new Th3());
        threads.add(new Th4());
        threads.add(new Th5());
    }

    public static void main(String[] args) {
        for (int i = 0; i < threads.size(); i++) {
            threads.get(i).start();
        }

    }


    public static class Th1 extends Thread{
        @Override
        public void run() {
            while (true){}
        }
    }

    public static class Th2 extends Thread{
        @Override
        public void run() {
            while(!isInterrupted()){}
            System.out.println("InterruptedException");
        }
    }

    public static class Th3 extends Thread{
        @Override
        public void run() {
            try{
                while (true){
                    System.out.println("Hurray");
                    Thread.sleep(500);
                }
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static class Th4 extends Thread implements Message{
        @Override
        public void run() {
            while (!interrupted()){}
        }

        @Override
        public void showWarning() {
            interrupt();
        }
    }

    public static class Th5 extends Thread{
        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            try{
                while (true){
                    String s = reader.readLine();
                    if (s.equals("N")) {
                        System.out.println(sum);
                        break;
                    }
                    else
                        sum += Integer.parseInt(s);


                    reader.close();

                }
            }
            catch (IOException e){
                e.printStackTrace();
            }


        }
    }
}