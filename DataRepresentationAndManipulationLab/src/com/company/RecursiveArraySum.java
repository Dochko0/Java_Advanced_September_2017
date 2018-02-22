package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RecursiveArraySum {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        int[] arrNums = Arrays.stream(buff.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int sum = recursiveSum(arrNums, 0);
        System.out.println(sum);
    }

    private static int recursiveSum(int[] arrNums, int index) {
        if (index == arrNums.length - 1) {
            return arrNums[index];
        }
        return arrNums[index] + recursiveSum(arrNums, index + 1);

    }
}
