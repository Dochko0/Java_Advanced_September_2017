package com.company;

import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int col = input.nextInt();
        Integer[][] matrix = new Integer[rows][col];
        int maxSum = Integer.MIN_VALUE;
        Integer[][] maxMatrix = new Integer[3][3];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = input.nextInt();
            }
            input.nextLine();
        }


        for (int i = 0; i < rows-2; i++) {
            for (int j = 0; j < col-2; j++) {
                int presentSum = matrix[i][j]+matrix[i][j+1]+matrix[i][j+2]
                        +matrix[i+1][j] +matrix[i+1][j+1]+matrix[i+1][j+2]
                        +matrix[i+2][j]+matrix[i+2][j+1] +matrix[i+2][j+2];
                if (presentSum>maxSum){
                    maxSum=presentSum;
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3 ; l++) {
                            maxMatrix[k][l] = matrix[i+k][j+l];
                        }
                    }
                }
            }
        }
        System.out.printf("Sum = %d\n",maxSum);
        printMaxMatrix(maxMatrix);

    }

    private static void printMaxMatrix(Integer[][] maxMatrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(maxMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
