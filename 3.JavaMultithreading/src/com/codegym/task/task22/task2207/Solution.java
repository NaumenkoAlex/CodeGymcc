package com.codegym.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Inverted words

*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        List<String> values = new ArrayList<>();
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(b.readLine()));


        while(bufferedReader.ready()){
            String line = bufferedReader.readLine();
            for(String y : line.split(" ")){
                StringBuilder x = new StringBuilder(y);
                if(values.contains(x.reverse().toString())) {
                    //System.out.println("what");///////
                    values.remove(x.toString());
                    Pair p = new Pair();
                    p.first =y;
                    p.second=x.toString();
                    result.add(p);
                }else values.add(y);

            }

        }

        for (Pair p : result) {
            System.out.println(p);
        }
    }

    /*public static List<Pair> allPAirs (List<String> list){


        return result;

    }

    public static boolean compareTwo(String s1, String s2){
        StringBuilder sb = new StringBuilder();
        sb.append(s2);
        sb.reverse();
        return s1.equals(sb.toString());
    }*/

    public static class Pair {
        String first;
        String second;

        public Pair() {

        }

        public Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;
        }
    }

}