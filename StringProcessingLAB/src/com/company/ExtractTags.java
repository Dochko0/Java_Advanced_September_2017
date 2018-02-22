package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractTags {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = "";
        while (!word.equals("END")) {
            word = input.nextLine();

           // String regex = "(<[a-zA-Z 0-9 \\-!$%^&*()_+|~=`{}\\[\\]:\";'<>?,.\\/]*?>)";
            String regex = "(<.+?>)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(word);

            while (matcher.find()) {
                System.out.println(matcher.group());
            }

        }


    }
}

