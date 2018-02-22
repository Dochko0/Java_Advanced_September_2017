package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class ShuffleBits {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

//        Long firstNumber = Long.parseLong(bf.readLine());
//        Long secondNumber = Long.parseLong(bf.readLine());

        BigInteger firstNumber = new BigInteger(bf.readLine());
        BigInteger secondNumber = new BigInteger(bf.readLine());

        BigInteger result=new BigInteger("0");

        if (firstNumber.compareTo(secondNumber)==1 || firstNumber.compareTo(secondNumber)==0){
            for (int i = 31; i >=0 ; i--) {
                BigInteger currBitFirst = (firstNumber.shiftRight(i)).and(BigInteger.valueOf(1));
                BigInteger currentBitSecond = (secondNumber.shiftRight(i)).and(BigInteger.valueOf(1));;

                result = result.or(currBitFirst.shiftLeft(2*i+1));
                result = result.or(currentBitSecond.shiftLeft(2*i));
            }
        }else{
            for (int i = 31; i >=0 ; i-=2) {
                BigInteger currBitFirst = (firstNumber.shiftRight(i-1)).and(BigInteger.valueOf(3));
                BigInteger currentBitSecond = (secondNumber.shiftRight(i-1)).and(BigInteger.valueOf(3));;

                result = result.or(currBitFirst.shiftLeft(2*i));
                result = result.or(currentBitSecond.shiftLeft(2*i-2));
//                Long currBitFirst = (firstNumber>>i-1)&3;
//                Long currentBitSecond = (secondNumber>>i-1)&3;

//                result = result|(currBitFirst<<(2*i));
//                result = result|(currentBitSecond<<(2*i-2));
            }
        }
        System.out.println(result);
    }
}
