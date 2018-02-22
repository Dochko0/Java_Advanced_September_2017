package com.company;

import java.util.*;

public class AcademyGradiation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Map<String, Double> graduation = new TreeMap<>();

        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i < n; i++) {
            String name = input.nextLine();
            String[] scores = input.nextLine().split(" ");
            Double avg = 0.0;
            for (int j = 0; j < scores.length; j++) {
                avg += Double.parseDouble(scores[j]);
            }
            avg = avg / scores.length;
            graduation.put(name, avg);
        }
        for (String s : graduation.keySet()) {
            System.out.println(s + " is graduated with " + graduation.get(s));
        }
    }
}
