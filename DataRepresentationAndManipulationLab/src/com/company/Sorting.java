package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Sorting {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = input.readLine().split(" ");

        int[] arrayIntegers = Arrays.stream(numbers).mapToInt(Integer::parseInt).toArray();
        int[] arrayIntegers1 = Arrays.stream(numbers).mapToInt(Integer::parseInt).toArray();

        bubble(arrayIntegers);

        selection(arrayIntegers1);

    }

    private static void selection(int[] arrayIntegers1) {
        int smaller = 0;

        for (int i = 0; i < arrayIntegers1.length; i++) {
            int index=i;
            for (int j = i+1; j < arrayIntegers1.length; j++) {
                if (arrayIntegers1[j]<arrayIntegers1[i]){
                    index=j;
                    smaller = arrayIntegers1[j];
                    arrayIntegers1[i]=arrayIntegers1[j];
                    arrayIntegers1[j]=smaller;
                }
            }
        }
        System.out.println("--------------------------");
        System.out.println(Arrays.toString(arrayIntegers1).replace(",","")
                .replace("]","")
                .replace("[",""));
        System.out.println("-------------------------");



    }

    private static void bubble(int[] arrayIntegers) {
        int temp = 0;

        for (int i = 0; i < arrayIntegers.length; i++) {
            for (int j = 1; j < arrayIntegers.length-i; j++) {
                if (arrayIntegers[j - 1] > arrayIntegers[j]) {
                    temp = arrayIntegers[j - 1];
                    arrayIntegers[j-1]=arrayIntegers[j];
                    arrayIntegers[j]=temp;
                }
            }

        }
        System.out.println(Arrays.toString(arrayIntegers).replace(",","")
                .replace("]","")
                .replace("[",""));
    }
}
