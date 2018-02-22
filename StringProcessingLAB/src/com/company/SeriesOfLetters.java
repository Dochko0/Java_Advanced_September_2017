package com.company;
import java.util.Scanner;

public class SeriesOfLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String letters = input.nextLine();
        String word = "";

        for (int i = 0; i < letters.length()-1; i++) {

            if (letters.charAt(i)!=letters.charAt(i+1)){
                word = word + String.valueOf(letters.charAt(i));
            }
        }
        System.out.println(word+letters.charAt(letters.length()-1));
    }
}
