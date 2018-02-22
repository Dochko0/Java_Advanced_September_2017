package com.company;

import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        Double firstNum = input.nextDouble();
        Double secondNum = input.nextDouble();
        Double thidrNum = input.nextDouble();

        System.out.printf("%.2f", (firstNum+secondNum+thidrNum)/3);



    }

}
