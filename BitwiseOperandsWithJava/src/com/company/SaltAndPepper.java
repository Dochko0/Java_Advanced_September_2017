package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class SaltAndPepper {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BigInteger inputNumber = new BigInteger(bf.readLine());

        while (true){
            String[] comparing = bf.readLine().split(" ");
            if ("end".equalsIgnoreCase(comparing[0])){
                break;
            }
            Integer moving = Integer.parseInt(comparing[1]);

            if ("salt".equalsIgnoreCase(comparing[0])){
                for (int i = 63; i >=0; i--) {
                    if(i%moving==0){
                        inputNumber = inputNumber.and((BigInteger.valueOf(1).shiftLeft(i)).not());
                    }
                }
            }else{
                for (int k = 63; k >=0; k--) {
                    if (k % moving == 0) {
                        inputNumber = inputNumber.or(BigInteger.valueOf(1).shiftLeft(k));
                    }
                }
            }
        }
        System.out.println(inputNumber);
    }
}
