package com.company;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] dimensions = input.nextLine().split(", ");
        int rows = Integer.parseInt(dimensions[0]);
        Integer[][] matrix = new Integer[rows][];

        if (dimensions[1].equals("A")) {
            matrix = claculateTypeA(rows);
        }
        if (dimensions[1].equals("B")) {
            matrix = calculateTypeB(rows);
        }

        printMatrix(matrix, rows);

    }

    private static void printMatrix(Integer[][] matrix, int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }

    private static Integer[][] calculateTypeB(int rows) {
        Integer[][] matrix = new Integer[rows][rows];
        Integer counter = 1;
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < rows; j++) {
                    matrix[j][i] = counter++;
                }
            } else {
                for (int j = rows-1; j >= 0; j--) {
                    matrix[j][i] = counter++;
                }
            }

        }
        return matrix;
    }

    private static Integer[][] claculateTypeA(int rows) {
        Integer[][] matrix = new Integer[rows][rows];
        Integer counter = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                matrix[j][i] = counter++;
            }
        }
        return matrix;
    }
}
