package com.company;

import java.util.Scanner;

public class ExtractBitFromInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int position = input.nextInt();

        int mask = num >> position;
        int bit = mask & 1;

        System.out.println(bit);
    }
}
