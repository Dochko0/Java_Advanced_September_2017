package com.company;

import java.util.Scanner;

public class HitTheTarget {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int target = Integer.parseInt(input.nextLine());

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <=20 ; j++) {
                if (i+j==target){
                    System.out.printf("%d + %d = %d\n", i , j , target);
                }
            }
        }
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <=20 ; j++) {
                if (i-j==target){
                    System.out.printf("%d - %d = %d\n", i , j , target);
                }
            }
        }
    }
}
