package com.company;

import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rows = input.nextInt();
        int cols = input.nextInt();
        input.nextLine();
        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j]=input.next();
            }
            input.nextLine();
        }

        String[] move = input.nextLine().split(" ");


        while(!move[0].equals("END")){
            try{
                int firstCoordinateX = Integer.parseInt(move[2]);
                int firstCoordinateY = Integer.parseInt(move[1]);
                int secondCoordinateX = Integer.parseInt(move[4]);
                int secondCoordinateY = Integer.parseInt(move[3]);

                if (firstCoordinateX>=0 && firstCoordinateX<=cols &&
                        firstCoordinateY>=0 && firstCoordinateY<=rows &&
                        secondCoordinateX>=0 && secondCoordinateX<=cols &&
                        secondCoordinateY>=0 && secondCoordinateY<=rows){
                    String firstElement = matrix[firstCoordinateY][firstCoordinateX];
                    String secondElement = matrix[secondCoordinateY][secondCoordinateX];

                    matrix[firstCoordinateY][firstCoordinateX] = secondElement;
                    matrix[secondCoordinateY][secondCoordinateX] = firstElement;
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            System.out.print(matrix[i][j]+ " " );
                        }
                        System.out.println();
                    }
                }else{
                    System.out.println("Invalid input!");
                }
            }
            catch (Exception o){
                System.out.println("Invalid input!");
            }

            move = input.nextLine().split(" ");

        }
    }
}
