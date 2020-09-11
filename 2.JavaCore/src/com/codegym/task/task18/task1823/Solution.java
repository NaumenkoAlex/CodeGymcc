package com.codegym.task.task18.task1823;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Threads and bytes

*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        while (!(fileName = reader.readLine()).equals("exit")){
            ReadThread thread = new ReadThread(fileName);
            thread.start();
        }

        reader.close();
    }

    public static class ReadThread extends Thread {
        public String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try {
                FileInputStream inputStream = new FileInputStream(fileName);
                TreeMap<Integer, Integer> frequencyMap = new TreeMap<>();
                int key;

                while (inputStream.available() > 0){
                    key = inputStream.read();
                    frequencyMap.putIfAbsent(key, 0);
                    frequencyMap.put(key, frequencyMap.get(key) + 1);
                }

                int maxValue = Collections.max(frequencyMap.values());
                int moreFrequentByte = 0;

                for (Map.Entry<Integer, Integer> pair : frequencyMap.entrySet()) {
                    if (pair.getValue().equals(maxValue)) {
                        moreFrequentByte = pair.getKey();
                    }
                }

                resultMap.put(fileName, moreFrequentByte);
                inputStream.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
