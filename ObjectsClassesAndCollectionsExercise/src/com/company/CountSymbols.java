package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] line = input.nextLine().split("");
        List<String> symbols = new ArrayList<>();
        for (int i = 0; i < line.length; i++) {
            symbols.add(line[i]);
        }

        TreeMap<String, Integer> letters = new TreeMap<>();

        if (symbols.size()!=0){
            for (int i = 0; i < symbols.size(); i++) {
                String letter = symbols.get(i);
                symbols.remove(i);
                int index = 1;
                while (symbols.contains(letter)){
                    index++;
                    symbols.remove(letter);
                }
               letters.put(letter , index);
                i=-1;
            }
        }
        for (String key : letters.keySet()) {
            System.out.println(key + ": " + letters.get(key) + " time/s");
        }
    }
}
