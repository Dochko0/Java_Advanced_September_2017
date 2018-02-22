package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NestedLoopsToRecursion {
    private static int n;
    private static int[] loops;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(bf.readLine());
        loops = new int[n];
        simulateLoops(0);
    }

    private static void simulateLoops(int i) {
        if(i==n){
            printLoop();
            return;
        }
        for (int j = 1; j <= n; j++) {
            loops[i]=j;
            simulateLoops(i+1);
            
        }
    }
    private static void printLoop() {
        System.out.println(Arrays.toString(loops).replaceAll("[\\]\\[,]", ""));
    }
}
