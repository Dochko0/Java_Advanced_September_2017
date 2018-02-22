package com.company;

import java.util.*;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] commands = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //int smallest = Integer.MAX_VALUE;
        Deque<Integer> arrNum = new ArrayDeque<>();

        for (int i = 0; i < commands[0]; i++) {
            arrNum.add(arr[i]);
        }
        for (int i = 0; i < commands[1]; i++) {
            arrNum.pop();
        }

        if (arrNum.contains(commands[2])) {
            System.out.println("true");
        } else if (arrNum.size() != 0) {
            System.out.println(Collections.min(arrNum));
        }
            else {
            System.out.printf("0");
        }
    }
}
