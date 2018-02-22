package com.company;

import java.util.Scanner;

public class GameOfNames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int winScore = Integer.MIN_VALUE;
        int n = Integer.parseInt(input.nextLine());
        String winName="";
        for (int i = 0; i < n; i++) {
            String name = input.nextLine();
            int score = Integer.parseInt(input.nextLine());
            char[] separatedName = name.toCharArray();
            for (int j = 0; j < separatedName.length; j++) {
                if (separatedName[j] % 2 == 0) {

                    score += separatedName[j];
                } else {
                    score -= separatedName[j];
                }
            }
            if (score>winScore){
                winScore=score;
                winName=name;
            }
        }
        System.out.println("The winner is " + winName +" - " + winScore +" points");
    }
}
