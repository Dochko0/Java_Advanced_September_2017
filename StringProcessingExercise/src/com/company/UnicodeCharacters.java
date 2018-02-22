package com.company;

import java.util.Scanner;

public class UnicodeCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            String unicode = String.format("\\u%04x", (int) ch);
            System.out.printf("%s",unicode);
        }
    }
}
