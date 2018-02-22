package com.company;

import java.util.Scanner;

public class ModifyABit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int p = input.nextInt();
        int v = input.nextInt();
        int result=0;

        if(v==0){
            int mask = ~(1<<p);
            result = n & mask;
        }
        else if(v==1){
            int mask = 1<<p;
            result = n | mask;
        }
        System.out.println(result);
    }
}
