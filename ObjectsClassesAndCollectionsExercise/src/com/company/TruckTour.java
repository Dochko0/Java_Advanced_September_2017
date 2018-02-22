package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class TruckTour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        Deque<String> petrolDistance = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            petrolDistance.addLast(input.nextLine());
        }

        long index = 0;
        while (true) {
            long petrol = 0;
            String currentCommand = petrolDistance.removeFirst();
            String[] station = currentCommand.split(" ");
            long currentPetrol = Long.parseLong(station[0]);
            long kilometers = Long.parseLong(station[1]);

            petrol += currentPetrol - kilometers;
            if(petrol>=0){
                boolean hasSucceeded=true;

                for (String p : petrolDistance) {
                    String[] stationArgs = p.split(" ");
                    long currPetrolOfTheStation = Long.parseLong(stationArgs[0]);
                    long currKilometers = Long.parseLong(stationArgs[1]);

                    petrol+=currPetrolOfTheStation-currKilometers;
                    if(petrol<0){
                        hasSucceeded=false;
                        break;
                    }
                }
                if(hasSucceeded){
                    System.out.println(index);
                    return;
                }else{
                    petrolDistance.addLast(currentCommand);
                }
            }else {
                petrolDistance.addLast(currentCommand);
            }
                index++;
        }
    }
}
