package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class ProductOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n =input.nextInt();
        int m = input.nextInt();
        BigInteger result=new BigInteger("1");

        if(n>=m){
            for (int i = m; i <= n; i++) {
                BigInteger number = new BigInteger("" + i);
                result=result.multiply(number);
            }
        }
        else{
            for (int i = n; i <= m; i++) {
                BigInteger number = new BigInteger("" + i);
                result=result.multiply(number);
            }
        }
        System.out.printf("product[%d..%d] = %d", n , m , result);
    }
}
