package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String number = input.nextLine();

        while (!number.equals("end")){

            Pattern pattern = Pattern.compile("^\\+359\\s[0-9]{1}\\s[0-9]{3}\\s[0-9]{4}$");
            Pattern pattern2 = Pattern.compile("^\\+359\\-[0-9]{1}\\-[0-9]{3}\\-[0-9]{4}$");
            Matcher matcher1 = pattern.matcher(number);
            Matcher matcher2 = pattern2.matcher(number);

            if(matcher1.matches() || matcher2.matches()){
                System.out.println(number);
            }
            number=input.nextLine();
        }

    }
}
