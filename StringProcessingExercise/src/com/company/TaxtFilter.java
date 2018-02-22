package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaxtFilter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] banWords = input.nextLine().split(", ");
        String text = input.nextLine();

        for (String banWord : banWords) {
            if(text.contains(banWord)){
                String replacement = new String(new char[banWord.length()]).replace("\0", "*");
                text=text.replaceAll(banWord,replacement);
            }
        }
        System.out.println(text);
    }
}
