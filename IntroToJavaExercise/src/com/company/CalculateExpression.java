package com.company;

import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = Double.parseDouble(input.next());
        double b = Double.parseDouble(input.next());
        double c = Double.parseDouble(input.next());

        double stepenf1 = (a+b+c)/Math.sqrt(c);
        double basef1 = (Math.pow(a,2)+ Math.pow(b,2))/(Math.pow(a,2)- Math.pow(b,2));
        double baseF2 = (Math.pow(a,2) + Math.pow(b,2) - Math.pow(c,3));
        double stepenF2 = a-b;
        double averageABC = (a+b+c)/3;


        double f1 =Math.pow(basef1,stepenf1);
        double f2 = Math.pow(baseF2,stepenF2);
        double averageF1F2 = (f1+f2)/2;

        double result = Math.abs(averageABC-averageF1F2);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", f1,f2,result);

    }
}
