package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] arrNums = Arrays.stream(bf.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int index = arrNums.length-1;

        reverseArr(arrNums,index);
        System.out.println();
    }

    private static void reverseArr(int[] arrNums, int index) {
        if (index<0){
            return;
        }
        System.out.print(arrNums[index]+" ");
        reverseArr(arrNums, index - 1);
    }
}
