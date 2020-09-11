package com.codegym.task.task19.task1917;

/* 
Your own FileWriter

*/

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

public class FileConsoleWriter {
    private FileWriter fileWriter;

    public static void main(String[] args) {

    }

    //CONSTRUCTORS

    public FileConsoleWriter(String name) throws IOException {
        this.fileWriter = new FileWriter(name);
    }

    public FileConsoleWriter(String name, boolean append) throws IOException {
        this.fileWriter = new FileWriter(name, append);
    }

    public FileConsoleWriter(File file) throws IOException {
        this.fileWriter = new FileWriter(file);
    }

    public FileConsoleWriter(File file, boolean append) throws IOException {
        this.fileWriter = new FileWriter(file, append);
    }

    public FileConsoleWriter(FileDescriptor fodeu) throws IOException {
        this.fileWriter = new FileWriter(fodeu);
    }

    //METHODS

    public void write(char[] cbuf, int off, int len) throws IOException {
        fileWriter.write(cbuf, off, len);
        for(int i = 0; i < len; i++)
            System.out.print(cbuf[off + i]);
    }

    public void write(int c) throws IOException {
        fileWriter.write(c);
        System.out.println(c);
    }

    public void write(String str) throws IOException {
        fileWriter.write(str);
        System.out.println(str);
    }

    public void write(String str, int off, int len) throws IOException {
        fileWriter.write(str, off, len);
        System.out.println(str.substring(off, off + len));
    }

    public void write(char[] cbuf) throws IOException {
        fileWriter.write(cbuf);
        for(char c : cbuf)
            System.out.print(c);
    }

    public void close() throws IOException {
        fileWriter.close();
    }
}
