package com.company;

import java.util.Scanner;

public class XBits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] binaryNumbers = new String[8];
        for (int i = 0; i < binaryNumbers.length; i++) {
            String binary = String.format("%32s", Integer.toBinaryString(Integer.parseInt(input.nextLine()))).replace(" ", "0");
            binaryNumbers[i] = binary;
        }
int counter=0;
        for (int j = 0; j < binaryNumbers.length-2; j++) {
            for (int k = 0; k < binaryNumbers[j].length()-2; k++) {
                String a = binaryNumbers[j].charAt(k)+""+binaryNumbers[j].charAt(k+1)+""+binaryNumbers[j].charAt(k+2);
                String b = binaryNumbers[j+1].charAt(k)+""+binaryNumbers[j+1].charAt(k+1)+""+binaryNumbers[j+1].charAt(k+2);
                String c = binaryNumbers[j+2].charAt(k)+""+binaryNumbers[j+2].charAt(k+1)+""+binaryNumbers[j+2].charAt(k+2);
                if (a.equals("101") && b.equals("010") && c.equals("101")){
                    counter++;
                }
            }
        }
        System.out.println(counter);

    }
}
