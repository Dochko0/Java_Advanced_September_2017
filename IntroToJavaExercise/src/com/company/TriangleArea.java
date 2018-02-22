package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BigInteger ax = input.nextBigInteger();
        BigInteger ay = input.nextBigInteger();
        BigInteger bx = input.nextBigInteger();
        BigInteger by = input.nextBigInteger();
        BigInteger cx = input.nextBigInteger();
        BigInteger cy = input.nextBigInteger();

        BigInteger axPart = ax.multiply(by.subtract(cy));
        BigInteger bxPart = bx.multiply(cy.subtract(ay));
        BigInteger cxPart = cx.multiply(ay.subtract(by));

        BigInteger area = ((axPart.add(bxPart).add(cxPart)).divide(BigInteger.valueOf(2))).abs();

        System.out.println(area);


    }
}
