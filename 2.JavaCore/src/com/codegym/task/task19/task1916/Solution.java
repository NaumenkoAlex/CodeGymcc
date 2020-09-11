package com.codegym.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file1 = br.readLine();
        String file2 = br.readLine();
        br.close();

        List<String> f1 = new ArrayList<>();
        List<String> f2 = new ArrayList<>();

        br = new BufferedReader(new FileReader(file1));
        while (br.ready()){
            f1.add(br.readLine());
        }
        br.close();

        br = new BufferedReader(new FileReader(file2));
        while (br.ready()){
            f2.add(br.readLine());
        }
        br.close();

        int i = 0;
        int j = 0;
        while (i <= f1.size() - 1 && j <= f2.size() - 1){
            if (f1.get(i).equals(f2.get(j))){
                lines.add(new LineItem(Type.SAME, f1.get(i)));
                i++;
                j++;
            }
            else if (j + 1 < f2.size() && f1.get(i).equals(f2.get(j + 1))){
                lines.add(new LineItem(Type.ADDED, f2.get(j)));
                j++;
            }
            else if (i + 1 <f1.size() && f1.get(i + 1).equals(f2.get(j))){
                lines.add(new LineItem(Type.REMOVED, f1.get(i)));
                i++;
            }
        }
        if (!f1.get(f1.size() - 1).equals(lines.get(lines.size() - 1).line)||!f2.get(f2.size() - 1).equals(lines.get(lines.size() - 1).line)) {
            if (!f1.get(f1.size() - 1).equals(lines.get(lines.size() - 1).line)) {
                lines.add(new LineItem(Type.REMOVED, f1.get(f1.size() - 1)));
            } else if (!f2.get(f2.size() - 1).equals(lines.get(lines.size() - 1).line)) {
                lines.add(new LineItem(Type.ADDED, f2.get(f2.size() - 1)));
            }
        }
//        for (LineItem str:lines){
//            System.out.println(str.type+" "+str.line);
//        }
    }



    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}


