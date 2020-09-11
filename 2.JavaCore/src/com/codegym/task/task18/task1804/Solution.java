package com.codegym.task.task18.task1804;

import java.io.FileInputStream;
import java.util.*;

/* 
Rarest bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        scanner.close();

        FileInputStream fis = new FileInputStream(filename);
        ArrayList<Byte> list = new ArrayList<>();
        while (fis.available() > 0){
            byte data = (byte) fis.read();
            list.add(data);
        }
        fis.close();

        Map<Byte, Integer> map = new HashMap<>();

        for (Byte temp : list) {
            Integer count = map.get(temp);
            map.put(temp, (count == null) ? 1 : count + 1);
        }

        int min = Collections.min(map.values());
        for (Map.Entry<Byte, Integer> entry : map.entrySet()){
            if (entry.getValue() == min)
                System.out.print(entry.getKey() + " ");
        }
    }
}
