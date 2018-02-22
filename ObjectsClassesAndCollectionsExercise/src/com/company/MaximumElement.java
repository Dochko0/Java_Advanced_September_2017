package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MaximumElement {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       // Scanner input = new Scanner(System.in);
        //int n = Integer.parseInt(input.nextLine());
        int n = Integer.parseInt(bf.readLine());
        Deque<Integer> stack = new ArrayDeque<>();
        TreeSet<Integer> numbers = new TreeSet<>();


        for (int i = 0; i < n; i++) {
            //int[] command = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] command = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            switch (command[0]) {
                case 1:
                    stack.push(command[1]);
                    numbers.add(command[1]);
                    break;
                case 2:
                    numbers.remove(stack.peek());
                    stack.pop();
                    break;
                case 3:
                    System.out.println(numbers.last());
                    break;
            }
        }
    }
}
