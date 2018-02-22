package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class WaveBitsBIGINTEGER {
        public static void main(String[] args) throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            BigInteger num = new BigInteger(bf.readLine());


            int bestSequenceLenght = 0;
            int bestSequenceStartIndex = 0;
            int currentSequenceLenght = 1;

            for (int i = 0; i <= 61; i++) {
                boolean isFirstBitUp = (((num.shiftRight(i)).and(BigInteger.valueOf(1))).equals(BigInteger.valueOf(1)));
                boolean isSecondBitDown = (((num.shiftRight(i + 1)).and(BigInteger.valueOf(1))).equals(BigInteger.valueOf(0)));
                boolean isThirdBitUp = (((num.shiftRight(i + 2)).and(BigInteger.valueOf(1))).equals(BigInteger.valueOf(1)));

                boolean isWaveTriple = isFirstBitUp && isSecondBitDown && isThirdBitUp;

                if (isWaveTriple) {
                    currentSequenceLenght += 2;

                    if (currentSequenceLenght > bestSequenceLenght) {
                        bestSequenceStartIndex = i + 2;
                        bestSequenceLenght = currentSequenceLenght;
                    }
                    i++;
                } else {
                    currentSequenceLenght = 1;
                }
            }
            int bestSequenceEndIndex = bestSequenceStartIndex - bestSequenceLenght + 1;
            BigInteger outputNumber = BigInteger.valueOf(0);

            for (int i = 63; i >= 0; i--) {
                boolean isShouldBeDeletedRange = i <= bestSequenceStartIndex && i >= bestSequenceEndIndex;
                if (isShouldBeDeletedRange) {
                    outputNumber=outputNumber.shiftRight(1);
                }else {
                    BigInteger currentBit = num.and(BigInteger.valueOf(1).shiftLeft(i));
                    outputNumber=outputNumber.or(currentBit);
                }
            }

            if(bestSequenceLenght==0){
                System.out.println("No waves found!");
            }else{
                System.out.println(outputNumber);
            }
        }
    }

