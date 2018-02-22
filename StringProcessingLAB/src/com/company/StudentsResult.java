package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StudentsResult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] text = input.nextLine().split(", ");
        String[] subText = text[0].split(" - ");
        List<Double> numbers = new ArrayList<>();
        numbers.add(Double.parseDouble(subText[1]));
        numbers.add(Double.parseDouble(text[1]));
        numbers.add(Double.parseDouble(text[2]));

        Double average = numbers.stream().mapToDouble(i -> i).average().getAsDouble();

        System.out.printf("%1$-10s|%2$7s|%3$7s|%4$7s|%5$7s|%n", "Name", "JAdv", "JavaOOP", "AdvOOP", "Average");
        System.out.printf("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|", subText[0]
                , numbers.get(0)
                , numbers.get(1)
                , numbers.get(2)
                , average);
    }
}
