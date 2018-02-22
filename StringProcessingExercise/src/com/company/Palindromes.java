package com.company;

import java.util.*;

public class Palindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        Set<String> palindromes = new TreeSet<>();
        String[] separatedText = text.split("[^a-zA-Z0-9]");
        for (String s : separatedText) {
            if (s.length()>=1) {
                palindromes.add(s);
            }
        }
        List<String> words = new ArrayList<>();
        for (String p : palindromes) {
            if (!(p).equals(new StringBuilder(p).reverse().toString())) {
                words.add(p);
            }
        }
        System.out.println(words.toString());
    }
}
