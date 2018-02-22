package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PopulationCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, LinkedHashMap<String, Long>> countries = new LinkedHashMap<>();

        while (true) {
            String[] line = bf.readLine().split("\\|");
            if ("report".equalsIgnoreCase(line[0])) {
                break;
            }

            if (!countries.containsKey(line[1])) {
                countries.put(line[1], new LinkedHashMap<>());
                countries.get(line[1]).put(line[0], Long.valueOf(0L));
            }
            countries.get(line[1]).put(line[0], Long.valueOf(line[2]));
        }
        HashMap<String, Long> countriesPopulation = new LinkedHashMap<>();
        LinkedHashMap<String, Long> sortedTowns;


        for (String country : countries.keySet()) {

//           sortedTowns = countries
//                    .get(country)
//                    .entrySet()
//                    .stream()
//                    .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
//                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a,b)->a, LinkedHashMap::new));

            StringBuilder result = new StringBuilder();
            Long sum = 0L;
            for (String s : countries.get(country).keySet()) {
                sum+= countries.get(country).get(s);
            }

            countriesPopulation.put(country, sum);
        }
        countriesPopulation.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .forEach(b->{
                    System.out.println(b.getKey() + " (total population: " + b.getValue() + ")");
                    countries.get(b.getKey())
                            .entrySet()
                            .stream()
                            .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                            .forEach(a-> System.out.println("=>"+a.getKey()+ ": " + a.getValue()));
                });
                //.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a,b) -> a,LinkedHashMap::new));
    }
}

//                if (countries.get(line[1]).containsKey(line[0])){
//                    countries.get(line[1]).put(line[0], countries.get(line[1]).get(line[0])+Long.valueOf(line[2]));
//                } else{
//                    countries.get(line[1]).put(line[0],Long)
//                }