package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceExtractor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pattern regex = Pattern.compile("[^.!?\\s][^.!?]*(?:[.!?](?!['\"]?\\s|$)[^.!?]*)*[.!?]?['\"]?(?=\\s|$)");
        String matchWord = input.nextLine();
        String text = input.nextLine();
        Matcher matcher = regex.matcher(text);
        List<String> sentenceArr = new ArrayList<>();

        while (matcher.find()) {
            sentenceArr.add(matcher.group());
        }
        for (String s : sentenceArr) {
            if (s.contains(" " + matchWord+" ")) {
                if (s.contains(".") | s.contains("!") | s.contains("?")) {
                    System.out.println(s);
                }
            }
        }
    }
}
