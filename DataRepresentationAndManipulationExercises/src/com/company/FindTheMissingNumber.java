package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindTheMissingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        long num = Integer.parseInt(bf.readLine());
        long[] numbers = Arrays.stream(bf.readLine().split(", ")).mapToLong(Long::parseLong).sorted().toArray();
        long compare = 1;

        for (int i = 0; i < numbers.length; i++) {
            if (compare == numbers[i]) {
                compare++;
            } else {
                break;
            }
        }
        System.out.println(compare);
    }
}
