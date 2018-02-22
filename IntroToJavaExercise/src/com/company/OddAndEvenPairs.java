package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] line = input.nextLine().split("\\s+");

        if (line.length % 2 != 0) {
            System.out.println("invalid length");
        }else {

            List<Integer> numbers = new ArrayList<Integer>();

            for (int index = 0; index < line.length; index++) {
                numbers.add(Integer.parseInt(line[index]));
            }
            for (int i = 0; i < numbers.size(); i += 2) {
                if (numbers.get(i) % 2 == 0 && numbers.get(i + 1) % 2 == 0) {
                    System.out.printf("%d, %d -> both are even\n", numbers.get(i), numbers.get(i + 1));
                } else if (numbers.get(i) % 2 != 0 && numbers.get(i + 1) % 2 != 0) {
                    System.out.printf("%d, %d -> both are odd\n", numbers.get(i), numbers.get(i + 1));
                } else {
                    System.out.printf("%d, %d -> different\n", numbers.get(i), numbers.get(i + 1));
                }
            }
        }
    }
}
