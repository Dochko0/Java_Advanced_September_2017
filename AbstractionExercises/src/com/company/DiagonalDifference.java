package com.company;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = Integer.parseInt(input.nextLine());
        Integer[][] matrix = new Integer[rows][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                matrix[i][j] = input.nextInt();
            }
            input.nextLine();
        }
        int primaryDiagonal = calculatePrimaryDiagonal(matrix,rows);
        int secondaryDiagonal = calculateSecondaryDiagonal(matrix,rows);
        int sumOfDiagonals = Math.abs(primaryDiagonal-secondaryDiagonal);

        System.out.println(sumOfDiagonals);
    }

    private static int calculateSecondaryDiagonal(Integer[][] matrix, int rows) {
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            sum+=matrix[i][rows-i-1];
        }
        return sum;
    }

    private static int calculatePrimaryDiagonal(Integer[][] matrix, int rows) {
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            sum+=matrix[i][i];
        }
        return sum;
    }
}
