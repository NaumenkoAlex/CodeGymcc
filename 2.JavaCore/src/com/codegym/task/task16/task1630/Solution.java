package com.codegym.task.task16.task1630;

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        }
        catch (IOException e){

        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }


    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContents());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContents();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface{
        String filename;
        String result = "";

        @Override
        public void setFileName(String fullFileName) {
            this.filename = fullFileName;
        }

        @Override
        public String getFileContents() {
            return result;
        }

        @Override
        public void run() {
            File myFile = new File(filename);
            StringBuilder builder = new StringBuilder();

            try {
                Scanner myReader = new Scanner(myFile);
                while (myReader.hasNextLine()) {
                    builder.append(myReader.nextLine());
                    if (myReader.hasNextLine())
                        builder.append(" ");
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            result = builder.toString();
        }
    }
}
