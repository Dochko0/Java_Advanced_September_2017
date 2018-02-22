package com.company;

import java.util.Scanner;

public class ParseTags {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String sentence = input.nextLine();

        while (sentence.contains("<upcase>")) {
            int startIndex = sentence.indexOf("<upcase>");
            int lastIndex = sentence.indexOf("</upcase>");

            String toUp = sentence.substring(startIndex + 8, lastIndex);

            sentence = sentence.replaceFirst(toUp, toUp.toUpperCase());
            sentence = sentence.replaceFirst("<upcase>", "");
            sentence = sentence.replaceFirst("</upcase>", "");
        }
        System.out.println(sentence);
    }
}

