package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class MultiplyBigInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BigInteger num1 = new BigInteger(bf.readLine());
        BigInteger num2 = new BigInteger(bf.readLine());

        BigInteger num3 = num1.multiply(num2);

        System.out.println(num3);


    }
}
