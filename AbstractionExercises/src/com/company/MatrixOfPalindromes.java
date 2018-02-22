package com.company;

import java.util.Scanner;


public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();
        input.nextLine();

        String[][] matrix =matrixCreating(row, col);

        printMatrix(matrix, row, col);
    }

    private static void printMatrix(String[][] matrix, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static String[][] matrixCreating(int row, int col) {
        String[][] matrix = new String[row][col];
        char firstLast = 'a';
        char middle = 'a';

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
               // middle= (char) (middle+i+j);
                //firstLast+=i;
                matrix[i][j] = (firstLast)+""+(char)(firstLast+j)+""+(firstLast);
                //matrix[i][j] = (char)(firstLast+i)+""+(char)(middle+i+j)+""+(char)(firstLast+i);

                //firstLast = 'a';
                //middle = 'a';
            }
            firstLast++;
        }
        return matrix;
    }
}
