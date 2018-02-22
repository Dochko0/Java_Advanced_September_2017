package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<String> cars = new HashSet<>();

        String[] line = input.nextLine().split(", ");

        while (!line[0].equals("END")) {
            if (line[0].equals("IN")) {
                cars.add(line[1]);
            } else {
                cars.remove(line[1]);
            }
            line = input.nextLine().split(", ");
        }

        if (cars.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            cars.forEach(System.out::println);
        }
    }
}
