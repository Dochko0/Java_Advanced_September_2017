package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        input.nextLine();

        double recArea = a*b;


        System.out.printf("%.2f", recArea);


    }
}
