package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;

public class HighScore {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Long> playerPoints = new LinkedHashMap<>();
        Map<String, List<String>> playerOpponents = new HashMap<>();

        while (true){
            String[] line = bf.readLine().split("\\s+");
            if("osu!".equals(line[0])){
                break;
            }
            Integer player1points = Integer.valueOf(line[0]);
            Integer player2Points = Integer.valueOf(line[2]);
            String[] names = line[1].split("<->");

            FillMaps(names[0], names[1], playerOpponents, playerPoints, player1points, player2Points);
            FillMaps(names[1], names[0], playerOpponents, playerPoints, player2Points, player1points);
        }

StringBuilder result = new StringBuilder();
        playerPoints.entrySet().stream().sorted((a,b) -> Long.compare(b.getValue(), a.getValue()))
                .forEach(value-> {
                    result.append(value.getKey()).append(" - (").append(value.getValue()).append(")")
                            .append("\n");
                    playerOpponents.get(value.getKey()).forEach(s -> result.append(s).append("\n"));
                });
        System.out.println(result);
    }

    private static void FillMaps(String name, String name1, Map<String, List<String>> playerOpponents, Map<String, Long> playerPoints, Integer player1points, Integer player2Points) {
        if (!playerPoints.containsKey(name)){
            playerPoints.put(name, 0L);
        }
        playerPoints.put(name,playerPoints.get(name)+(player1points-player2Points));
        if (!playerOpponents.containsKey(name)){
            playerOpponents.put(name, new ArrayList<>());
        }
        playerOpponents.get(name).add("*   "+name1 + " <-> " + (player1points-player2Points));
    }
}
