package com.company;

import java.util.Scanner;

public class CollectTheCoins {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char[][] matrix = new char[4][];
        for (int i = 0; i < 4; i++) {
            char[] currRow = input.nextLine().toCharArray();
            matrix[i] = new char[currRow.length];
            System.arraycopy(currRow, 0, matrix[i], 0, currRow.length);
//            for (int j = 0; j < currRow.length; j++) {
//                matrix[i][j] = currRow[j];
//            }
        }

        char[] moves = input.nextLine().toCharArray();
        int currRow = 0;
        int currCol = 0;

        int coins = 0;
        int walls = 0;
//        if (matrix[currRow][currCol]=='$'){
//            coins++;
//        }

        for (char move : moves) {
            int copyRow = currRow;
            int copyCol = currCol;

            switch (move) {
                case '^':
                    currRow--;
                    break;
                case '>':
                    currCol++;
                    break;
                case 'V':
                    currRow++;
                    break;
                case '<':
                    currCol--;
                    break;
            }

            if (!isInMatrix(currCol, currRow, matrix)) {
                currRow = copyRow;
                currCol = copyCol;
                walls++;
            } else {
                if (matrix[currRow][currCol] == '$') {
                    coins++;
                }
            }
        }
        System.out.println("Coins = " + coins);
        System.out.println("Walls = " + walls);


    }

    private static boolean isInMatrix(int currCol, int currRow, char[][] matrix) {
        return currRow >= 0 && currCol >= 0 && currRow < 4
                && currCol < matrix[currRow].length;
    }
}
