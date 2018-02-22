package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DragonArmy {
    private static int DEFAULT_DAMAGE = 45;
    private static int DEFAULT_HEALTH = 250;
    private static int DEFAULT_ARMOR = 10;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int numberOfDragons = Integer.parseInt(bf.readLine());

        LinkedHashMap<String, TreeMap<String, int[]>> dragons = new LinkedHashMap<>();

        for (int i = 0; i < numberOfDragons; i++) {
            String[] line = bf.readLine().split("\\s+");
            String type = line[0];
            String dragonName = line[1];
            Integer damage = line[2].equals("null") ? DEFAULT_DAMAGE : Integer.valueOf(line[2]);
            Integer health = line[3].equals("null") ? DEFAULT_HEALTH : Integer.valueOf(line[3]);
            Integer armor = line[4].equals("null") ? DEFAULT_ARMOR : Integer.valueOf(line[4]);

            if (!dragons.containsKey(type)) {
                dragons.put(type, new TreeMap<String, int[]>());
            }
            dragons.get(type).put(dragonName, new int[]{damage, health, armor});
        }
        for (Map.Entry<String, TreeMap<String, int[]>> allDragons : dragons.entrySet()) {
            alculateAndPrintAverage(allDragons.getValue(), allDragons.getKey());

            for (Map.Entry<String, int[]> stringEntry : allDragons.getValue().entrySet()) {
                System.out.println("-" + stringEntry.getKey() + " -> damage: " + stringEntry.getValue()[0]
                        + ", health: " + stringEntry.getValue()[1] + ", armor: " + stringEntry.getValue()[2]);
            }
        }
    }

    private static void alculateAndPrintAverage(TreeMap<String, int[]> value, String color) {
        Double averageDamage = 0.0;
        Double averageHealth = 0.0;
        Double averageArmor = 0.0;

        for (int[] ints : value.values()) {
            averageDamage += ints[0];
            averageHealth += ints[1];
            averageArmor += ints[2];
        }
        averageDamage /= value.size();
        averageHealth /= value.size();
        averageArmor /= value.size();


        System.out.printf("%s::(%.2f/%.2f/%.2f)%n", color, averageDamage, averageHealth, averageArmor);

    }
}
