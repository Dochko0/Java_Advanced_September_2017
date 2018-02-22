package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceTag {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String line = input.nextLine();
        Pattern regex = Pattern.compile("(<a).*(>)[^<]*(<\\/a>)");

        StringBuilder text = new StringBuilder();

        while(!line.equals("END")){
            text.append(line).append("\n");
            line=input.nextLine();
        }
        Matcher matcher = regex.matcher(text.toString());

        while(matcher.find()){
            String rep = matcher.group(0).replace(matcher.group(1), "[URL")
                    .replace(matcher.group(3), "[/URL]")
                    .replace(matcher.group(2), "]");
            text=new StringBuilder(text.toString().replace(matcher.group(0), rep));
        }
        System.out.println(text);


    }
}
