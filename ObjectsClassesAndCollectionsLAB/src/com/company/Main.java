package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String expression = input.nextLine();

        ArrayDeque<Integer> stack= new ArrayDeque<>();

        for (int i = 0; i < expression.length(); i++) {
            char currentChar= expression.charAt(i);
            if (currentChar=='('){
                stack.push(i);
            }else if (currentChar==')'){
                System.out.println(expression.substring(stack.pop(), i+1));
            }
        }
    }
}
