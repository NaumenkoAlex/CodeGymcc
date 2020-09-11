package com.codegym.task.task22.task2208;

import java.util.Map;

/* 
Build a WHERE query

*/
public class Solution {
    public static void main(String[] args) {

    }
    public static String getQuery(Map<String, String> params) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> pair : params.entrySet()) {
            if(pair.getValue() != null){
                String s = String.format("%s = '%s' and ", pair.getKey(), pair.getValue());
                sb.append(s);
            }
        }
        if(sb.length() > 5){
            sb.delete(sb.length() - 5, sb.length());
        }

        return sb.toString();
    }
}
