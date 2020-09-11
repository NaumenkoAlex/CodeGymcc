package com.codegym.task.task07.task0716;

import java.util.ArrayList;

/* 
R or L

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("love"); // 1
        list.add("lyre"); // 2
        list.add("wade"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for (int i = 0; i < list.size(); ) {
            String s = list.get(i);
            if (s.contains("r") && s.contains("l")){
                i++;
            }
            else if (s.contains("r"))
                list.remove(s);
            else if (s.contains("l")) {
                list.add(i + 1, s);
                i = i + 2;
            }
            else
                i++;
        }
        return list;
    }
}