package com.company;

import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        double b = Double.parseDouble(input.next());
        double c = Double.parseDouble(input.next());
        input.nextLine();

        String hexA = Integer.toHexString(a).toUpperCase();
        String paddedWithZero = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');
        String numB = String.format("%10.2f", b);
        String numC = String.format("%-10.3f", c);


        System.out.printf("|%-10s|", hexA);
        System.out.printf("%s|", paddedWithZero);
        System.out.printf(numB+"|");
        System.out.printf(numC + "|");



    }
}
