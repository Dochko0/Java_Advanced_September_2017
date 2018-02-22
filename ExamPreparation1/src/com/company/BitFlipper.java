package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class BitFlipper {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        Scanner bf = new Scanner(System.in);
        BigInteger num = new BigInteger(bf.readLine());
        //BigInteger num = new BigInteger(bf.nextLine());
        BigInteger seven = new BigInteger("7");
        BigInteger zero = new BigInteger("0");

        for (int i = 0; i <=61; i++) {
            BigInteger threeDigits = num.shiftRight(61-i).and(seven);
            if (threeDigits.equals(seven) || threeDigits.equals(zero)){
                num=num.xor(seven.shiftLeft(61-i));
                i+=2;
            }
        }
        System.out.println(num);
    }
}
