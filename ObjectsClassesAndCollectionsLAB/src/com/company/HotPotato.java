package com.company;

import java.util.*;

public class HotPotato {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = input.nextLine().split(" ");
        int num = Integer.parseInt(input.nextLine());

        Deque<String> removeList = new ArrayDeque<>();

        for (int i = 0; i < names.length; i++) {
            removeList.offer(names[i]);
        }

        while (removeList.size() > 1) {
            for (int i = 1; i < num; i++) {
                String element = removeList.poll();
                removeList.offer(element);
            }
            System.out.println("Removed " + removeList.poll());
        }
        System.out.println("Last is " + removeList.poll());
    }
}
