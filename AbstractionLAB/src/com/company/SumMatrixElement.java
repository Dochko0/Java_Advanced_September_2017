package com.company;

import java.util.Scanner;

public class SumMatrixElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] scanner = input.nextLine().split(", ");
        int rows = Integer.parseInt(scanner[0]);
        int cols = Integer.parseInt(scanner[1]);
        int[][] matrix = new int[rows][cols];
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            String[] rem = input.nextLine().split(", ");
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = Integer.parseInt(rem[j]);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }

        }

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);

    }
}
