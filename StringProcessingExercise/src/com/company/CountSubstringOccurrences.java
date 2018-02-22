package com.company;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String sentence = input.nextLine().toLowerCase();
        String matchWord = input.nextLine().toLowerCase();

        Pattern pattern = Pattern.compile(matchWord);
        Matcher matcher = pattern.matcher(sentence);
        int counter = 0;

        while (matcher.find()){
            counter++;
        }
        System.out.println(counter);
    }
}
