package com.company;

import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstBigN = input.nextLine();
        String secondBigN = input.nextLine();

        StringBuilder result = new StringBuilder();

        int additive = 0;

        for (int i = 1; i <= Math.min(firstBigN.length(), secondBigN.length()) ; i++) {

            String numOne = firstBigN.substring(firstBigN.length() - i, firstBigN.length() - i + 1);
            String numTwo = secondBigN.substring(secondBigN.length() - i, secondBigN.length() - i + 1);

            int digitOne = Integer.parseInt(numOne);
            int digitTwo = Integer.parseInt(numTwo);

            result.append((digitOne + digitTwo + additive) % 10);
            if ((digitOne + digitTwo + additive) >= 10) {
                additive = 1;
            } else {
                additive = 0;
            }
        }
        for (int i = firstBigN.length()>secondBigN.length() ?firstBigN.length()-secondBigN.length()-1
             : secondBigN.length()-firstBigN.length()-1; i >=0 ; i--) {
            int digit = Integer.parseInt(firstBigN.length() > secondBigN.length() ?
                    firstBigN.substring(i, i + 1) :
                    secondBigN.substring(i, i + 1));
            result.append((digit + additive) % 10);
            if (digit + additive >= 10) {
                additive = 1;
            } else {
                additive = 0;
            }
        }
        if (additive != 0) {
            result.append(additive);
        }
        while (result.toString().endsWith("0")){
            result.delete(result.length()-1, result.length());
        }
        System.out.println(result.reverse().toString());
    }
}
