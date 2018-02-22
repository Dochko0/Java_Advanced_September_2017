//package com.company;
//
//import sun.reflect.generics.tree.Tree;
//
//import java.util.*;
//import java.util.stream.Stream;
//
//public class HandsOfCards {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        String[] line = input.nextLine().split(": ");
//        TreeMap<String, Integer> listOfScore = new TreeMap<>();
//        HashMap<String, HashSet<String>> allData = new HashMap<>();
//
//        while (!line[0].equals("JOKER")) {
//            String[] score = line[1].split(", ");
//            if (allData.containsKey(line[0])) {
//
//                HashSet<String> allCard = new HashSet<>();
//                for (String s : score) {
//                    allCard.add(s);
//                }
//                allCard.addAll(allData.get(line[0]));
//                allData.put(line[0], allCard);
//            } else {
//                HashSet<String> allCard = new HashSet<>();
//                for (String s : score) {
//                    allCard.add(s);
//                }
//                allData.put(line[0], allCard);
//            }
//            line = input.nextLine().split(": ");
//        }
//
//        for (String s : allData.keySet()) {
//            String[] score = allData.get(s).toArray(new String[0]);
//            int sum = CalculateSumForPerson(score);
//            listOfScore.put(s, sum);
//        }
//        TreeMap<String, Integer> sortedMap = sortByValue(listOfScore);
//        printMap(sortedMap);
//
//    }
//
//    private static TreeMap<String, Integer> sortByValue(TreeMap<String, Integer> unsortMap) {
//        List<Map.Entry<String, Integer>> list =
//                new LinkedList<Map.Entry<String, Integer>>(unsortMap.entrySet());
//        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
//            public int compare(Map.Entry<String, Integer> o1,
//                               Map.Entry<String, Integer> o2) {
//                return (o1.getValue()).compareTo(o2.getValue());
//            }
//        });
//        HashMap<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
//        for (Map.Entry<String, Integer> entry : list) {
//            sortedMap.put(entry.getKey(), entry.getValue());
//        }
//        return sortedMap;
//    }
//
//    public static <K, V> void printMap(Map<K, V> map) {
//        for (Map.Entry<K, V> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//    }
//
//    private static int CalculateSumForPerson(String[] score) {
//        int sum = 0;
//        HashSet<String> cards = new HashSet<>();
//        for (String s : score) {
//            cards.add(s);
//        }
//
//        for (String s : cards) {
//            String[] splS = s.split("");
//            String first;
//            String second;
//            if (splS.length == 3) {
//                first = splS[0] + splS[1];
//                second = splS[2];
//            } else {
//                first = splS[0];
//                second = splS[1];
//            }
//
//            int firstNum = 0;
//            int secNum = 0;
//            switch (first) {
//                case "2":
//                    firstNum = 2;
//                    break;
//                case "3":
//                    firstNum = 3;
//                    break;
//                case "4":
//                    firstNum = 4;
//                    break;
//                case "5":
//                    firstNum = 5;
//                    break;
//                case "6":
//                    firstNum = 6;
//                    break;
//                case "7":
//                    firstNum = 7;
//                    break;
//                case "8":
//                    firstNum = 8;
//                    break;
//                case "9":
//                    firstNum = 9;
//                    break;
//                case "10":
//                    firstNum = 10;
//                    break;
//                case "J":
//                    firstNum = 11;
//                    break;
//                case "Q":
//                    firstNum = 12;
//                    break;
//                case "K":
//                    firstNum = 13;
//                    break;
//                case "A":
//                    firstNum = 14;
//                    break;
//                default:
//                    break;
//            }
//            switch (second) {
//                case "C":
//                    secNum = 1;
//                    break;
//                case "D":
//                    secNum = 2;
//                    break;
//                case "H":
//                    secNum = 3;
//                    break;
//                case "S":
//                    secNum = 4;
//                    break;
//            }
//            sum += firstNum * secNum;
//        }
//        return sum;
//    }
//}
