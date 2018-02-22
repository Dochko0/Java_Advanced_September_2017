package com.company;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] line = input.nextLine().split("-");
        Map<String, String> phoneBook = new HashMap<>();

        while(!line[0].equals("search")){
            if (!phoneBook.containsKey(line[0])){
                phoneBook.put(line[0], line[1]);
            }
            line=input.nextLine().split("-");
        }

        String searchName = input.nextLine();
        while (!searchName.equals("stop")){
            if (phoneBook.containsKey(searchName)){

                String number = phoneBook.get(searchName);
                System.out.println(searchName + " -> " + number);
            }else{
                System.out.printf("Contact %s does not exist.\n", searchName);
            }
            searchName=input.nextLine();
        }
    }
}
