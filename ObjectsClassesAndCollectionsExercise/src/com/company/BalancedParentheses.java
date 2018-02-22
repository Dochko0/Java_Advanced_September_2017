package com.company;

import java.util.*;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String parenthes = input.nextLine();

        Deque<Character> allParenthes = new ArrayDeque<>();
        boolean isBalanced = true;

        for (int i = 0; i < parenthes.length(); i++) {
            char a = parenthes.charAt(i);
            if (a == '{' || a == '[' || a == '(') {
                allParenthes.addFirst(a);
            } else {
                if (!allParenthes.isEmpty()) {
                    char first = allParenthes.pop();
                    if (first == '{') {
                        if (a != '}') {
                            isBalanced = false;
                        }
                    } else if (first == '[') {
                        if (a != ']') {
                            isBalanced = false;
                        }
                    }
                    if (first == '(') {
                        if (a != ')') {
                            isBalanced = false;
                        }
                    }
                } else {
                    isBalanced = false;
                }
            }
        }
        if (isBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
