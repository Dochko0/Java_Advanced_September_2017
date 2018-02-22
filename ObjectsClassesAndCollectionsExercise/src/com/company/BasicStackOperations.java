package com.company;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int smallest = Integer.MAX_VALUE;

        int[] firstLine = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Deque<Integer> stack = new ArrayDeque<>();
        String[] arr = input.nextLine().split(" ");
        for (int i = 0; i < firstLine[0]; i++) {
            stack.push(Integer.parseInt(arr[i]));
        }
        for (int i = 0; i < firstLine[1]; i++) {
            stack.pop();
        }
        if (stack.contains(firstLine[2])){
            System.out.println("true");
        }
        else{
            if(stack.isEmpty()){
                smallest=0;
            }else {
                for (int i = 0; i < stack.size(); i++) {
                    int a = stack.pop();
                    if (a < smallest) {
                        smallest = a;
                    }
                }
            }
            System.out.println(smallest);
        }
    }
}
