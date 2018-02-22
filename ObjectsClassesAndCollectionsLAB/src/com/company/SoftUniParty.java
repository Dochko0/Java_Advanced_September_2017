package com.company;

import java.util.Scanner;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        TreeSet<String> guest = new TreeSet<>();
        String name = input.nextLine();
        while (!name.equals("PARTY")){
            guest.add(name);
            name = input.nextLine();
        }
        name=input.nextLine();
        while (!name.equals("END")){
            guest.remove(name);
            name=input.nextLine();
        }
        System.out.println(guest.size());
        guest.forEach(System.out::println);
    }
}
