package com.codegym.task.task18.task1828;

/* 
Prices 2

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String fileName = console.nextLine();
        console.close();

        if (args.length > 0) {

            String fileContent = "";
            int ID = Integer.parseInt(args[1]);

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {

                while (reader.ready()) {
                    String line = reader.readLine();
                    String stringID = line.substring(0, 8).trim();

                    if (ID == Integer.parseInt(stringID)){

                        if (args[0].equals("-d")) continue;

                        else if (args[0].equals("-u")) {
                            String productName = args[2].length() > 30 ? args[2].substring(0, 30) : args[2];
                            String price = args[3].length() > 8 ? args[3].substring(0, 8) : args[3];
                            String quantity = args[4].length() > 4 ? args[4].substring(0, 4) : args[4];

                            line = String.format("%-8.8s%-30.30s%-8.8s%-4.4s", args[1], productName, price, quantity);
                        }
                    }

                    fileContent += line;
                    if (reader.ready()) fileContent += "\n";
                }
            }
            catch (FileNotFoundException e) { System.out.println("File not found."); }
            catch (IOException e) {}

            //System.out.println(fileContent);

            try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream (fileName))) {
                writer.write(fileContent);
            }
            catch (FileNotFoundException e) { System.out.println("File not found."); }
            catch (UnsupportedEncodingException e) {}
            catch (IOException e) {}
        }
    }
}
