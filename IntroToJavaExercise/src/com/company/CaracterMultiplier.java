package com.company;

import java.util.Scanner;

public class CaracterMultiplier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstWord = input.next();
        String secondWord = input.next();
        input.nextLine();

        char[] wordOne = firstWord.toCharArray();
        char[] wordtwo = secondWord.toCharArray();
        char[] lastChar = new char[0];


        int lenghtOfarr = 0;
        if (wordOne.length >= wordtwo.length) {
            lenghtOfarr = wordtwo.length;
            lastChar=wordOne;
        } else {
            lenghtOfarr = wordOne.length;
            lastChar=wordtwo;
        }

        int counter = 0;
        int sum=0;

        for (int i = 0; i < lenghtOfarr; i++) {
            sum = sum+(wordOne[i]*wordtwo[i]);
            counter++;
        }

        for (int j = counter; j < lastChar.length ; j++) {
            sum+=lastChar[j];
        }

        System.out.println(sum);




    }
}
