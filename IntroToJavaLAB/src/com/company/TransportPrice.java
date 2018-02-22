package com.company;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double distance = Double.parseDouble(input.nextLine());
        String timeOfDay = input.nextLine();

        if (distance < 20) {
            if (timeOfDay.equals("day")) {
                double price = distance * 0.79 + 0.70;
                System.out.printf("%.2f", price);
            } else {
                double price = distance*0.9+0.7;
                System.out.printf("%.2f", price);
            }
        }
        else if (distance >= 20 && distance<100) {
            double price = distance * 0.09;
            System.out.printf("%.2f", price);
        }
        else if (distance >= 100) {
            double price = distance * 0.06;
            System.out.printf("%.2f", price);
        }
    }
}
