package com.company;

import java.util.Scanner;

public class ReadInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstWord = input.next("\\w+");
        String secondWord = input.next("\\w+");
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();
        int thirdNum = input.nextInt();
        input.nextLine();
        String thirdWord = input.nextLine();

        int sum = firstNum + secondNum + thirdNum;

        System.out.println(firstWord + " " + secondWord + " " + thirdWord + " " + sum);

    }
}
