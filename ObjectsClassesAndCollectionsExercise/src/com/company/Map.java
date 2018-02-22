//package com.company;
//
//import java.util.Comparator;
//import java.util.HashMap;
//import java.util.TreeMap;
//
//public class Map {
//    public static void main(String[] args) {
//        String[] names = "Ivan, Dimityr, Pesho, Mitko, Krum".split(", ");
//        Integer[] ages = {34, 11, 88, 2, 43};
//
//        HashMap<String, Integer> listOfNames = new HashMap<>();
//        for (int i = 0; i < names.length; i++) {
//            listOfNames.put(names[i], ages[i]);
//        }
//
//        MyComparator comparator = new MyComparator(listOfNames);
//
//        HashMap<String, Integer> newMap = new HashMap<String, Integer>(comparator); //comparator е подчертано в червено?
//        newMap.putAll(listOfNames);
//        System.out.println(newMap);
//
//        //Manipulate values???
//
//
////        for (String s : listOfNames.keySet()) {
////            System.out.printf("%s -> %s\n", s, listOfNames.get(s));
////        }
//
//    }
//}
//
//class MyComparator implements Comparator<Object> {
//
//    private HashMap<String, Integer> map;
//
//    MyComparator(HashMap<String, Integer> map) {
//        this.map = map;
//    }
//
//    public int compare(Object o1, Object o2) {
//
//        if (map.get(o2) == map.get(o1)) {
//            return 1;
//        } else
//            return ((Integer) map.get(o2)).compareTo((Integer)
//                    map.get(o1));
//
//    }
//}
//
