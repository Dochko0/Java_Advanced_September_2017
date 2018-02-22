package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class TruckTour2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int numberOfPumps = Integer.parseInt(bf.readLine());
        ArrayDeque<String> allPumps = new ArrayDeque<>();

        for (int i = 0; i < numberOfPumps; i++) {
            allPumps.addLast(bf.readLine());
        }

        int counter = 0;
        while (true) {
            Long ourFuel = 0L;
            boolean found = true;
            for (String allPump : allPumps) {
                Long currentFuel = Long.parseLong((allPump.split(" "))[0]);
                Long distance = Long.valueOf((allPump.split(" "))[1]);
                ourFuel += currentFuel;
                if (ourFuel < distance) {
                    allPumps.addLast(allPump);
                    found = false;
                    break;
                }
                ourFuel -= distance;

            }
            if (found) {
                System.out.println(counter);
                break;
            }
            allPumps.addLast(allPumps.pop());
            counter++;
        }
    }
}
