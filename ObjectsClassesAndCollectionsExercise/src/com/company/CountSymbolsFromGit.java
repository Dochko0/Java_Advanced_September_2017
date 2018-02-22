package com.company;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbolsFromGit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        TreeMap<Character, Integer> occurrences = new TreeMap<>();

        String text = input.nextLine();

        for (int i = 0; i < text.length(); i++) {
            Character symbol = text.charAt(i);
            if (!occurrences.containsKey(symbol)) {
                occurrences.put(symbol, 1);
            } else {
                Integer numberOfOccurences = occurrences.get(symbol);
                occurrences.put(symbol, ++numberOfOccurences);
            }
        }
        for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
            System.out.printf("%s: %d time/s\n", entry.getKey(), entry.getValue());
        }

    }
}
