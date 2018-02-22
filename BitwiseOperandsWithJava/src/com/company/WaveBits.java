//package com.company;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class WaveBits {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//
//        Long num = Long.parseLong(bf.readLine());
//
//        int bestSequenceLenght = 0;
//        int bestSequenceStartIndex = 0;
//        int currentSequenceLenght = 1;
//
//        for (int i = 0; i < 61; i++) {
//            boolean isFirstBitUp = ((num >> i) & 1) == 1;
//            boolean isSecondBitDown = ((num >> i + 1) & 1) == 0;
//            boolean isThirdBitUp = ((num >> i + 2) & 1) == 1;
//
//            boolean isWaveTriple = isFirstBitUp && isSecondBitDown && isThirdBitUp;
//
//            if (isWaveTriple) {
//                currentSequenceLenght += 2;
//
//                if (currentSequenceLenght > bestSequenceLenght) {
//                    bestSequenceStartIndex = i + 2;
//                    bestSequenceLenght = currentSequenceLenght;
//                }
//                i++;
//            } else {
//                currentSequenceLenght = 1;
//            }
//        }
//        int bestSequenceEndIndex = bestSequenceStartIndex - bestSequenceLenght + 1;
//        Long outputNumber = 0L;
//
//        for (int i = 63; i >= 0; i--) {
//            boolean isShouldBeDeletedRange = i <= bestSequenceStartIndex && i >= bestSequenceEndIndex;
//            if (isShouldBeDeletedRange) {
//                outputNumber >>= 1;
//            }else {
//                Long currentBit = num&(1L<<i);
//                outputNumber|=currentBit;
//            }
//        }
//
//        if(bestSequenceLenght==0){
//            System.out.println("No waves found!");
//        }else{
//            System.out.println(outputNumber);
//        }
//    }
//}
