package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // String[] vowel = {"a", "e", "u", "i", "o", "A", "E", "U", "I", "O",};

        int n = Integer.parseInt(input.nextLine());
        String[] lines = new String[n];
        for (int i = 0; i < n; i++) {
            lines[i] = input.nextLine();
        }

        int[] lineSorted = encryptArray(lines);
        Arrays.sort(lineSorted);

        printArray(lineSorted);
    }

    private static void printArray(int[] lineSorted) {
        for (int i = 0; i < lineSorted.length; i++) {
            System.out.println(lineSorted[i]);
        }
    }

    private static int[] encryptArray(String[] lines) {
        int[] encryptArray = new int[lines.length];
        List<Character> vowels = new ArrayList<>();
        Collections.addAll(vowels, 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        for (int i = 0; i < lines.length; i++) {
            int sum = 0;

            for (int j = 0; j < lines[i].length(); j++) {
                if (vowels.contains(lines[i].charAt(j))) {
                    sum += (int) (lines[i].charAt(j)) * lines[i].length();
                } else {
                    sum += (int) (lines[i].charAt(j)) / lines[i].length();
                }
            }
            encryptArray[i] = sum;
        }
        return encryptArray;

    }
}
