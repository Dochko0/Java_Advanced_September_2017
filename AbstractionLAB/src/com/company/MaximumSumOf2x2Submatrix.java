package com.company;

import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] scanner = input.nextLine().split(", ");
        int rows = Integer.parseInt(scanner[0]);
        int cols = Integer.parseInt(scanner[1]);
        int[][] matrix = new int[rows][cols];
        //int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            String[] rem = input.nextLine().split(", ");
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = Integer.parseInt(rem[j]);
            }
        }


        int bestSum = Integer.MIN_VALUE;
        int resultRow=0;
        int resultCol=0;
        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if (sum > bestSum) {
                    bestSum = sum;
                    resultRow = row;
                    resultCol = col;
                }
            }
        }

        System.out.printf("%d %d\n", matrix[resultRow][resultCol], matrix[resultRow][resultCol+1]);
        System.out.printf("%d %d\n", matrix[resultRow+1][resultCol], matrix[resultRow+1][resultCol+1]);
        System.out.println(bestSum);
    }
}
