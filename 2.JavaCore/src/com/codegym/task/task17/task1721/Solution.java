package com.codegym.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Transactionality

*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> linesForRemoval = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        FileReader fr1 = new FileReader(file1);
        FileReader fr2 = new FileReader(file2);

        BufferedReader bfr1 = new BufferedReader(fr1);
        BufferedReader bfr2 = new BufferedReader(fr2);

        while (bfr1.ready()){
            allLines.add(bfr1.readLine());
        }

        while (bfr2.ready()){
            linesForRemoval.add(bfr2.readLine());
        }

        Solution s = new Solution();
        s.joinData();

        fr1.close();
        fr2.close();
        bfr1.close();
        bfr2.close();
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(linesForRemoval))
            allLines.removeAll(linesForRemoval);
        else{
            allLines.clear();
            throw new CorruptedDataException();
        }



    }
}
