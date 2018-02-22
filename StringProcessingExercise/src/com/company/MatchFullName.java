package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String names = in.nextLine();

        while   (!names.equals("end")) {
            Pattern pattern = Pattern.compile("^[A-Z][a-z]+ [A-Z][a-z]+$");
            Matcher matcher = pattern.matcher(names);
            if (matcher.matches()) {
                System.out.println(names);
            }
            names = in.nextLine();
        }
    }
}
