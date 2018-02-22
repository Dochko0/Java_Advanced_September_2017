package com.company;
import java.util.Scanner;

public class SequenceInMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int cols = input.nextInt();
        input.nextLine();
        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows ; i++) {
            matrix[i]= input.nextLine().split(" ");
        }

        int maxCount = 0;
        String maxString = "";

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {

                int down = 0;
                String temp2 = matrix[i][j]+", ";
                for (int k = i; k < matrix.length-1; k++) {
                    if (matrix[k][j].equals(matrix[k+1][j])){
                        down++;
                        temp2+=matrix[i][j]+", ";
                    }else {
                        break;
                    }
                }
                if (down>maxCount){
                    maxCount=down;
                    maxString=temp2;
                }

                int count3 = 0;
                String temp3 =  matrix[i][j]+", ";
                for (int k = i; k < Math.min(matrix.length-1, matrix[i].length-1); k++) {
                    if (matrix[k][k].equals(matrix[k+1][k+1])){
                        count3++;
                        temp3+=matrix[k][k]+", ";

                    }else {
                        break;
                    }
                    if (count3>maxCount){
                        maxCount=count3;
                        maxString=temp3;
                    }
                }
            }
            if(maxString.equals("")){
                maxString=matrix[0][0]+",";
            }

        }
        System.out.println(remoweLastChar(maxString));
    }

    private static String remoweLastChar(String str) {
        return str.substring(0, str.length()-2);
    }
}
