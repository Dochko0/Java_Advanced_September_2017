package com.company;

import java.util.Scanner;

public class TwoXTwoSquaresOfMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int col = input.nextInt();
        input.nextLine();
        String[][] matrix = new String[rows][col];
        Integer[][] squareOfMatrix = new Integer[2][2];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = input.next();
            }
            input.nextLine();
        }
        int counter = 0;

        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < col - 1; j++) {
                if (matrix[i][j].equals(matrix[i][j + 1]) && matrix[i][j].equals(matrix[i + 1][j]) &&
                        matrix[i][j].equals(matrix[i + 1][j + 1])) {
                    counter++;
//                    int num = matrix[i][j];
//                    for (int k = 0; k < 2; k++) {
//                        for (int l = 0; l < 2; l++) {
//                            squareOfMatrix[k][l] = num;
//                        }
//                    }
                }
                //printMatrix(matrix,rows , col);
                System.out.println(counter);
            }
        }
    }


            //squareMatrix(squareOfMatrix);


//private static void squareMatrix(Integer[][]squareOfMatrix){
//        for(int i=0;i< 2;i++){
//        for(int j=0;j< 2;j++){
//        System.out.print(squareOfMatrix[i][j]+" ");
//        }
//        System.out.println();
//        }
//        }

        private static void printMatrix (String[][]matrix,int rows, int col){
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
