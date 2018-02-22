package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SeriesOfLettersWithMATCHER {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String wordInput = input.nextLine();

        String regex = "([a-zA-Z])\\1*";
        Pattern pattern = Pattern.compile(regex);

        //Pattern pattern = Pattern.compile("([a-zA-Z ])\\1*");
        Matcher matcher = pattern.matcher(wordInput);

        while (matcher.find()) {
            System.out.print(matcher.group(1));
        }
    }
}
