package com.company;

import java.util.Scanner;

public class TerroristWin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();
        char[] sentence = text.toCharArray();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '|') {
                int lastIndex = 0;
                int sum = 0;
                for (int m = i + 1; m < text.length(); m++) {
                    if (text.charAt(m) == '|') {
                        lastIndex = m;
                        break;
                    }
                    sum += text.charAt(m);
                }
                int dead = sum % 10;

                int killStart = 0;
                int lastkilled = text.length() - 1;

                if (i - dead > killStart) {
                    killStart = i - dead;
                }
                if (lastIndex + dead < lastkilled) {
                    lastkilled = lastIndex + dead;
                }

                for (int j = killStart; j <= lastkilled; j++) {
                    sentence[j] = '.';
                }
                i = lastkilled;
                //text = new String (sentence);
            }
        }
        System.out.printf(new String(sentence));
    }
}
