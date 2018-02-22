package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = input.nextLine().split(" ");
        int num = Integer.parseInt(input.nextLine());

        Deque<String> removeList = new ArrayDeque<>();

        for (int i = 0; i < names.length; i++) {
            removeList.offer(names[i]);
        }

        int counter = 1;
        while (removeList.size() > 1) {
            int counterPrime=0;

            for (int i = 1; i < num; i++) {

                String element = removeList.poll();
                removeList.offer(element);
            }

            for (int j = 1; j <= counter; j++) {
                if (counter%j==0){
                    counterPrime++;
                }
            }
            if (counterPrime>2 || counterPrime==1) {
                System.out.println("Removed " + removeList.poll());

            }else{
                System.out.println("Prime " + removeList.peek());
            }
            counter++;
        }
        System.out.println("Last is " + removeList.poll());
    }

}
