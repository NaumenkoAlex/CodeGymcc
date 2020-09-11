package com.codegym.task.task19.task1918;

/* 
Introducing tags

*/
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader bf  = new BufferedReader(new FileReader(fileName));
        String s = "";
        while (bf.ready()) {
            s += bf.readLine();
        }

        Document doc = Jsoup.parse(s, "", Parser.xmlParser());
        Elements element = doc.getElementsByTag(args[0]);

        for(Element el: element)
            System.out.println(el);

        bf.close();
    }
}
