package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //String[] line = input.nextLine().split(", ");
        String line = input.nextLine();
        Pattern regex = Pattern.compile("(^[a-zA-Z0-9][A-Za-z0-9-_.]+@[A-Za-z0-9-_]+[.]+[.A-Za-z]+)");


        while (!line.equals("end")){
            if (line.endsWith(".")){
                line=line.substring(0, line.length()-1);
            }


            String[] separatedInput = line.split(",\\s+|\\s+");
            for (String s : separatedInput) {
                Matcher matcher = regex.matcher(s);
                if (matcher.find()) {
                    System.out.println(matcher.group().toString());
                }
            }

            line=input.nextLine();
        }
    }
}
