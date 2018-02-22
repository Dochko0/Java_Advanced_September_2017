package com.company;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();

        BigInteger[][] pascalTriangle = generatePascalTriangle(height);

        for (BigInteger[] nums : pascalTriangle) {
            for (BigInteger n : nums) {
                if (n != null) {
                    System.out.print(n + " ");
                }
            }
            System.out.println();
        }
    }

    private static BigInteger[][] generatePascalTriangle(int height) {
        BigInteger[][] pascalTriangle = new BigInteger[height][height];
        for (int currentHeight = 0; currentHeight < height; currentHeight++) {
            pascalTriangle[currentHeight][0] = BigInteger.ONE;
            pascalTriangle[currentHeight][currentHeight] = BigInteger.ONE;
            if (currentHeight > 1) {
                for (int i = 1; i < currentHeight; i++) {
                    BigInteger[] previousRow = pascalTriangle[currentHeight - 1];
                    BigInteger previousRowSum = previousRow[i].add(previousRow[i - 1]);
                    pascalTriangle[currentHeight][i] = previousRowSum;
                }
            }
        }
        return pascalTriangle;
    }
}