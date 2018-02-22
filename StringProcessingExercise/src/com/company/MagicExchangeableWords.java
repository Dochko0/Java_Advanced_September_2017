package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class MagicExchangeableWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] words = input.nextLine().split(" ");
        String first = words[0];
        String second = words[1];

        HashSet<Character> firstSet = new HashSet<>();
        HashSet<Character> secondSet = new HashSet<>();

        for (int i = 0; i < first.length(); i++) {
            firstSet.add(first.charAt(i));
        }
        for (int i = 0; i < second.length(); i++) {
            secondSet.add(second.charAt(i));
        }

        System.out.println(firstSet.size()==secondSet.size()?"true":"false");

    }
}
