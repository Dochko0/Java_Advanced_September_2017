package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String inputText = input.nextLine();

        Pattern pattern = Pattern.compile("[AEIOUYaeiouy]");
        Matcher matcher = pattern.matcher(inputText);

        int counter = 0;

        while (matcher.find()){
            counter++;
        }

        System.out.printf("Vowels: %d", counter);

    }
}
