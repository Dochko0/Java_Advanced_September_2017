package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Chocolates {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int packets = Integer.parseInt(bf.readLine());
        int[] arrNums = Arrays.stream(bf.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int students = Integer.parseInt(bf.readLine());

        int temp = 0;

        for (int i = 0; i < arrNums.length; i++) {
            for (int j = 1; j < arrNums.length-i; j++) {
                if (arrNums[j - 1] > arrNums[j]) {
                    temp = arrNums[j - 1];
                    arrNums[j-1]=arrNums[j];
                    arrNums[j]=temp;
                }
            }
        }

        int firstPack = 0;
        int secondPack = students-1;
        int minDiff = Integer.MAX_VALUE;

        for (int i = students-1; i < arrNums.length; i++) {
            if((arrNums[secondPack]-arrNums[firstPack])<minDiff){
                minDiff=(arrNums[secondPack]-arrNums[firstPack]);
            }
            firstPack++;
            secondPack++;
        }

        System.out.println("Min Difference is "+minDiff+".");


    }
}
