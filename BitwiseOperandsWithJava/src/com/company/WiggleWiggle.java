package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class WiggleWiggle {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] line = bf.readLine().split(" ");

        for (int i = 0; i < line.length; i += 2) {
            Long firstNum = Long.parseLong(line[i]);
            Long secondNum = Long.parseLong(line[i + 1]);

            for (int k = 0; k < 63; k += 2) {
                if ((firstNum & (1 << k)) == (secondNum & (1 << k))) {
                    continue;
                } else {
                    firstNum ^= (1 << k);
                    secondNum ^= (1 << k);


                    firstNum = firstNum ^ (1 << 63);
                    secondNum = secondNum ^ (1 << 63);


                    System.out.printf(firstNum+ " ");// + String.format("%63", Long.toBinaryString(firstNum)));
                    System.out.println();
                    System.out.printf(secondNum+ " ");// + String.format("%63", Long.toBinaryString(secondNum)));

                }
            }
        }
    }
}
