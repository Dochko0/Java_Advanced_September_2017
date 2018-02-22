package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] line = input.nextLine().split("\\s+");
        String[] value = input.nextLine().split("\\s+");
        int numValue = Integer.parseInt(value[1]);

        List<Integer> numbers = new ArrayList<Integer>();
        for (int index = 0; index < line.length; index++) {
            numbers.add(Integer.parseInt(line[index]));
        }

        int counter = 0;

        for (int i = 0; i < numbers.size() ; i++) {
            if (counter>=numValue){
                break;
            }
            if (value[2].equals("odd") && numbers.get(i)%2!=0){
                counter++;
                    System.out.printf("%d ", numbers.get(i));
            }
            if (value[2].equals("even") && numbers.get(i)%2==0){
                counter++;
                    System.out.printf("%d ", numbers.get(i));
            }
        }
    }
}
