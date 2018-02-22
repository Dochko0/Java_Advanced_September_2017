package com.company;

import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstName = input.nextLine();
        String secondName = input.nextLine();

        if (secondName.isEmpty() && firstName.isEmpty()) {
            System.out.printf("Hello, ***** *****!");
        }
        else if (firstName.isEmpty()) {
            System.out.printf("Hello, ***** %s!", secondName);
        } else if (secondName.isEmpty()) {
            System.out.printf("Hello, %s *****!", firstName);
        } else {
            System.out.printf("Hello, %s %s!", firstName, secondName);
        }


    }
}
